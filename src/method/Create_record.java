package method;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * @author masa
 */
public class Create_record {

	public boolean execute(HttpServletRequest request,int city_id) {

		try {
			Document doc =Jsoup.connect("http://api.openweathermap.org/data/2.5/forecast?id=1852561&appid=d3eb516e0fd441b11ce433f19fdbc480").get();




		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}



		return true;

	}







}
