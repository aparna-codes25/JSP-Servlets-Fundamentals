

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class deleteCookieServlet
 */
@WebServlet("/deleteCookieServlet")
public class deleteCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Cookie delete;
		
		PrintWriter out = response.getWriter();
		
		for(Cookie cookie: request.getCookies()) {
			String toDeleteCookie = cookie.getName();
			out.println(cookie.getName()+":"+cookie.getValue());
			if(toDeleteCookie.equalsIgnoreCase("firstName")) {
//				delete = new Cookie("firstName","");
				delete = cookie;
				delete.setValue("");
				delete.setPath(request.getContextPath());
				delete.setMaxAge(0);
				response.addCookie(delete);
				break;
			}
		}
		
		response.sendRedirect(request.getContextPath()+"/cookieFormServlet");
		return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
