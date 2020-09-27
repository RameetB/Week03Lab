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
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response); //loads the ageCalculator.jsp
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String currentAge = request.getParameter("age");

        if (currentAge == null || currentAge.equals("")) {

            request.setAttribute("message", "You must give your current age");

            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response); //resend to base form
            return;
        }
        int age = Integer.parseInt(currentAge);
        int newAge = age + 1;
        request.setAttribute("message", "Your age next birthday will be " + newAge);
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }
}
