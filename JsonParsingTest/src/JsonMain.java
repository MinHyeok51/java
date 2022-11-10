import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.ParseException;
import java.time.LocalDateTime;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonMain {

	public static void main(String[] args) {

		//covid19 select
		Dao dao = new Dao();
		//		List<Covid19Status> covidInfo = dao.selectCovid19Status();
		//		for(Covid19Status cs : covidInfo) {
		//			System.out.println(cs.toString());
		//		}

		//covid19 update
		//		Covid19Status cs =new Covid19Status();
		//		cs.cnt_deaths = 20;
		//		cs.cnt_severe_symptoms = 20;
		//		cs.cnt_hospitalizations = 20;
		//		cs.cnt_confirmations = 20;
		//		dao.updateCovid19Status(cs);

		//covid19 insert && merge
		try {
			Dao covidDao = new Dao();

			String jsonCOVID = getCovide19StatusJson();
			JSONParser jsonParserC = new JSONParser();
			JSONObject jsonObjC = (JSONObject)jsonParserC.parse(jsonCOVID);
			JSONObject resObj = (JSONObject) jsonObjC.get("response");
			JSONArray resultArr = (JSONArray) resObj.get("result");
			for(int i =0; i<resultArr.size(); i++) {
				JSONObject resultObj =(JSONObject) resultArr.get(i);
				System.out.println(resultObj.get("rate_confirmations"));
				System.out.println(resultObj.get("cnt_confirmations"));
				System.out.println(resultObj.get("cnt_severe_symptoms"));
				System.out.println(resultObj.get("rate_deaths"));
				System.out.println(resultObj.get("cnt_hospitalizations"));
				System.out.println(resultObj.get("rate_severe_symptoms"));
				System.out.println(resultObj.get("rate_hospitalizations"));
				System.out.println(resultObj.get("cnt_deaths"));
				System.out.println(resultObj.get("mmddhh"));

				Covid19Status cs = new Covid19Status();
				//1.String으로 그냥 넣기
				//				cs.mmddhh = (String) resultObj.get("mmddhh"); //String인 경우
				//2.현재시간 그대로 넣기
				//				cs.status_date = LocalDateTime.now();
				//3.mmddhh기반으로 넣기
				String mmddhh = resultObj.get("mmddhh").toString(); 
				System.out.println(mmddhh);
				System.out.println(mmddhh.substring(0, 2));
				System.out.println(mmddhh.substring(3, 5));
				System.out.println(mmddhh.substring(6, 8));

				//				System.out.println(mmddhh.split("\\.")[0]);
				//				System.out.println(mmddhh.split("\\.")[1]);
				int mm =Integer.parseInt(mmddhh.substring(0, 2));
				int dd = Integer.parseInt(mmddhh.substring(3, 5));
				int yy = LocalDateTime.now().getYear();

				cs.status_date = LocalDateTime.of(yy, mm, dd, 0, 0);
				cs.cnt_deaths = Integer.parseInt((String) resultObj.get("cnt_deaths")) ;
				cs.cnt_severe_symptoms = Integer.parseInt((String) resultObj.get("cnt_severe_symptoms"));
				cs.cnt_hospitalizations = Integer.parseInt((String) resultObj.get("cnt_hospitalizations"));
				cs.cnt_confirmations = Integer.parseInt((String) resultObj.get("cnt_confirmations"));
				//			
				//				cs.cnt_deaths = 11;
				//				cs.cnt_severe_symptoms = 20;
				//				cs.cnt_hospitalizations = 30;
				//				cs.cnt_confirmations = 253;
				covidDao.mergeCovid19Status(cs);
				//				covidDao.updateCovid19Status(cs);

			}
			//			System.out.println(resObj.get("resultCnt"));
			//			System.out.println(resObj.get("resultCode"));
			//			System.out.println(resObj.get("resultMsg"));
		} catch (IOException |  org.json.simple.parser.ParseException e1) {
			e1.printStackTrace();
		}



		//		String jsonTravel = getJsonTravelAlarm();
		//		System.out.println(jsonTravel);
		//		try {
		//			JSONParser jsonParserT = new JSONParser();
		//			JSONObject jsonObjT = (JSONObject)jsonParserT.parse(jsonTravel);
		//			JSONArray dataArr = (JSONArray) jsonObjT.get("data");
		//			for(int i=0; i<dataArr.size(); i++) {
		//				JSONObject dataObj = (JSONObject) dataArr.get(i);
		//				System.out.println(dataObj.get("continent_eng_nm"));
		//				System.out.println(dataObj.get("country_eng_nm"));
		//			}
		//			System.out.println();
		//		} catch (ParseException e1) {
		//			e1.printStackTrace();
		//		}



		String jsonStr = "{\r\n"
				+ "  \"users\": [\r\n"
				+ "    {\r\n"
				+ "      \"userId\": 1,\r\n"
				+ "      \"firstName\": \"AAAAA\",\r\n"
				+ "      \"lastName\": \"as23\",\r\n"
				+ "      \"phoneNumber\": \"123456\",\r\n"
				+ "      \"emailAddress\": \"AAAAA@test.com\",\r\n"
				+ "      \"homepage\": \"https://amogg.tistory.com/1\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"userId\": 2,\r\n"
				+ "      \"firstName\": \"BBBB\",\r\n"
				+ "      \"lastName\": \"h5jdd\",\r\n"
				+ "      \"phoneNumber\": \"123456\",\r\n"
				+ "      \"homepage\": \"https://amogg.tistory.com/2\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"userId\": 3,\r\n"
				+ "      \"firstName\": \"CCCCC\",\r\n"
				+ "      \"lastName\": \"2dhbs\",\r\n"
				+ "      \"phoneNumber\": \"33333333\",\r\n"
				+ "      \"homepage\": \"https://amogg.tistory.com/3\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"userId\": 4,\r\n"
				+ "      \"firstName\": \"DDDDD\",\r\n"
				+ "      \"lastName\": \"bacasd\",\r\n"
				+ "      \"phoneNumber\": \"222222222\",\r\n"
				+ "      \"homepage\": \"https://amogg.tistory.com/4\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"userId\": 5,\r\n"
				+ "      \"firstName\": \"EEEEE\",\r\n"
				+ "      \"lastName\": \"asdfasdf\",\r\n"
				+ "      \"phoneNumber\": \"111111111\",\r\n"
				+ "      \"homepage\": \"https://amogg.tistory.com/5\"\r\n"
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}";

		//
		//		try {
		//			Dao dao = new Dao();
		//			JSONParser jsonParser = new JSONParser();
		//			JSONObject jsonObj = (JSONObject)jsonParser.parse(jsonStr);
		//
		//			//			System.out.println(jsonObj);
		//			//			System.out.println(jsonObj.get("users"));
		//			//			
		//			JSONArray usersArr = (JSONArray)jsonObj.get("users");
		//
		//			for(int i=0; i<usersArr.size(); i++) {
		//				JSONObject userObj = (JSONObject)usersArr.get(i);
		//				JSONObject userObj = null;
		////				System.out.println(userObj);
		//				System.out.println(userObj.get("userId"));
		//				System.out.println(userObj.get("firstName"));
		//				System.out.println(userObj.get("lastName"));
		//				System.out.println(userObj.get("emailAddress"));
		//				System.out.println(userObj.get("phoneNumber"));
		//				System.out.println(userObj.get("homepage"));

		//				JsonUser ju = new JsonUser();
		//Object클래스 자바의 모든 클래스들이 상속받는 부모클래스
		//자바 상속은 1개만. extends 클래스
		//인터페이스는 여러개 가능 implements 인터페이스
		//				ju.userId =  Integer.parseInt(userObj.get("userId").toString()); 도 된다. toString기본적으로 가지고있다
		//				ju.userId =  Integer.parseInt(String.valueOf(userObj.get("userId")));
		//				ju.firstName = (String) userObj.get("firstName");
		//				ju.lastName = (String) userObj.get("lastName");
		//				ju.emailAddress = (String) userObj.get("emailAddress");
		//				ju.phoneNumber = (String) userObj.get("phoneNumber");
		//				ju.homepage = (String) userObj.get("homepage");
		//				dao.insertJsonUser(ju);
		//			}
		//
		//		} catch (ParseException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}

		String jsonStr2 = "{\r\n"
				+ "	\"id\": \"0001\",\r\n"
				+ "	\"type\": \"donut\",\r\n"
				+ "	\"name\": \"Cake\",\r\n"
				+ "	\"ppu\": 0.55,\r\n"
				+ "	\"batters\":\r\n"
				+ "		{\r\n"
				+ "			\"batter\":\r\n"
				+ "				[\r\n"
				+ "					{ \"id\": \"1001\", \"type\": \"Regular\" },\r\n"
				+ "					{ \"id\": \"1002\", \"type\": \"Chocolate\" },\r\n"
				+ "					{ \"id\": \"1003\", \"type\": \"Blueberry\" },\r\n"
				+ "					{ \"id\": \"1004\", \"type\": \"Devil's Food\" }\r\n"
				+ "				]\r\n"
				+ "		},\r\n"
				+ "	\"topping\":\r\n"
				+ "		[\r\n"
				+ "			{ \"id\": \"5001\", \"type\": \"None\" },\r\n"
				+ "			{ \"id\": \"5002\", \"type\": \"Glazed\" },\r\n"
				+ "			{ \"id\": \"5005\", \"type\": \"Sugar\" },\r\n"
				+ "			{ \"id\": \"5007\", \"type\": \"Powdered Sugar\" },\r\n"
				+ "			{ \"id\": \"5006\", \"type\": \"Chocolate with Sprinkles\" },\r\n"
				+ "			{ \"id\": \"5003\", \"type\": \"Chocolate\" },\r\n"
				+ "			{ \"id\": \"5004\", \"type\": \"Maple\" }\r\n"
				+ "		]\r\n"
				+ "}";


		//		try {
		//			JSONParser jsonParser = new JSONParser();
		//			JSONObject jsonObject = (JSONObject)jsonParser.parse(jsonStr2);
		//			
		//			System.out.println(jsonObject);
		//			System.out.println("--------------------");
		//			System.out.println(jsonObject.get("id"));
		//			System.out.println(jsonObject.get("type"));
		//			System.out.println(jsonObject.get("name"));
		//			System.out.println(jsonObject.get("ppu"));
		//			
		//			JSONArray toppingArr =  (JSONArray)jsonObject.get("topping");
		//			for(int i=0; i<toppingArr.size(); i++) {
		//				JSONObject topping = (JSONObject)toppingArr.get(i);
		//				System.out.println(topping.get("id"));
		//				System.out.println(topping.get("type"));
		//			}
		//			
		//			JSONObject battersObj =  (JSONObject)jsonObject.get("batters");
		//			JSONArray batterArr = (JSONArray)battersObj.get("batter");
		//			for(int i=0; i<batterArr.size(); i++) {
		//				JSONObject batterObj = (JSONObject)batterArr.get(i);
		//				System.out.println(batterObj.get("id"));
		//				System.out.println(batterObj.get("type"));
		//			}
		//			
		//		} catch (ParseException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}


		String jsonStr3 = "{\r\n"
				+ "    \"quiz\": {\r\n"
				+ "        \"sport\": {\r\n"
				+ "            \"q1\": {\r\n"
				+ "                \"question\": \"Which one is correct team name in NBA?\",\r\n"
				+ "                \"options\": [\r\n"
				+ "                    \"New York Bulls\",\r\n"
				+ "                    \"Los Angeles Kings\",\r\n"
				+ "                    \"Golden State Warriros\",\r\n"
				+ "                    \"Huston Rocket\"\r\n"
				+ "                ],\r\n"
				+ "                \"answer\": \"Huston Rocket\"\r\n"
				+ "            }\r\n"
				+ "        },\r\n"
				+ "        \"maths\": {\r\n"
				+ "            \"q1\": {\r\n"
				+ "                \"question\": \"5 + 7 = ?\",\r\n"
				+ "                \"options\": [\r\n"
				+ "                    \"10\",\r\n"
				+ "                    \"11\",\r\n"
				+ "                    \"12\",\r\n"
				+ "                    \"13\"\r\n"
				+ "                ],\r\n"
				+ "                \"answer\": \"12\"\r\n"
				+ "            },\r\n"
				+ "            \"q2\": {\r\n"
				+ "                \"question\": \"12 - 8 = ?\",\r\n"
				+ "                \"options\": [\r\n"
				+ "                    \"1\",\r\n"
				+ "                    \"2\",\r\n"
				+ "                    \"3\",\r\n"
				+ "                    \"4\"\r\n"
				+ "                ],\r\n"
				+ "                \"answer\": \"4\"\r\n"
				+ "            }\r\n"
				+ "        }\r\n"
				+ "    }\r\n"
				+ "}";

		//		try {
		//			JSONParser jsonParser = new JSONParser();
		//			JSONObject jsonObject = (JSONObject)jsonParser.parse(jsonStr3);
		//			
		//			JSONObject quizObj = (JSONObject)jsonObject.get("quiz");
		//			
		//			JSONObject sportObj = (JSONObject)quizObj.get("sport");
		//			JSONObject sportQ1Obj = (JSONObject)sportObj.get("q1");  //q1
		//			System.out.println(sportQ1Obj.get("question"));
		//			System.out.println(sportQ1Obj.get("answer"));
		//			JSONArray optionArr = (JSONArray)sportQ1Obj.get("options");
		//			for(int i=0 ;i<optionArr.size(); i++) {
		//				System.out.println(optionArr.get(i)); //value 농구팀
		//			}
		//			
		//			JSONObject mathsObj = (JSONObject)quizObj.get("maths");
		//			
		//			JSONObject mathsQ1Obj =  (JSONObject)mathsObj.get("q1");
		//			
		//			System.out.println(mathsQ1Obj.get("question"));
		//			System.out.println(mathsQ1Obj.get("answer"));
		//			JSONArray optionMathQ1Arr = (JSONArray)mathsQ1Obj.get("options");
		//			for(int i=0 ;i<optionMathQ1Arr.size(); i++) {
		//				System.out.println(optionMathQ1Arr.get(i)); //value 농구팀
		//			}
		//			
		//			JSONObject mathsQ2Obj =  (JSONObject)mathsObj.get("q2");
		//			
		//			System.out.println(mathsQ2Obj.get("question"));
		//			System.out.println(mathsQ2Obj.get("answer"));
		//			JSONArray optionMathQ2Arr = (JSONArray)mathsQ2Obj.get("options");
		//			for(int i=0 ;i<optionMathQ2Arr.size(); i++) {
		//				System.out.println(optionMathQ2Arr.get(i)); //value 농구팀
		//			}
		//			
		//			
		//			
		//		} catch (ParseException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}

	}


	public static String getJsonTravelAlarm() {
		String jsonStr = "";

		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1262000/TravelAlarmService2/getTravelAlarmList2"); /*URL*/
		try {
			urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=DKEpyRVeo6o65yOsJGmQbhfaIFiNicpTPdcAXpwIR1gGlnjSpl4BmxQKlDLT0D%2FSeGVpjhGMbbRkfya%2FhHpHgA%3D%3D");

			urlBuilder.append("&" + URLEncoder.encode("returnType","UTF-8") + "=" + URLEncoder.encode("JSON", "UTF-8")); /*XML 또는 JSON*/
			urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
			//			urlBuilder.append("&" + URLEncoder.encode("cond[country_nm::EQ]","UTF-8") + "=" + URLEncoder.encode("가나", "UTF-8")); /*한글 국가명*/
			//			urlBuilder.append("&" + URLEncoder.encode("cond[country_iso_alp2::EQ]","UTF-8") + "=" + URLEncoder.encode("GH", "UTF-8")); /*ISO 2자리코드*/
			urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지 번호*/
			URL url = new URL(urlBuilder.toString());
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-type", "application/json");
			System.out.println("Response code: " + conn.getResponseCode());
			BufferedReader rd;
			//http응답코드 200번대는 성공
			if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
				rd = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
			} else {
				rd = new BufferedReader(new InputStreamReader(conn.getErrorStream(),"UTF-8"));
			}
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = rd.readLine()) != null) {
				sb.append(line);
			}
			rd.close();
			conn.disconnect();
			jsonStr = sb.toString();
		}catch (IOException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} /*Service Key*/

		return jsonStr; 
	}


	public static String getCovide19StatusJson() throws IOException {
		String jsonObj = "";
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1790387/covid19CurrentStatusKorea/covid19CurrentStatusKoreaJason"); /*URL*/
		urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=DKEpyRVeo6o65yOsJGmQbhfaIFiNicpTPdcAXpwIR1gGlnjSpl4BmxQKlDLT0D%2FSeGVpjhGMbbRkfya%2FhHpHgA%3D%3D"); /*Service Key*/
		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		System.out.println("Response code: " + conn.getResponseCode());
		BufferedReader rd;
		if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
		} else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream(),"UTF-8"));
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}
		rd.close();
		conn.disconnect();
		jsonObj = sb.toString();
		return jsonObj;
	}

}



 