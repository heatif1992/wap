package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StringBuilder result = new StringBuilder();
        result.append("<html><head><title>login</title>");
        result.append("<h1>You are successfully logged in </h1>");
        result.append("<p>This is your session!</p>");
        result.append("<a href='logout'>Logout</a>");
        result.append("</body></html>");

        PrintWriter out = response.getWriter();
        out.print(result);

    }
}
