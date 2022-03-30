import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    private int pageViews;

    @Override
    public void init() {
        pageViews = 0;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        String name = req.getParameter("name");
        boolean reset = Boolean.parseBoolean(req.getParameter("reset"));
        if (name == null) {
            name = "World";
        }
        if (reset) {
            init();
        }
        pageViews++;
        res.setContentType("text/html");
        out.printf("<h1>Hello, %s!</h1>", name);
        out.printf("<p>Page Views: %d", pageViews);
    }
}