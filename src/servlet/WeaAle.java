package servlet;

import java.io.IOException;

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

	private static int find_city(double lat,double lon){
		int code = 0;



		return code;
	}

}