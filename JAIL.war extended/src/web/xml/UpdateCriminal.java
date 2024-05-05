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


@WebServlet("/UpdateCriminal")
public class UpdateCriminal extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
    String name =request.getParameter("name");
		String crime = request.getParameter("crime");
		int dateofrealse = Integer.parseInt(request.getParameter("dateofrealse"));
		int punishmentperiod = Integer.parseInt(request.getParameter("punishmentperiod"));
		String khadhino = request.getParameter("khadhino");
		
		
		Criminal cr = new Criminal(name,crime,dateofrealse,punishmentperiod,khadhino);
		
				
		CriminalDAO crdao = new CriminalDAO();
		
		
		int result = crdao.UpdateEmployee(cr);
		
		RequestDispatcher rd = request.getRequestDispatcher("Jailer.jsp");
		rd.include(request, response);
		
		if (result > 0) {
			out.print("<center><h2> Employee Record Updated!!! </h2>");	
		} else {
			out.print("<center><h2> Employee Record Updation Failed!!! </h2>");	
		}
		
		out.print("</center>");
	}

		
		
		
		
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
