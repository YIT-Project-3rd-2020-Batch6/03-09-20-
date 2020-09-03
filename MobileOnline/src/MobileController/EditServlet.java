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
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		RequestDispatcher rd=null;
		int pid;
		ProductModel temp;
		System.out.println("test13");
		if(request.getParameter("oper")!=null)
		{
			if(request.getParameter("oper").equals("edit") )
			{
				System.out.println("test14");
				pid=Integer.parseInt(request.getParameter("pid"));		
				
			    //temp.setRoll(roll);
			    temp=ProductDAO.getProductsByPid(pid);
			    if(temp!=null)
			    {
			    	request.setAttribute("product", temp);
			    	rd=request.getRequestDispatcher("editproduct.jsp");
			    	rd.forward(request, response);
			    }
			    
			}
			
		}
		if(request.getParameter("confirmedit")!=null)
		{
			pid=Integer.parseInt(request.getParameter("pid"));	
			String pname=request.getParameter("pname");
			String brand=request.getParameter("brand");
			String ram= request.getParameter("ram");
			String rom=request.getParameter("rom");
			String processor=request.getParameter("processor");
			String battery=request.getParameter("battery");
			int price=Integer.parseInt(request.getParameter("price"));
			String descrptn=request.getParameter("descrptn");
			temp = new ProductModel();
			temp.setPid(pid);
			temp.setPname(pname);
			temp.setBrand(brand);
			temp.setRam(ram);
			temp.setRom(rom);
			temp.setProcessor(processor);
			temp.setBattery(battery);
			temp.setPrice(price);
			temp.setDescrptn(descrptn);
			if(ProductDAO.EditProductByPid(temp))
			 	request.setAttribute("successmsg", "Updated succssfully");
			else
				request.setAttribute("errormsg", "Not updated");			 
			rd=request.getRequestDispatcher("editproduct.jsp");
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
