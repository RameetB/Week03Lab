/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 814992
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("message", "Result: ---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response); //loads the arithmeticCalculator.jsp

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");

        request.setAttribute("first", first);
        request.setAttribute("second", second);

        if (first == null || first.equals("") || second == null || second.equals("")) {
            request.setAttribute("message", "Result: invalid");

            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response); //loads the arithmeticCalculator.jsp

            return;
        }
        int firstNum = Integer.parseInt(first);
        int secondNum = Integer.parseInt(second);
        int result = 0;

        String calculation = request.getParameter("calculation");

        if ("*".equals(calculation)) {
            result = (firstNum * secondNum);
        } else if ("-".equals(calculation)) {
            result = (firstNum - secondNum);
        } else if ("/".equals(calculation)) {
            result = (firstNum / secondNum);
        } else if ("+".equals(calculation)) {
            result = (firstNum + secondNum);
        }

        request.setAttribute("message", "Result: " + result);

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response); //loads the arithmeticCalculator.jsp

    }

}
