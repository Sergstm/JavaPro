import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Servlet", urlPatterns = "/Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String car = request.getParameter("car");
        String color = request.getParameter("color");
        String res = "car: " + car + " color: " + color;

        if (!name.equals("") && !age.equals("") && car != null && color != null) {
            HttpSession session = request.getSession();
            session.setAttribute("name", name);
            session.setAttribute("age", age);
            session.setAttribute("car", car);
            session.setAttribute("color", color);
            session.setAttribute("res", res);

            response.sendRedirect("result.jsp");
        } else {
            response.sendRedirect("error.jsp");
        }
    }
}
