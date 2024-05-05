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
import com.dto.Food;
import com.dto.FoodItems;

@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
	
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
	
		String fooditem = request.getParameter("foodnames");
		
		
		CriminalDAO cmpDAO = new CriminalDAO();
		
		//	FoodItems ft = cmpDAO.AddfoodItem(username,p);

	          Food f = new Food(fooditem);
			
			
			int result = cmpDAO.InsertfoodList(f);
			
			
			
			if (result > 0) {
				out.print("<center><h2>  Succesfully added to the cart!!! </h2>");
				RequestDispatcher rd = request.getRequestDispatcher("AddtoCart.jsp");
				rd.include(request, response);
				
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("FoodItemList.jsp");
				rd.include(request, response);
				out.print("<center><h2> Add to Cart Failed!!! </h2>");	
			}
			
				

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
