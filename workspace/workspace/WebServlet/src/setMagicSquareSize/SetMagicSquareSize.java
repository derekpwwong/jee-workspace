package setMagicSquareSize;
import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import servletGenerateMagicSquare.ServletGenerateMagicSquare;

@WebServlet("/SetMagicSquareSize")
public class SetMagicSquareSize extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE htmL><head><title>Create a dynamic magic square size</title>"+
		"<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">"+
		"</head>\n"+
		"<body><h1>A magic square with the size of "+request.getParameter("size")+"</h1>\n"+
		"<ul>\n"+
		"<table>"+
		ServletGenerateMagicSquare.returnMagicSquare(Integer.parseInt(request.getParameter("size")))+
		"</table>"+
		"<br><br><a href=\"index.html\">Go back to index!</a>"+
		"</body></html>");
		//response.sendRedirect("http://www.google.com");

	}
}
