package servletPackage;
import java.io.*;
import java.util.Random;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import createColRow.CreateColumnRow;

@WebServlet("/ServletCreateColumnRow")
public class ServletCreateColumnRow extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE htmL>\n <html>\n" +
				"<head><title>Servlet Creating Column and Row</title>" +
				"<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">"+
				"</head> \n <body bgcolor=\"#fdf5e6\">\n" +
				"<h1>Columns and Rows!</h1>\n"+
				"<h2>A 10 X 10 Grid</h2>" +
				"<table>"
				+CreateColumnRow.createTable(10)
				+"</table>" 
				+"<a href=\"index.html\">Go back to index!</a>"+
				"</body></html>");

	}

}
