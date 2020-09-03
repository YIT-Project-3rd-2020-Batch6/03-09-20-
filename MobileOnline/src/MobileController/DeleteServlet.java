package MobileController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import MobileDAO.ProductDAO;
import MobileModel.ProductModel;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stubRequestDispatcher rd=null;
		int pid;
		RequestDispatcher rd=null;
		
		ProductModel temp=new ProductModel();
		if(request.getParameter("oper")!=null)
		{
			if(request.getParameter("oper").equals("delete"))
			{
				
				pid=Integer.parseInt(request.getParameter("pid"));					
			    temp.setPid(pid);
			    temp=ProductDAO.getProductsByPid(pid);
			    if(temp!=null)
			    {
			    	
			    	request.setAttribute("product", temp);
			    	rd=request.getRequestDispatcher("deleteproduct.jsp");
			    	rd.forward(request, response);	
			    	
			    }		    
			}
		}
		
		if(request.getParameter("confirmdelete")!=null)
		{
			pid=Integer.parseInt(request.getParameter("pid"));	
			if(ProductDAO.deleteProductsByPid(pid))
			{
				request.setAttribute("successmsg", "Updated succssfully");
			}
			else
			{
				request.setAttribute("errormsg", "Not updated");	
			}
			rd=request.getRequestDispatcher("deleteproduct.jsp");
			rd.forward(request, response);	
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
