package MobileController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import MobileDAO.ProductDAO;
import MobileDAO.RegisterDAO;
import MobileModel.ProductModel;
import MobileModel.RegisterModel;

/**
 * Servlet implementation class AddProductServlet
 */
@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("add")!=null)
		{
			System.out.println("test1"); 
			int pid=Integer.parseInt(request.getParameter("pid"));
			String pname=request.getParameter("pname");
			String brand=request.getParameter("brand");
			String ram=request.getParameter("ram");
			String rom=request.getParameter("rom");
			String processor=request.getParameter("processor");
			String battery=request.getParameter("battery");
			int price=Integer.parseInt(request.getParameter("price"));
			String descrptn=request.getParameter("descrptn");
			ProductModel product=new ProductModel(pid,pname,brand,ram,rom,processor,battery,price,descrptn);
			ProductDAO add=new ProductDAO();
			boolean status=add.addProduct(product);
			try {
            if(status=true)
            {
            	RequestDispatcher rd=request.getRequestDispatcher("Showproduct.jsp");  
	            rd.forward(request,response); 
            }
            else
            {
            	RequestDispatcher rd=request.getRequestDispatcher("addproduct.jsp");  
	            rd.forward(request,response); 
            }
        } catch (Exception e) {
          
            e.printStackTrace();
        }
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
