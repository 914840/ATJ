package atj;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String parm1 = request.getParameter("o1");
		String parm2 = request.getParameter("o2");
		String parm3 = request.getParameter("o3");
		String parm4 = request.getParameter("o4");
		String parm5 = request.getParameter("o5");
		String parm6 = request.getParameter("o6");
		String parm7 = request.getParameter("o7");
		String parm8 = request.getParameter("o8");
		String parm9 = request.getParameter("o9");
		String parm10 = request.getParameter("o10");
		
		Cookie[] cookies = request.getCookies();
		
	/*
		String w[] = null;
		for (int i=0; i<10; i++) {
			w[i] = new String();
		}
		String r[] = null;
		for (int i=0; i<10; i++) {
			r[i] = new String();
		}
	*/	
	
		// od w1 do w10 = null
		String w1 = null, w2 = null, w3 = null, w4 = null, w5 = null;
		String w6 = null, w7 = null, w8 = null, w9 = null, w10 = null;
		// od r1 do r10 = null
		String r1 = null, r2 = null, r3 = null, r4 = null, r5 = null;
		String r6 = null, r7 = null, r8 = null, r9 = null, r10 = null;
		
		for(int i=0; i< cookies.length; i++) {
			if(cookies[i].getName().equals("w1")) {
				w1 = cookies[i].getValue();
			}
			if(cookies[i].getName().equals("w2")) {
				w2 = cookies[i].getValue();
			}	
			if(cookies[i].getName().equals("w3")) {
				w3 = cookies[i].getValue();
			}
			if(cookies[i].getName().equals("w4")) {
				w4 = cookies[i].getValue();
			}
			if(cookies[i].getName().equals("w5")) {
				w5 = cookies[i].getValue();
			}
			if(cookies[i].getName().equals("w6")) {
				w6 = cookies[i].getValue();
			}
			if(cookies[i].getName().equals("w7")) {
				w7 = cookies[i].getValue();
			}
			if(cookies[i].getName().equals("w8")) {
				w8 = cookies[i].getValue();
			}
			if(cookies[i].getName().equals("w9")) {
				w9 = cookies[i].getValue();
			}
			if(cookies[i].getName().equals("w10")) {
				w10 = cookies[i].getValue();
			}
			if(cookies[i].getName().equals("rownanie1")) {
				r1 = cookies[i].getValue();
			}
			if(cookies[i].getName().equals("rownanie2")) {
				r2 = cookies[i].getValue();
			}
			if(cookies[i].getName().equals("rownanie3")) {
				r3 = cookies[i].getValue();
			}
			if(cookies[i].getName().equals("rownanie4")) {
				r4 = cookies[i].getValue();
			}
			if(cookies[i].getName().equals("rownanie5")) {
				r5 = cookies[i].getValue();
			}
			if(cookies[i].getName().equals("rownanie6")) {
				r6 = cookies[i].getValue();
			}
			if(cookies[i].getName().equals("rownanie7")) {
				r7 = cookies[i].getValue();
			}
			if(cookies[i].getName().equals("rownanie8")) {
				r8 = cookies[i].getValue();
			}
			if(cookies[i].getName().equals("rownanie9")) {
				r9 = cookies[i].getValue();
			}
			if(cookies[i].getName().equals("rownanie10")) {
				r10 = cookies[i].getValue();
			}
		}
		
		Integer pkt1 = chackAnswer(parm1, w1);
		Integer pkt2 = chackAnswer(parm2, w2);
		Integer pkt3 = chackAnswer(parm3, w3);
		Integer pkt4 = chackAnswer(parm4, w4);
		Integer pkt5 = chackAnswer(parm5, w5);
		Integer pkt6 = chackAnswer(parm6, w6);
		Integer pkt7 = chackAnswer(parm7, w7);
		Integer pkt8 = chackAnswer(parm8, w8);
		Integer pkt9 = chackAnswer(parm9, w9);
		Integer pkt10 = chackAnswer(parm10, w10);
		Integer suma = pkt1 + pkt2 + pkt3 + pkt4 + pkt5 + pkt6 + pkt7 + pkt8 + pkt9 + pkt10;
		Integer ocena = rateAnswers(suma);
		
		
		request.setAttribute("w1", w1);
		request.setAttribute("w2", w2);
		request.setAttribute("w3", w3);
		request.setAttribute("w4", w4);
		request.setAttribute("w5", w5);
		request.setAttribute("w6", w6);
		request.setAttribute("w7", w7);
		request.setAttribute("w8", w8);
		request.setAttribute("w9", w9);
		request.setAttribute("w10", w10);
		request.setAttribute("odp1", parm1);
		request.setAttribute("odp2", parm2);
		request.setAttribute("odp3", parm3);
		request.setAttribute("odp4", parm4);
		request.setAttribute("odp5", parm5);
		request.setAttribute("odp6", parm6);
		request.setAttribute("odp7", parm7);
		request.setAttribute("odp8", parm8);
		request.setAttribute("odp9", parm9);
		request.setAttribute("odp10", parm10);
		request.setAttribute("rownanie1", r1);
		request.setAttribute("rownanie2", r2);
		request.setAttribute("rownanie3", r3);
		request.setAttribute("rownanie4", r4);
		request.setAttribute("rownanie5", r5);
		request.setAttribute("rownanie6", r6);
		request.setAttribute("rownanie7", r7);
		request.setAttribute("rownanie8", r8);
		request.setAttribute("rownanie9", r9);
		request.setAttribute("rownanie10", r10);
		request.setAttribute("pkt1", pkt1);
		request.setAttribute("pkt2", pkt2);
		request.setAttribute("pkt3", pkt3);
		request.setAttribute("pkt4", pkt4);
		request.setAttribute("pkt5", pkt5);
		request.setAttribute("pkt6", pkt6);
		request.setAttribute("pkt7", pkt7);
		request.setAttribute("pkt8", pkt8);
		request.setAttribute("pkt9", pkt9);
		request.setAttribute("pkt10", pkt10);
		request.setAttribute("ocena", ocena);
		request.setAttribute("suma", suma);
		
		
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
	
	protected Integer chackAnswer(String a, String b)
	{
		if(a.equals(b)) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	protected Integer rateAnswers(Integer suma) {
		Integer ocena = null;
		if (suma < 6) {
			ocena = 1;
		}
		else if (suma == 6) {
			ocena = 2;
		}
		else if (suma == 7) {
			ocena = 3;
		}
		else if (suma == 8) {
			ocena = 4;
		}
		else if (suma == 9) {
			ocena = 5;
		}
		else if (suma == 10) {
			ocena = 6;
		}
		return ocena;
	}
	
}
