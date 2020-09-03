package MobileController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import MobileDAO.ForgotDAO;
import MobileModel.RegisterModel;

/**
 * Servlet implementation class ResetServlet
 */
@WebServlet("/ResetServlet")
public class ResetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 if(request.getParameter("reset")!=null)
		    {
			 System.out.println("test2");
			 	String userid=request.getParameter("userid");
		    	String npassword=request.getParameter("newpwd");
		    	String cpassword=request.getParameter("confirmpwd");
		    	if(npassword.equals(cpassword))
		    	{
		    	RegisterModel rst=new RegisterModel();
		    	rst.setUserid(userid);
		    	rst.setPassword(npassword);
		    	boolean status=ForgotDAO.reset(rst);
		    	if(status=true)
		    	{
		    		RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		    		rd.forward(request, response);
		    	}
		    	else
		    	{
		    		request.setAttribute("errormsg", "Wrong password");
		    		RequestDispatcher rd=request.getRequestDispatcher("Reset.jsp");
		    		rd.forward(request, response);
		    	}
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
