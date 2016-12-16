import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToObject {

	public static Book convert(String str) throws JsonParseException, JsonMappingException, IOException,
			IllegalArgumentException, IllegalAccessException {
		
		ObjectMapper mapper = new ObjectMapper();
		Book book =  mapper.readValue(str, Book.class);

		return book;
	}

}
