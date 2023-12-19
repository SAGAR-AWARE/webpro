package day3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet(name = "myHelloWorldServlet", urlPatterns = { "/Hello" })
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		String mimeType = "text/html";
		response.setContentType(mimeType);
		
		String responseText = "<center><h1 style='color:red'>Sanam Bewafa hai</h1></center>";
		
		//Obtaining PrintWriter associated with the response
		PrintWriter out = response.getWriter();
		out.println(responseText);
	}

}
