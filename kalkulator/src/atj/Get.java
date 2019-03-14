package atj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.regexp.internal.REUtil;
import com.sun.research.ws.wadl.Request;

/**
 * Servlet implementation class Get
 */
@WebServlet("/Get")
public class Get extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter printWriter = response.getWriter();
		
		String parametr1 = request.getParameter("val1");
		String parametr2 = request.getParameter("dzialanie");
		String parametr3 = request.getParameter("val2");
		
		double val1 = Double.parseDouble(parametr1);
		double operacja = Double.parseDouble(parametr2);
		double val2 = Double.parseDouble(parametr3);
		
		double result = calc(val1, val2, operacja);
	
		
		request.setAttribute("result", new Double(result));
		
		printWriter.println(result);
		//System.out.println(result);
		

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("res.jsp");
		requestDispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public double calc(double val1, double val2, double operacja){
		
		
		if(operacja == 1){
			double result = val1 + val2;
			return result;
		}
		else if(operacja == 2.0){
			double result = val1 - val2;
			return result;
		}
		else if(operacja == 3.0){
			double result = val1 * val2;	
			return result;
		}
		else if(operacja == 4.0){
			double result = val1 / val2;
			return result;
		}
		return 0;
	}

}
