package MobileController;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import MobileDAO.ProductDAO;
import MobileModel.ProductModel;

/**
 * Servlet implementation class ShowProductServlet
 */
@WebServlet("/ShowProductServlet")
public class ShowProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd;
		String selname="";   // 12,13
		
		String oper="";String pid="";
		if(request.getParameter("oper")!=null )
		{
			System.out.println("test11");
			oper=request.getParameter("oper");
			pid=(String)request.getParameter("pid");
			if(oper=="edit")
			{
				System.out.println("test12");
				rd=request.getRequestDispatcher("edit");		    
		 	    rd.forward(request, response);
			}
			else if(oper=="delete")
			{
				rd=request.getRequestDispatcher("delete");		    
		 	    rd.forward(request, response);
			}
		}
		
		
		ArrayList<String> allbrand;
		allbrand= ProductDAO.getAllBrand();
		request.setAttribute("allbrand", allbrand);
		String val="";
		
		ArrayList<ProductModel> allProducts;
		
		if(request.getParameter("catg")!=null)
		{   
			val=request.getParameter("category");
			allProducts= ProductDAO.getProductssByBrand(val);
			request.setAttribute("allProducts", allProducts);
		}	
			
		rd=request.getRequestDispatcher("Showproduct.jsp");		    
 	    rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
