package setColorSizeWeight;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/SetColorSizeWeight")
public class SetColorSizeWeight extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE htmL><head><title>SetColorSizeWeight</title>"+
				"<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">"+
				"</head>\n"+
		"<body><h1>SetColorSizeWeight</h1>\n"+
		"<ul>\n"+
		"<li><b>Size:</b> "+ request.getParameter("size")+"\n"
		+"<li><b>Color:</b> "+ request.getParameter("color")+"\n"
		+"<li><b>Weight:</b> "+ request.getParameter("weight")+"\n"+
		"<br><a href=\"index.html\">GO back to home page</a>\n"+
		"</body></html>");

	}
}
