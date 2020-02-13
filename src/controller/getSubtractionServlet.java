package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.getCalculation;
import model.getSubtraction;

/**
 * Servlet implementation class getSubtractionServlet
 */
@WebServlet("/getSubtractionServlet")
public class getSubtractionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getSubtractionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String baseNum = request.getParameter("userBaseNum");
		String numOne = request.getParameter("userNumberOne");
		String numTwo = request.getParameter("userNumberTwo");
		String numThree = request.getParameter("userNumberThree");
		String numFour = request.getParameter("userNumberFour");
		
		getSubtraction calculation = new
		getSubtraction(Double.parseDouble(baseNum), Double.parseDouble(numOne), Double.parseDouble(numTwo), Double.parseDouble(numThree), Double.parseDouble(numFour));
		
		request.setAttribute("userNumbersSubtraction", calculation);
		getServletContext().getRequestDispatcher("/resultSubtraction.jsp").forward(request,  response);
		doGet(request, response);
	}

}
