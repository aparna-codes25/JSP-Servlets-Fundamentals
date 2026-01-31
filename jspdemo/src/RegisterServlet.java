import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Employee;
import services.EmployeeService;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeService employeeService;

    public RegisterServlet() {
        super();
        this.employeeService  = new EmployeeService();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		Employee employee = new Employee();
		employee.setFirstName(request.getParameter("firstName"));
		employee.setLastName(request.getParameter("lastName"));
		employee.setEmployeeId(request.getParameter("employeeId"));
		employee.setAge(Integer.parseInt(request.getParameter("age")));
		employee.setSalary(Double.parseDouble(request.getParameter("salary")));
		String message = this.employeeService.saveEmployee(employee);
		
		PrintWriter out = response.getWriter();
		request.setAttribute("message",message);
		RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
		rd.forward(request,response);
	}

}
