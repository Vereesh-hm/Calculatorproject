package perform;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/div")
public class Division extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		double num1=Double.parseDouble(req.getParameter("num1"));
		double num2=Double.parseDouble(req.getParameter("num2"));
		
		resp.getWriter().print("<h1> the divison of"+num1+" " +" and "+num2+" "+ "is" +" "+(num1/num2)+"</h1>");
	}
}
