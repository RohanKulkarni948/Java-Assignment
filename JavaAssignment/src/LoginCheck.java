

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//check valid uname and pword
		String UserName=request.getParameter("UserName");
		String Password=request.getParameter("Password"); 
		DATADAO data =new DATADAO(UserName,Password);
		int i=data.geti();
		if(i==1)
		{
			response.sendRedirect("admin.jsp");
		}
//		else if(UserName.equals("associate")&&(Password.equals("associate")))
//		{
//			response.sendRedirect("associate.jsp");
//		}
//		else if(UserName.equals("faculty")&&(Password.equals("faculty")))
//		{
//			response.sendRedirect("faculty.jsp");
//		}
		else
		{
			response.sendRedirect("error.jsp");
		}
		doGet(request, response);
	}

}
