import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json1108 {

	public static void main(String[] args) {
		String jsonStr ="{\r\n"
				+ "\"clients\": [\r\n"
				+ "{\r\n"
				+ "\"id\": \"59761c23b30d971669fb42ff\",\r\n"
				+ "\"isActive\": true,\r\n"
				+ "\"age\": 36,\r\n"
				+ "\"name\": \"Dunlap Hubbard\",\r\n"
				+ "\"gender\": \"male\",\r\n"
				+ "\"company\": \"CEDWARD\",\r\n"
				+ "\"email\": \"dunlaphubbard@cedward.com\",\r\n"
				+ "\"phone\": \"+1 (890) 543-2508\",\r\n"
				+ "\"address\": \"169 Rutledge Street, Konterra, Northern Mariana Islands, 8551\"\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"id\": \"59761c233d8d0f92a6b0570d\",\r\n"
				+ "\"isActive\": true,\r\n"
				+ "\"age\": 24,\r\n"
				+ "\"name\": \"Kirsten Sellers\",\r\n"
				+ "\"gender\": \"female\",\r\n"
				+ "\"company\": \"EMERGENT\",\r\n"
				+ "\"email\": \"kirstensellers@emergent.com\",\r\n"
				+ "\"phone\": \"+1 (831) 564-2190\",\r\n"
				+ "\"address\": \"886 Gallatin Place, Fannett, Arkansas, 4656\"\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"id\": \"59761c23fcb6254b1a06dad5\",\r\n"
				+ "\"isActive\": true,\r\n"
				+ "\"age\": 30,\r\n"
				+ "\"name\": \"Acosta Robbins\",\r\n"
				+ "\"gender\": \"male\",\r\n"
				+ "\"company\": \"ORGANICA\",\r\n"
				+ "\"email\": \"acostarobbins@organica.com\",\r\n"
				+ "\"phone\": \"+1 (882) 441-3367\",\r\n"
				+ "\"address\": \"697 Linden Boulevard, Sattley, Idaho, 1035\"\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}";
		
		try {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject)jsonParser.parse(jsonStr);
//			System.out.println(jsonObject);
			JSONArray clientsArr = (JSONArray) jsonObject.get("clients");
//			System.out.println(clientsArr);
			JSONObject client0 = (JSONObject) clientsArr.get(0);
			JSONObject client1 = (JSONObject) clientsArr.get(1);
			JSONObject client2 = (JSONObject) clientsArr.get(2);
//			System.out.println(client0);
//			for(int i=0; i<clientsArr.size(); i++) {
//				System.out.println(clientsArr.get(i));
//				JSONObject client = (JSONObject) clientsArr.get(i);
//				System.out.println(client.get("id"));
//				System.out.println(client.get("isActive"));
//				System.out.println(client.get("age"));
//				System.out.println(client.get("name"));
//				System.out.println(client.get("gender"));
//				System.out.println(client.get("company"));
//				System.out.println(client.get("email"));
//				System.out.println(client.get("phone"));
//				System.out.println(client.get("address"));
//			}
			
//			System.out.println(client0.get("id"));
//			System.out.println(client0.get("isActive"));
//			System.out.println(client0.get("age"));
//			System.out.println(client0.get("name"));
//			System.out.println(client0.get("gender"));
//			System.out.println(client0.get("company"));
//			System.out.println(client0.get("email"));
//			System.out.println(client0.get("phone"));
//			System.out.println(client0.get("address"));
//			
//			System.out.println(client1.get("id"));
//			System.out.println(client1.get("isActive"));
//			System.out.println(client1.get("age"));
//			System.out.println(client1.get("name"));
//			System.out.println(client1.get("gender"));
//			System.out.println(client1.get("company"));
//			System.out.println(client1.get("email"));
//			System.out.println(client1.get("phone"));
//			System.out.println(client1.get("address"));
//			
//			System.out.println(client2.get("id"));
//			System.out.println(client2.get("isActive"));
//			System.out.println(client2.get("age"));
//			System.out.println(client2.get("name"));
//			System.out.println(client2.get("gender"));
//			System.out.println(client2.get("company"));
//			System.out.println(client2.get("email"));
//			System.out.println(client2.get("phone"));
//			System.out.println(client2.get("address"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		String jsonStr2 = "{\r\n"
				+ "\"jsonapi\": { \"version\": \"1.0\" },\r\n"
				+ "\"errors\": [\r\n"
				+ "{\r\n"
				+ "\"code\": \"123\",\r\n"
				+ "\"source\": { \"pointer\": \"/data/attributes/firstName\" },\r\n"
				+ "\"title\": \"Value is too short\",\r\n"
				+ "\"detail\": \"First name must contain at least two characters.\"\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"code\": \"225\",\r\n"
				+ "\"source\": { \"pointer\": \"/data/attributes/password\" },\r\n"
				+ "\"title\": \"Passwords must contain a letter, number, and punctuation character.\",\r\n"
				+ "\"detail\": \"The password provided is missing a punctuation character.\"\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"code\": \"226\",\r\n"
				+ "\"source\": { \"pointer\": \"/data/attributes/password\" },\r\n"
				+ "\"title\": \"Password and password confirmation do not match.\"\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}";
		
		try {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject)jsonParser.parse(jsonStr2);
			System.out.println(jsonObject);
			JSONObject jsonapiObj = (JSONObject) jsonObject.get("jsonapi");
			System.out.println(jsonapiObj.get("version"));
			
			JSONArray errorsArr = (JSONArray) jsonObject.get("errors");
			for(int i =0; i<errorsArr.size(); i++) {
				JSONObject errors = (JSONObject) errorsArr.get(i);
				System.out.println(errors.get("code"));
				JSONObject errSrc = (JSONObject) errors.get("source");
				System.out.println(errSrc.get("pointer"));
				System.out.println(errors.get("title"));
				System.out.println(errors.get("detail"));
			}
//			JSONObject error0 = (JSONObject) errorsArr.get(0);
//			System.out.println(error0.get("code"));
//			JSONObject errSrc = (JSONObject) error0.get("source");
//			System.out.println(errSrc.get("pointer"));
//			System.out.println(error0.get("title"));
//			System.out.println(error0.get("detail"));
//			
//			JSONObject error1 = (JSONObject) errorsArr.get(1);
//			System.out.println(error1.get("code"));
//			JSONObject errSrc1 = (JSONObject) error1.get("source");
//			System.out.println(errSrc1.get("pointer"));
//			System.out.println(error1.get("title"));
//			System.out.println(error1.get("detail"));
//			
//			JSONObject error2 = (JSONObject) errorsArr.get(2);
//			System.out.println(error2.get("code"));
//			JSONObject errSrc2 = (JSONObject) error2.get("source");
//			System.out.println(errSrc2.get("pointer"));
//			System.out.println(error2.get("title"));
//			System.out.println(error2.get("detail"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
