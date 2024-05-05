package web.xml;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CriminalDAO;


@WebServlet("/DeleteCriminal")
public class DeleteCriminal extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
PrintWriter out = response.getWriter();
		
		String Khadhino = request.getParameter("Khadhino");
		
		CriminalDAO empdao = new CriminalDAO ();
		int result = empdao.deleteCriminal(Khadhino);
		
		out.print("<html>");
		RequestDispatcher rd = request.getRequestDispatcher("GetAllCrimanalss");
		rd.include(request, response);
		
		if (result > 0) {
			
			
            out.print(" <script> function showAlert() {alert ('Employee registred'); }</script>");
			
			out.print("<body bgcolor='lightyellow' text='blue'>");
			out.print("<center><h2> Criminal record deleted!!! </h2>");
			
			
		} else {
			
			out.print("<body bgcolor='lightyellow' text='red'>");
			out.print("<center><h2> Criminal record deletion Failed!!! </h2>");	

			//RequestDispatcher rd = request.getRequestDispatcher("");
			
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
