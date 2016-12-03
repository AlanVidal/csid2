import java.lang.reflect.Field;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertToJson {

	private static String unwrapp(Object obj) throws IllegalArgumentException, IllegalAccessException {
		Field[] fields = obj.getClass().getFields(); 
														
		String lValue = "{";
		for (Field f : fields) {

			if (f.getClass().isPrimitive() || f.getType() == "".getClass() || f.getType() == int.class)
				lValue += "\"" + f.getName() + "\"" + ":\"" + f.get(obj).toString() + "\"";

			else {
				lValue += ",\""+ f.get(obj).getClass().getName()+"\":" + unwrapp(f.get(obj))+"," ;
			}
		}
		return lValue +"}";
	}

	public static String convert(Object obj) throws IllegalArgumentException, IllegalAccessException {
		String value = "";
		value = unwrapp(obj);
		System.out.println(value);
		return value;
	}

	public static String convert(String str) throws IllegalArgumentException, IllegalAccessException {
		String value = "";
		value = "{String:\"" + str + "\"}";
		System.out.println(value);
		return value;
	}

	public static String jacksonString(Book book) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		String jsonS = mapper.writeValueAsString(book);
		return jsonS;
	}

}
