package method;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/*
 * @author masa
 */
public class Create_record {

	public boolean execute(HttpServletRequest request) {
		try {
			Document doc =Jsoup.connect("").get();



		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}



		return true;

	}







}
