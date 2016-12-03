import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class TestConvertToJson {

	// Convertit un string en JSON
	@Test
	public void TestConvertionString() throws IllegalArgumentException, IllegalAccessException {
		String stringDeTest = "test";
		String StringTojson = ConvertToJson.convert(stringDeTest);
		Assert.assertEquals("{String:\"test\"}", StringTojson);

	}

	// Convertit un objet en Json, la methode est surchargé pour gerer les
	// differens types/
	@Test
	public void testConvertion() throws IllegalArgumentException, IllegalAccessException {
		Author author = new Author("Egan", 50);
		Book book = new Book("Isolation", author, 100);
		String ObjectToJson = ConvertToJson.convert(book);
		Assert.assertEquals(
				"{\"bookName\":\"Isolation\",\"Author\":{\"authorName\":\"Egan\"\"age\":\"50\"},\"nbrPage\":\"100\"}",
				ObjectToJson);
	}

	// Convertit un json en objet, pas fini

	@Test
	public void testJsonToObjectJackson() throws JsonParseException, JsonMappingException, IOException,
			IllegalArgumentException, IllegalAccessException {
		Author author = new Author("Egan", 50);
		Book book = new Book("Isolation", author, 100);
		String str = ConvertToJson.jacksonString(book);
		String resultat = JsonToObject.convert(str);
		Assert.assertEquals(
				"{\"bookName\":\"Isolation\",\"Author\":{\"authorName\":\"Egan\"\"age\":\"50\"},\"nbrPage\":\"100\"}",
				resultat);

	}
	// Convertit n'importe quoi en Json en passant par Jackson

	@Test
	public void testObjectToJsonJackson() throws JsonProcessingException {
		Author author = new Author("Greg", 50);
		Book book = new Book("Isolation", author, 100);
		String str = ConvertToJson.jacksonString(book);
		System.out.println(str);
		Assert.assertEquals(
				"{\"bookName\":\"Isolation\",\"auther\":{\"authorName\":\"Greg\",\"age\":50},\"nbrPage\":100}", str);
	}

}
