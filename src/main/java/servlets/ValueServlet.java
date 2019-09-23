package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ValueServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {

        String value = request.getParameter("value");
        if (value == null || value.isEmpty()) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().println(0);
        } else {
            response.setStatus(HttpServletResponse.SC_OK);
            response.getWriter().println(2 * Integer.parseInt(value));
        }
        response.setContentType("text/html;charset=utf-8");
    }
}
