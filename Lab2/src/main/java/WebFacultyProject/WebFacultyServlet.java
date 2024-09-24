package WebFacultyProject;

import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WebFacultyServlet
 */
@WebServlet("/WebFacultyServlet")
public class WebFacultyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public WebFacultyServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintStream out = new PrintStream(response.getOutputStream());
		out.println("<h3>/( '_' )/ LAB II /( '_' )/<h3>");
		
		
		HashMap<Integer, Faculty> facultyMap = new HashMap<>();
		
		Faculty faculty1 = new Faculty(101, "Smith", "John", 50000, 10);
        Faculty faculty2 = new Faculty(102, "Doe", "Jane", 60000, 15);
        Faculty faculty3 = new Faculty(103, "Sharma", "Ritesh", 80000, 16);
        
        
        facultyMap.put(faculty1.getF_id(), faculty1);
        facultyMap.put(faculty2.getF_id(), faculty2);
        facultyMap.put(faculty3.getF_id(), faculty3);
		
        out.println("<table border=\"1\">");
        out.println("<tr><th>Faculty ID</th></tr>");

        for (Faculty faculty : facultyMap.values()) {
            out.println("<tr>");
            out.println("<td>" + faculty.getF_id() + "</td>");
         
            out.println("</tr>");
        }

        out.println("</table>");
        
		
        
        
        
        
        out.println("<h3>/( '_' )/ Print Faculty Record Collection /( '_' )/</h3>");

        out.println("<table border=\"2\">");
        out.println("<tr>"
        		+ "<th>Faculty ID</th>"
        		+ "<th>First Name</th>"
        		+ "<th>Last Name</th>"
        		+ "<th>Salary</th>"
        		+ "<th>Bonus</th>"
        		+ "<th>Faculty Total Bonus</th>"
        		+ "</tr>");
        
        
        double totalFacultyBonus = 0;
        for (Faculty faculty : facultyMap.values()) {
            out.println("<tr>");
            out.println("<td>" + faculty.getF_id() + "</td>");
            out.println("<td>" + faculty.getF_name() + "</td>");
            out.println("<td>" + faculty.getL_name() + "</td>");
            out.println("<td>" + faculty.getSalary() + "</td>");
            out.println("<td>" + faculty.getBonus() + "</td>");
            out.println("<td>" + faculty.calculate_Bonus() + "</td>" );  
            out.println("</tr>");
            
            totalFacultyBonus = totalFacultyBonus + faculty.calculate_Bonus();
        }

        out.println("</table>");
        out.println("<p><strong>Total Faculty Bonus: </strong>" + totalFacultyBonus + "</p>");

        out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
