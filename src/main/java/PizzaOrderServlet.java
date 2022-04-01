import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.printf("Crust: %s\nSauce: %s\nSize: %s\nToppings: %s\nAddress: %s", request.getParameter("crust"), request.getParameter("sauce"), request.getParameter("size"), request.getParameter("toppings"), request.getParameter("address"));
        request.getRequestDispatcher("/pizza-order.jsp").forward(request, response);
    }
}