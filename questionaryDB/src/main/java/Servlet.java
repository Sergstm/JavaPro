
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Servlet", urlPatterns = "/Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String car = request.getParameter("car");
        String color = request.getParameter("color");

        if (!name.equals("") && !age.equals("") && car != null && color != null) {
            BaseController controller = new BaseController();
//            controller.init();
            controller.setData(name, Integer.parseInt(age), car, color);

            HttpSession session = request.getSession();
            List<Integer> list = controller.resData();
            for (int i = 0; i < 12; i++) {
                session.setAttribute(String.valueOf(i), list.get(i));
            }
            response.sendRedirect("result.jsp");
        } else {
            response.sendRedirect("error.jsp");
        }
    }
}
