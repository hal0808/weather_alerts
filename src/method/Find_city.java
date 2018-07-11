package method;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author ishida haruna
 *
 */
public class Find_city {
	public int execute(Double lat, Double lon, HttpServletRequest request){
		int code = 0;

		//sqlの実行
		//アプリケーションスコープからデータベース接続情報を取得する
		ServletContext sc = request.getServletContext();
		Connection con = (Connection)sc.getAttribute("DB_CONNECT");

		String sql="";

		try {
			sql = "SELECT code FROM city_meter WHERE ";

			ResultSet rs=null;

				System.out.println(sql);
				PreparedStatement ps = con.prepareStatement(sql);

				//パラメータのセット
				//ps.setString(1, '%' + lon + '%');	//word:検索ワード

				//select文を実行し結果を取得する
				rs = ps.executeQuery();
				System.out.println(ps.toString());


			//next()メソッド：レコードがある間trueを返す
			while(rs.next()){
				//コンソールに一応出力
				System.out.println("コミックID："+rs.getString("c.id"));


			}

			rs.close();


		} catch (SQLException e) {
		// TODO 自動生成された catch ブロック
//			try {
//				//異常時はロールバックする
//				con.rollback();
//			} catch (SQLException e1) {
//				// TODO 自動生成された catch ブロック
//				e1.printStackTrace();
//			}
			e.printStackTrace();
		}

		return code;

	}
}
