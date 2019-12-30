import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoggingJdbc")
public class LoggingJdbc extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Logger log = Logger.getLogger(LoggingJdbc.class);
String path = "/home/sciera/IdeaProjects/WebAppJdbc/src/main/java/log4j.properties" ;
        PropertyConfigurator.configure(path);
        log.debug("Sample debug message");
        log.info("Sample info message");
        log.error("Sample error message");
        log.fatal("Sample fatal message");

        response.sendRedirect("/home/sciera/IdeaProjects/WebAppJdbc/src/main/Webapp/index.jsp");
    }
}
