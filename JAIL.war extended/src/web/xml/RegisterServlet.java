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

import com.dto.Criminal;


/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String empName = request.getParameter("criminalName");
		String gender = request.getParameter("crimename");
		int empId = Integer.parseInt(request.getParameter("dateofrealse"));
		int empI = Integer.parseInt(request.getParameter("punishmentperiod"));
		String loginId = request.getParameter("khadhino");
		
		
		Criminal emp = new Criminal(empName,gender, empId, empI, loginId);		
		
		CriminalDAO empDAO = new CriminalDAO();
		int result = empDAO.register(emp);
		
		out.print("<html>");
		
		if (result > 0) {
			
			out.print("<body bgcolor='lightyellow' text='blue'>");
			out.print("<center><h2> Criminal Registered!!! </h2>");	

			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
			
		} else {
			
			out.print("<body bgcolor='lightyellow' text='red'>");
			out.print("<center><h2> Criminal Registration Failed!!! </h2>");	

			RequestDispatcher rd = request.getRequestDispatcher("Register.html");
			rd.include(request, response);
		}
		
		out.print("</center>");
		out.print("</body>");
		out.print("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
