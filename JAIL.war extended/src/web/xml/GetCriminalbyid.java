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


@WebServlet("/GetCriminalbyid")
public class GetCriminalbyid extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String khadhino = request.getParameter("password");

		CriminalDAO cmpDAO = new CriminalDAO();
		Criminal crm= cmpDAO.getCriminalById(khadhino);

		if (crm != null) {
			
			request.setAttribute("crm", crm);
			
			RequestDispatcher rd = request.getRequestDispatcher("GetCriminalById.jsp");
			rd.forward(request, response);

		} else {		
			
			RequestDispatcher rd = request.getRequestDispatcher("Jailer.jsp");
			rd.include(request, response);
			
			out.print("<center><h2 style='color:red;'> Criminal Record Not Found!!! </h2>");	
		}

	
	
	
	
	
	
	
	
	
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
