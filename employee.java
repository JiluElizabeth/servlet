

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class employee
 */
@WebServlet(description = "employee salary,grade", urlPatterns = { "/employee" })
public class employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public employee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("name");
		//pw.println(name);
		double salary =Double.parseDouble(request.getParameter("salary"));
		//pw.println("salary:"+salary);
		double bonus=0.0;
		double tax=(salary*0.25);
		//pw.println("tax:"+tax);
		
		String grade=request.getParameter("grade");
		if 
		(salary>100000)
		bonus=(salary*0.05);
		//pw.println("bonus:"+bonus);}
		else if 
		(salary>50000 && salary<100000)
		bonus=(salary*0.07);
		//pw.println("bonus:"+bonus);}
		else
		bonus=(salary*0.20);
		//pw.println("bonus:"+bonus);
		double netsalary=(salary-tax+bonus);
		//pw.println("net salary:"+netsalary);
		
		
		String str="<table border=1>" +
		"<tr><th>Name</th>"+
		"<th>Salary</th>"+
		"<th>Bonus</th>"+
		"<th>Tax</th>"+
		"<th>Net salary</th>"+
		"</tr>";
		 String str2="<tr>"+
		"<td>"+name+"</td>"+
		"<td>"+salary+"</td>"+
		"<td>"+bonus+"</td>"+
		"<td>"+tax+"</td>"+
		"<td>"+netsalary+"</td>"+
		"</tr>";
		 
		 pw.print(str+str2);}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
