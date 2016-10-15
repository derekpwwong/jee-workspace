package readingFormServlet;
import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/IF")
public class ReadingFormServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Read fName and lName</title></head>\n"+
		"<body><h1>Reading first and last name</h1>\n"+
		"<ul>\n"+
		"<li><b>first name:</b>"+ request.getParameter("firstName")+"\n"
		+"<li><b>last name:</b>"+ request.getParameter("lastName")+"\n"+
		"</body></html>");

	}

}
