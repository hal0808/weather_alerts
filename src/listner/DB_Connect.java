package listner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class DB_Connect
 *
 */
@WebListener
public class DB_Connect implements ServletContextListener {

    /**
     * Default constructor.
     */
    public DB_Connect() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    //Webアプリケーションが終了する時
    public void contextDestroyed(ServletContextEvent arg0)  {
         // TODO Auto-generated method stub
    	System.out.println("Webアプリケーションが終了した");

    	//データベース接続をを閉じる
    	Connection con = (Connection)arg0.getServletContext().getAttribute("DB_CONNECT");
    	try {
			con.close();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    //Webアプリケーションが開始する時
    public void contextInitialized(ServletContextEvent arg0)  {
         // TODO Auto-generated method stub
    	System.out.println("Webアプリケーションが開始した");

    	//データーベースに接続する
    	connect(arg0);

    }

    //データベースに接続するメソッド
    private void connect(ServletContextEvent args0){
		//データベース接続のプログラム
		//JDBCドライバの読み込み
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		//データベースに接続する
		Connection con = null;	//コネクションオブジェクト

		//データベース接続用のユーザ、パスワード
		String user = "apluser";
		String password = "P@ssw0rd";

		// 接続文字列(どこのDBに接続にいくか)
		String url ="jdbc:mysql://localhost/weather_db?useUnicode=true&characterEncoding=UTF8";

		//データベースに接続する
		try {
			//データベースに接続する
			con = DriverManager.getConnection(url, user, password);
			System.out.println("データベースに接続成功");

			//☆アプリケーションスコープにセットする
			ServletContext sc = args0.getServletContext();
			sc.setAttribute("DB_CONNECT", con);

		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
			System.out.println("データベースに接続成功");
		}

    }


}





