package day4.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import day4.beans.User;
import day4.beans.UserValidator;

@WebServlet(name = "myUserValidationServlet", urlPatterns = { "/doValidate" })
public class UserValidationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Fetching the request parameters
        String username = request.getParameter("uid");
        String password = request.getParameter("pwd");

        // Populating User object based upon username and password
        User appUser = new User(username, password);

        // Sending the User object to UserValidator for checking its validity
        boolean valid = UserValidator.isValid(appUser);
        if (valid)
            out.println("<h2 style='color:green'>Congratulations!!, You are IN</h2>");
        else
            out.println("<h2 style='color:red'>Sorry, Access denied due to invalid credentials</h2>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
}
