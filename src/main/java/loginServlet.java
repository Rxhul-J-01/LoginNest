
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")

public class loginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("uname");
        String pass = request.getParameter("upass");
        
        loginDAO dao = new loginDAO();
        PrintWriter out = response.getWriter();
        
        if(dao.checks(name, pass)) {
            HttpSession session = request.getSession();
            session.setAttribute("name",name);
            session.setAttribute("pass", pass);
            
            response.sendRedirect("welcome.jsp");
        } else if(name == null && pass == null){
            response.sendRedirect("login.jsp");
        }else {
        	out.println("<script type=\"text/javascript\">");
            out.println("alert('Wrong username & password');");
            out.println("window.location.href='login.jsp';");
            out.println("</script>");
        }
	}
}
