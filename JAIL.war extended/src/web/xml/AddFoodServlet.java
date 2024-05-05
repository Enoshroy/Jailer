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
import com.dto.FoodItems;


@WebServlet("/AddFoodServlet")
public class AddFoodServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String username = request.getParameter("foodname");
		int p = Integer.parseInt(request.getParameter("itemno"));
        
		FoodItems f = new FoodItems(username,p);
		
		CriminalDAO cmpDAO = new CriminalDAO();
		
	//	FoodItems ft = cmpDAO.AddfoodItem(username,p);

          
		
		
		int result = cmpDAO.register(f);
		
		RequestDispatcher rd = request.getRequestDispatcher("Jailer.jsp");
		rd.include(request, response);
		
		if (result > 0) {
			out.print("<center><h2>  Record Updated!!! </h2>");	
		} else {
			out.print("<center><h2> Record Updation Failed!!! </h2>");	
		}
		
			
//			request.setAttribute("cr", crm);
//			
//			RequestDispatcher rd = request.getRequestDispatcher("Profile.jsp");
//			rd.forward(request, response);

		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
