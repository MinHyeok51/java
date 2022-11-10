import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json1109 {

	public static void main(String[] args) {
		
		Dao mountainDao = new Dao();
		try {
			String mountainJson = getMountainInfo();
			JSONParser parser = new JSONParser();
			JSONObject mtObj = (JSONObject) parser.parse(mountainJson);
			JSONArray itemArr = (JSONArray) mtObj.get("items");
			for(int i = 0; i<itemArr.size(); i++) {
				JSONObject itemObj = (JSONObject) itemArr.get(i);
				System.out.println(itemObj.get("mtName"));
				System.out.println(itemObj.get("mtAreaNm"));
				System.out.println(itemObj.get("mtHight"));
				System.out.println(itemObj.get("mtDfcNm"));
				System.out.println(itemObj.get("mtThemeNm"));
				System.out.println();
			}
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		
	}
	
		public static String getMountainInfo() throws IOException {
			String jsonStr ="";
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/6440000/Cn100Mt/getList"); /*URL*/
	        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=DKEpyRVeo6o65yOsJGmQbhfaIFiNicpTPdcAXpwIR1gGlnjSpl4BmxQKlDLT0D%2FSeGVpjhGMbbRkfya%2FhHpHgA%3D%3D"); /*Service Key*/
	        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지당 표출 데이터 수*/
	        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지 번호*/
	        urlBuilder.append("&" + URLEncoder.encode("searchNm","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*검색할 산 이름*/
	        urlBuilder.append("&" + URLEncoder.encode("searchArea","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*지역코드 (기술문서참조)*/
	        urlBuilder.append("&" + URLEncoder.encode("searchSeason","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*계절코드 (SESS1 = 봄, SESS2 = 여름, SESS3 = 가을, SESS4 = 겨울)*/
	        urlBuilder.append("&" + URLEncoder.encode("searchTheme","UTF-8") + "=" + URLEncoder.encode("TEME1", "UTF-8")); /*테마코드 (기술문서참조)*/
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
	        jsonStr=sb.toString();
	        
	        return jsonStr;
		}
	

}
