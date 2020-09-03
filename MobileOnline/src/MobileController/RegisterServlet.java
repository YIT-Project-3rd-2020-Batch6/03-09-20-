package MobileController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import MobileDAO.RegisterDAO;
import MobileModel.RegisterModel;
/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public RegisterServlet() {
    	super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//	System.out.println("test1"); 
		if(request.getParameter("sub")!=null)
		{
			System.out.println("test1"); 
		String userid=request.getParameter("userid");
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String phonenumber=request.getParameter("phno");
		String secretquestion=request.getParameter("secretqsn");
		String secretanswer=request.getParameter("secretans");
		String address=request.getParameter("address");
		String utype="user";
		RegisterModel registration=new RegisterModel(userid, name, gender, email, password,  phonenumber, secretquestion, secretanswer, address, utype);
	    RegisterDAO rDao=new RegisterDAO();
	    boolean status=rDao.insert(registration);
	    try {
            if(status=true)
            {
            	request.setAttribute("successmsg", "Registered Succesfully");
            	response.sendRedirect("login.jsp");
            }
            else
            {
            	request.setAttribute("errormsg", "Register Unsuccesfull");
            	RequestDispatcher rd=request.getRequestDispatcher("register.jsp");  
	            rd.forward(request,response); 
            }
        } catch (Exception e) {
          
            e.printStackTrace();
        }
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}