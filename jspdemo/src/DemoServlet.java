import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.luv2code.jsp.Student;

/*
 * Process of execution,
 * 1. browser calls the DemoServelt URL
 * 2. The Servlet receives this request which is handled by the doGet method
 * 3. Inside this method, data is being prepared (the model)
 * 4. We set this data in request scope. (meaning it is available / exists only for 1 request from client)
 * Next request won't have this data. We set this data in the setAttribute line.
 * 5. We create a dispatch object by getting the required JSP.
 * 6. The server forwards the request to display.jsp ( this is not a redirect, it is 
 * internally forwarding which the client is unaware of)
 */

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		List<Student> studs = Arrays.asList(new Student(1,"Aparna"),
				new Student(2,"Mahathi"), new Student(3,"Suseela"));
		request.setAttribute("students", studs);
		Student s = new Student(1,"Aparna");
		request.setAttribute("student",s);
		RequestDispatcher rd = 
				request.getRequestDispatcher("/display.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
