import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/** Search page servlet.
 */
public class SearchServlet extends HttpServlet {
	
	private String jsp;

	public void init() {
		jsp = getServletConfig().getInitParameter("searchJSP");
	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		doGetOrPost(req, resp);
		return;
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		doGetOrPost(req, resp);
		return;
	}

	private void doGetOrPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		forwardReq(jsp, req, resp);
		return;
	}
	
	private void forwardReq(String resource, HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher(resource).forward(req, resp);
		return;
	}
}
