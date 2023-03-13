package isetj.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthServlet
 */
@WebServlet("/AuthServlet")
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String login = request.getParameter("login");
        String password = request.getParameter("password");

        // Vérification si les informations d'identification sont correctes
        if ("yassine".equals(login) && "123".equals(password)) {
            // Authentification réussie
          
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h2>Authentification réussie</h2>");
            out.println("</body></html>");
        } else {
            // Echec de l'authentification
        
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h2>Echec à l'authentification</h2>");
            out.println("</body></html>");
        }
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
