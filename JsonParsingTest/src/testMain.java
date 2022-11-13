import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieJsonMain ms = new MovieJsonMain();
		
		JSONParser jsonParser = new JSONParser();
		try {
			JSONObject boxObj = (JSONObject)jsonParser.parse(ms.getDailyBoxOffice());
			JSONObject boxResultObj = (JSONObject) boxObj.get("boxOfficeResult");

			JSONArray dailyBoxArr = (JSONArray) boxResultObj.get("dailyBoxOfficeList");
			Dao movieDao = new Dao();
//			List<TmdbData> td = movieDao.selectTmdbStatus();
			for(int i=0; i<dailyBoxArr.size(); i++) {
				JSONObject dailyBoxObj = (JSONObject) dailyBoxArr.get(i);
				JSONObject find = ms.getTmdbJson(dailyBoxObj.get("movieNm"));
				JSONArray findresultsArr = (JSONArray) find.get("results");
				for(int j=0; j<findresultsArr.size(); j++) {
					JSONObject result = (JSONObject) findresultsArr.get(j);
					if(dailyBoxObj.get("movieNm").equals(result.get("title"))) {
						System.out.println(result.get("poster_path"));
					}
				}
				System.out.println(dailyBoxObj.get("movieNm"));
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		ms.main(args);
	}

}
