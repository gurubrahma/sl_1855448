package example.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ResiterServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String firstName = req.getParameter("fname");
		String lastName = req.getParameter("lname");
		String emailid = req.getParameter("email");
		String password = req.getParameter("password");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print(" user name :"+firstName+lastName);
	}

}
