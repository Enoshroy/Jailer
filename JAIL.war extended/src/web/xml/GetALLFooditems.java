package web.xml;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CriminalDAO;
import com.dto.FoodItems;

@WebServlet("/GetALLFooditems")
public class GetALLFooditems extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		CriminalDAO empDAO = new CriminalDAO();
		List<FoodItems> foodList = empDAO.getAllfoodList();
					
		if (foodList != null) {
			
			request.setAttribute("foodList", foodList);
			
			RequestDispatcher rd = request.getRequestDispatcher("FoodItemList.jsp");
			rd.forward(request, response);
						
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("CriminalHomePage.jsp");
			rd.include(request, response);
			
			out.print("<center><h2 style='color:red;'> Criminal Record(s) Not Found!!! </h2></center>");			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
