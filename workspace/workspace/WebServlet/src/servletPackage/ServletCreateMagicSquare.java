package servletPackage;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import servletGenerateMagicSquare.ServletGenerateMagicSquare;

@WebServlet("/ServletCreateMagicSquare")
public class ServletCreateMagicSquare extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE htmL>\n <html>\n" +
				"<head><title>Servlet Creating Magic Square</title>" +
				"<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">"+
				"</head> \n <body bgcolor=\"#fdf5e6\">\n" +
				"<h1>Magic Square!</h1>\n"+
				"<h2>With a size of 5</h2>" +
				"<table>"
				+ServletGenerateMagicSquare.returnMagicSquare(5)
				+"</table>" 
				+"<a href=\"index.html\">Go back to index!</a>"+
				"</body></html>");

	}
}