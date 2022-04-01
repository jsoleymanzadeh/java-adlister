import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessLoseServlet", urlPatterns = "/incorrect")
public class GuessLoseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String outcome = "Lose";
        request.setAttribute("outcome", outcome);
        request.getRequestDispatcher("/guess-outcome.jsp").forward(request, response);
    }
}