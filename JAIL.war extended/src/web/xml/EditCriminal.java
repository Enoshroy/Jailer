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

@WebServlet("/EditCriminal")
public class EditCriminal extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PrintWriter out = response.getWriter();
		String khadhino = request.getParameter("Khadhino");
	
		CriminalDAO empdao = new CriminalDAO();
		
		Criminal crm = empdao.getCriminalById(khadhino);
         request.setAttribute("crm", crm);
		
		RequestDispatcher rd = request.getRequestDispatcher("EditCriminal.jsp");
		rd.forward(request, response);
		
		
		
	}
		
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
