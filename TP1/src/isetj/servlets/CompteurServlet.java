package isetj.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Compteur")
public class CompteurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CompteurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    private int compteur = 0;
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
      HttpSession session = request.getSession(true);
      Integer compteurSession = (Integer)session.getAttribute("compteur");
      if (compteurSession == null) {
        compteurSession = new Integer(1);
      } else {
        compteurSession = new Integer(compteurSession.intValue() + 1);
      }
      session.setAttribute("compteur", compteurSession);
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      out.println("<html>");
      out.println("<head><title>Compteur Servlet</title></head>");
      out.println("<body>");
      out.println("<h1>Compteur Servlet</h1>");
      out.println("<p>Nombre d'appels pendant cette session : " + compteurSession.intValue() + "</p>");
      out.println("</body>");
      out.println("</html>");
	}
}