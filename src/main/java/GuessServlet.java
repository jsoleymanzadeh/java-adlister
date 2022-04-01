import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/guess.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String input = request.getParameter("input");
        String randomNum = String.valueOf((int) Math.floor(Math.random() * 3) + 1);
        System.out.println(randomNum);
        if (!input.equals("1") && !input.equals("2") && !input.equals("3")) {
            response.sendRedirect("/guess");
        } else if (randomNum.equals(input)) {
            request.getRequestDispatcher("/correct").forward(request, response);
        } else {
            request.getRequestDispatcher("/incorrect").forward(request, response);
        }
//        test
    }
}