package webBilling;

import java.io.IOException;
import java.io.PrintStream;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WebBillingServlet
 */
@WebServlet("/WebBillingServlet")
public class WebBillingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public WebBillingServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintStream out = new PrintStream(response.getOutputStream());
		
		Billing[] BillingRecords = new Billing[3];
		
		BillingRecords[0] = new Billing("Sharma", "Ritesh", "Chair", 99.99, 2);
        BillingRecords[1] = new Billing("Wick", "John", "Table", 139.99, 1);
        BillingRecords[2] = new Billing("Samson", "Crus", "KeyUSB", 14.99, 2);
        
        
        out.println("<h2>Billing Records</h2>");
        out.println("<table border='1'><tr><th>Client Last Name</th>"
        		+ "<th>Client First Name</th>"
        		+ "<th>Product Name</th>"
        		+ "<th>Price</th>"
        		+ "<th>Quantity</th>"
        		+ "<th>Total Billing</th>"
        		+ "</tr>");
        double totalBillingAmount = 0;
        for (Billing bill : BillingRecords) {
            out.println("<tr>");
            out.println("<td>" + bill.getClient_LName() + "</td>");
            out.println("<td>" + bill.getClient_FName() + "</td>");
            out.println("<td>" + bill.getProduct_Name() + "</td>");
            out.println("<td>" + bill.getPrd_Price() + "</td>");
            out.println("<td>" + bill.getPrd_Qty() + "</td>");
            out.println("<td>" + bill.CalculateBilling() + "$" + "</td>");
            out.println("</tr>");
            totalBillingAmount = totalBillingAmount + bill.CalculateBilling();
        }
        out.println("</table>");
        out.println("<p><strong>Total of Billing: </strong>" + totalBillingAmount + "$" + "</p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
