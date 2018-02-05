import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Servlet", urlPatterns = "/Servlet")
public class Servlet extends HttpServlet {

    private int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12 = 0;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String car = request.getParameter("car");
        String color = request.getParameter("color");


        if (!name.equals("") && !age.equals("") && car != null && color != null) {

            n1 += (car.equals("bmw") && color.equals("black")) ? 1 : 0;
            n2 += (car.equals("bmw") && color.equals("red")) ? 1 : 0;
            n3 += (car.equals("bmw") && color.equals("white")) ? 1 : 0;
            n4 += (car.equals("bmw") && color.equals("silver")) ? 1 : 0;

            n5 += (car.equals("audi") && color.equals("black")) ? 1 : 0;
            n6 += (car.equals("audi") && color.equals("red")) ? 1 : 0;
            n7 += (car.equals("audi") && color.equals("white")) ? 1 : 0;
            n8 += (car.equals("audi") && color.equals("silver")) ? 1 : 0;

            n9 += (car.equals("mercedes") && color.equals("black")) ? 1 : 0;
            n10 += (car.equals("mercedes") && color.equals("red")) ? 1 : 0;
            n11 += (car.equals("mercedes") && color.equals("white")) ? 1 : 0;
            n12 += (car.equals("mercedes") && color.equals("silver")) ? 1 : 0;

            HttpSession session = request.getSession();
            session.setAttribute("name", name);
            session.setAttribute("age", age);
            session.setAttribute("car", car);
            session.setAttribute("color", color);

            session.setAttribute("n1", n1);
            session.setAttribute("n2", n2);
            session.setAttribute("n3", n3);
            session.setAttribute("n4", n4);
            session.setAttribute("n5", n5);
            session.setAttribute("n6", n6);
            session.setAttribute("n7", n7);
            session.setAttribute("n8", n8);
            session.setAttribute("n9", n9);
            session.setAttribute("n10", n10);
            session.setAttribute("n11", n11);
            session.setAttribute("n12", n12);

            response.sendRedirect("result.jsp");
        } else {
            response.sendRedirect("error.jsp");
        }
    }
}
