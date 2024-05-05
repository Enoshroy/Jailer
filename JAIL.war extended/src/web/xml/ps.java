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


@WebServlet("/ps")
public class ps extends HttpServlet {
	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			

			String username = request.getParameter("username");
	        
			CriminalDAO cmpDAO = new CriminalDAO();
			Criminal crm= cmpDAO.getCriminalByNamr(username);

			
				
				request.setAttribute("cr", crm);
				
				RequestDispatcher rd = request.getRequestDispatcher("Profile.jsp");
				rd.forward(request, response);

		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
