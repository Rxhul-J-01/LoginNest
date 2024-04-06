

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class registerServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String rpass = request.getParameter("rpass");
		
		PrintWriter out = response.getWriter();
		
		registerDAO dao = new registerDAO();
		
		if(name == "" && email == "" && pass == "") {
			out.println("<script type=\"text/javascript\">");
            out.println("alert('Registration Failed');");
            out.println("window.location.href='register.jsp';");
            out.println("</script>");
		}else if(!rpass.equals(pass)) {
			out.println("<script type=\"text/javascript\">");
            out.println("alert('Passwords are not matching');");
            out.println("window.location.href='register.jsp';");
            out.println("</script>");
		}
		if(dao.add(name, pass, email)) {
			
			out.println("<script type=\"text/javascript\">");
            out.println("alert('Registration Successful');");
            out.println("window.location.href='register.jsp';");
            out.println("</script>");
            
		}
	}

}
