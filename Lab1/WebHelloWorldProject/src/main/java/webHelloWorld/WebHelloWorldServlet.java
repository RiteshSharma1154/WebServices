package webHelloWorld;

import java.io.IOException;
import java.io.PrintStream;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WebHelloWorldServlet
 */
@WebServlet("/WebHelloWorldServlet")
public class WebHelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public WebHelloWorldServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintStream out = new PrintStream(response.getOutputStream());
		out.println("/( '_' )/ Hello World, so cool to develop website /( '_' )/");
		out.println("<html><head><title>Servlet Technology Lab1</title></html>");
		out.println("<body><h1>Vanier College</h1>");
		
		double prd_price = 5.99;
		double prd_Qty = 6;
		double total_Billing;
		
		total_Billing = prd_price * prd_Qty;
		
		//View as dynamic HTML table
		out.println("<table border=\"1\"><tr><th>Prd Price</th><th>Prd Qty</th>"+
					"<th>Total Bill </th></tr>");
		
		out.println("<tr> <td>" + prd_price + "</td> <td>" + prd_Qty + "</td>"
				   +"<td>" + total_Billing + "</td> </tr> </table>");
		
		
		//Instantiate object from concrete classes
		//Web pattern : MVC
		University myUniversity = new University("Montreal Uni", 2024, 3);
		out.println("<br>"+myUniversity.getName());
		out.println("<br>"+myUniversity.getYearsOfExblishment());
		out.println("<br>"+myUniversity.getNumOfProject());
		
		//Use Array of objects of two record and print using for loop
		University[] universityArr = new University[2];
		for ( int i = 0 ; i <universityArr.length ; i++)
		{
			universityArr[i] = new University();
		}
		
		universityArr[0].setName("Toronto Uni");
		universityArr[0].setNumOfProject(6);
		universityArr[0].setYearsOfExblishment(2022);
		
		
		universityArr[1].setName("Montreal Uni");
		universityArr[1].setNumOfProject(3);
		universityArr[1].setYearsOfExblishment(2023);
		
				
		
		for ( int i = 0 ; i <universityArr.length ; i++)
		{
			out.println("<br>"+universityArr[i]);
		}
		
		out.println("<br>");
		out.println("<br>"+"Use array list of two records");
		//Use array list of two records
		out.println("<br>");
		out.println("<br>"+"Use Hash Map of two record where name is key");
		//Use Hash Map of two record where name is key
		out.println("<br>");
		out.println("<br>"+"Use Lambda Expression to print Array List and Hash Map ");
		//Use Lambda Expression to print Array List and Hash Map  
		
		
		//Use Array of Objects
		
		//Use Array List
		
		//Use hash map
		
		
		
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
