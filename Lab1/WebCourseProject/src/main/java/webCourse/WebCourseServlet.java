package webCourse;

import java.io.IOException;
import java.io.PrintStream;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WebCourseServlet
 */
@WebServlet("/WebCourseServlet")
public class WebCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public WebCourseServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintStream out = new PrintStream(response.getOutputStream());
		
		Course[] CourseRecords = new Course[7];
		
		CourseRecords[0] = new Course("C101", "Mathematics", 30, 4);
        CourseRecords[1] = new Course("C102", "Physics", 25, 3);
        CourseRecords[2] = new Course("C103", "Chemistry", 20, 4);
        CourseRecords[3] = new Course("C104", "Biology", 40, 3);
        CourseRecords[4] = new Course("C105", "Computer Science", 35, 5);
        CourseRecords[5] = new Course("C106", "History", 28, 2);
        CourseRecords[6] = new Course("C107", "English Literature", 45, 3);

        
        out.println("<h2>Course Records</h2>");
        out.println("<table border='1'><tr>"
        		+ "<th>Course No</th>"
        		+ "<th>Course Name</th>"
        		+ "<th>Max Enrollment</th>"
        		+ "<th>Credits</th"
        		+ "><th>Total Fees</th>"
        		+ "</tr>");
        
        double totalCourseFees = 0;
        for (Course course : CourseRecords) {
            out.println("<tr>");
            out.println("<td>" + course.getCourse_no() + "</td>");
            out.println("<td>" + course.getCourse_name() + "</td>");
            out.println("<td>" + course.getMax_enrl() + "</td>");
            out.println("<td>" + course.getCredits() + "</td>");
            out.println("<td>" + course.CalculateTotalFees() + "$"+ "</td>");
            out.println("</tr>");
            totalCourseFees = totalCourseFees + course.CalculateTotalFees();
        }
        out.println("</table>");
        out.println("<p><strong>The Total of Course Fees is: </strong>" + totalCourseFees + "$"+ "</p>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
