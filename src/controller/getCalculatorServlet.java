package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.getCalculation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class getNumbersServlete
 */
@WebServlet("/getCalculatorServlet")
public class getCalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCalculatorServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String numOne = request.getParameter("userNumberOne");
		String numTwo = request.getParameter("userNumberTwo");
		String numThree = request.getParameter("userNumberThree");
		String numFour = request.getParameter("userNumberFour");
		
		getCalculation calculation = new
		getCalculation(Double.parseDouble(numOne), Double.parseDouble(numTwo), Double.parseDouble(numThree), Double.parseDouble(numFour));
		
		request.setAttribute("userNumbers", calculation);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request,  response);
	}
}