package web.xml;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CriminalDAO;
import com.dto.Criminal;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String password =  request.getParameter("password");
		
		
		HttpSession session = request.getSession(true);
		session.setAttribute("username",username);
		
		out.print("<html>");	
		if(username.equalsIgnoreCase("Jailer")&&password.equals("jailer")){
			
			
			RequestDispatcher rd=request.getRequestDispatcher("Jailer.jsp");
			rd.forward(request, response);
		}
		else
		{
		
			CriminalDAO crdao = new CriminalDAO();
			Criminal cr =crdao.login(username, password);
			
			
            if (cr != null) {
				
				session.setAttribute("cr", cr);
				
				RequestDispatcher rd = request.getRequestDispatcher("CriminalHomePage.jsp");
				rd.forward(request, response);
				
			} else {

				out.print("<body bgcolor='lightyellow' text='red'>");
				out.print("<center><h2> Invalid Credentials </h2>");	

				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);
				
				out.print("</center>");
				out.print("</body>");
			}
			out.print("</html>");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
