package MobileController;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import MobileDAO.LoginDAO;
import MobileModel.RegisterModel;

@WebServlet("/LoginServlet")

public class LoginServlet extends HttpServlet {
	
		private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		RegisterModel registerModel=new RegisterModel();
		 response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		          
		    String userid=request.getParameter("userid");  
		    String password=request.getParameter("password");
		    registerModel.setUserid(userid);
	        registerModel.setPassword(password);
	        String ut=LoginDAO.validate(registerModel);
		    if(ut.equals("user"))
		    { 
		    	RequestDispatcher rd=request.getRequestDispatcher("main.jsp");  
		        rd.forward(request,response);  
		    }  
		    else if(ut.equals("admin"))
		    {  
		     
		        RequestDispatcher rd=request.getRequestDispatcher("admin.jsp");  
		        rd.forward(request,response); 
		    } 
		    else
		    {
		    	request.setAttribute("errormsg", "Wrong username or password");
		        RequestDispatcher rd=request.getRequestDispatcher("login.jsp");  
		        rd.forward(request,response); 
		    }  		 
		          
		    out.close();   
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
