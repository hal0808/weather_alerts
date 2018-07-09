package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WeaAle
 */
@WebServlet("/WeaAle")
public class WeaAle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//リクエストパラメータから取得
		request.setCharacterEncoding("UTF-8");
		String dt = request.getParameter("dt");
		double lat = Integer.parseInt(request.getParameter("lat"));
		double lon = Integer.parseInt(request.getParameter("lon"));

		dt = "2018-06-11 03:00:00";
		lat = 34.351063;
		lon = 134.047004;


	}

	private static int find_city(double lat,double lon,HttpServletRequest request){
		int code = 0;

		//sqlの実行
		//アプリケーションスコープからデータベース接続情報を取得する
		ServletContext sc = request.getServletContext();
		Connection con = (Connection)sc.getAttribute("DB_CONNECT");

		String sql="";

		try {
					sql = "SELECT c.id,c.title,c.volume,c.author,c.plice,p.name,g.name,c.stock FROM comic_mst c,genre_mst g,publisher_mst p WHERE genre_id = g.id AND publisher_id = p.id AND title LIKE ? AND c.del_flag=0 ORDER BY c.id ASC";

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
