package MobileController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import MobileDAO.ForgotDAO;
import MobileModel.RegisterModel;

/**
 * Servlet implementation class ForgotServlet
 */
@WebServlet("/ForgotServlet")
public class ForgotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForgotServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    if(request.getParameter("submit")!=null)
	    {
	    	System.out.println("test1");
	    	String userid=request.getParameter("userid");
	    	String secretqsn=request.getParameter("secretqsn");
	    	String secretans=request.getParameter("secretans");
	    	RegisterModel val=new RegisterModel();
	    	val.setUserid(userid);
	    	val.setSecretqsn(secretqsn);
	    	val.setSecretans(secretans);
	    	boolean status=ForgotDAO.validate(val);
	    	if(status=true)
	    	{
	    		HttpSession session = request.getSession();
		    	session.setAttribute("userid", userid);
	    		RequestDispatcher rd=request.getRequestDispatcher("Reset.jsp");
	    		rd.forward(request, response);
	    	}
	    	else
	    	{
	    		request.setAttribute("errormsg", "Invalid user");
	    		RequestDispatcher rd=request.getRequestDispatcher("Forgotpassword.jsp");
	    		rd.forward(request, response);
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
