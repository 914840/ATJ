package atj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Get
 */
@WebServlet("/Get")
public class Get extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Get() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter printWriter = response.getWriter();
		
		String parm1 = request.getParameter("val1");
		String parm2 = request.getParameter("stopnie");
		
		String stopnie = stopnie(parm2);
		
		double val = Double.parseDouble(parm1);
		
		double result = konwert(val, parm2);
		
		request.setAttribute("result", new Double(result));
		request.setAttribute("stopnie", stopnie);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("res.jsp");
		requestDispatcher.forward(request, response);
	
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public double konwert(double val, String stopnie)
	{
		double result;
		String c = "Celc", f = "Fahr";
		if(stopnie.equals(c)) {
			result = 32.0 + ((9.0 / 5.0 ) * val);
			return result;
		}
		else if (stopnie.equals(f)){
			result = (5.0 / 9.0) * ( val - 32.0);
			return result;
		}
		return 0;
	}
	
	protected String stopnie(String s) {
		String stopnie = null;
		if (s.equals("Celc")) {
			stopnie = "Fahrenheita";
		}
		else if(s.equals("Fahr")) {
			stopnie = "Celsiusza";
		}
		return stopnie;
	}



}
