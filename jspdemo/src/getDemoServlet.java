

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class getDemoServlet
 */
@WebServlet("/cookieFormServlet")
public class getDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getDemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		/*
		 * 1. browser sends request GET/cookieForm.jsp
		 * 2. Server sends response JSESSION cookie (contains JSESSIONID) + cookieForm.jsp content
		 * 3. browser stores the session cookie
		 * 4. browser displays the form, user fills the form and submits it.
		 * 5. While submitting domain (localhost) , port (8080) , path (/) all match values in the session cookie. So it is sent along with the request.
		 * 6. While constructing the response, we read the cookies in request. At that time only 1 cookie is sent which is session cookie. So only 1 cookie's
		 * value is displayed. At the same time, we create new cookies using the parameters in the request and send it to browser. ( This happens in the same
		 * request-response cycle)
		 * 7. when this response is received, though only session cookie is displayed, new cookies are added to the browser's local storage. These new cookies are 
		 * got from time line 6
		 * 8. Refresh the browser -> new request is sent to the server. That time session cookie + new cookies received in the previous response is sent in request.
		 * 9. Now response shows all the cookies past 2 requests.
		 */
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		PrintWriter out = response.getWriter();
		
		if(firstName != null && lastName!=null) {
			Cookie firstNameCookie = new Cookie("firstName",firstName);
			Cookie lastNameCookie = new Cookie("lastName",lastName);
			response.addCookie(firstNameCookie);
			response.addCookie(lastNameCookie);
		}
		
		response.setContentType("text/html");
		
//		response.sendRedirect("cookieFormServlet");
		
		String docType = "<!DOCTYPE html>\n" +
				 "<html> \n" + 
				"<head> \n" +
					"<title> Result Page for Cookies </title>\n" + 
				"</head> \n"+
				"<body> \n";
		
		out.println(docType);
		
		Cookie[] cookies = request.getCookies();
		
		if(cookies!=null) {
			out.println("<ul>");
			for(Cookie cookie: cookies) {
				
				out.println(""
						+ "<li>" + cookie.getName() + ":" + cookie.getValue() + ":" + cookie.getPath() + ":" + cookie.getDomain() + "</li>");
			}
			out.println("</ul>");
			out.println("<form method=\"GET\" action=\"deleteCookieServlet\">"
					+ "<input type=\"submit\" value=\"Delete First Name cookie\">"
					+ "</form>");
		}
		else {
			out.println("<p>No cookies have been set</p>");
		}
		out.println("</body></html>");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
