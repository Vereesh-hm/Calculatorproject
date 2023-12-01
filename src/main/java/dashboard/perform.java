package dashboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class perform  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		if(email.length()>=5)
		{
			req.getRequestDispatcher("Success.html").forward(req, resp);
		}
		else
		{
			resp.getWriter().print("<h1> you entered incorrect credential </h1>");
			req.getRequestDispatcher("Login.html");
		}
	}
	
}
