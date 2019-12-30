<%@ page import="org.apache.log4j.Logger" %>
<%@ page contentType="text/html"%>
<%@ page import = "javax.servlet.RequestDispatcher" %>
<html>
    <head>
        <title>Demonstration log4j usage in jsp</title>
    </head>





            <jsp:include page="/LoggingJdbc" />



 <body>
        <!-- <b>The log messages are shown in the Tomcat console and in the ${catalina.home}/logs/demo.log file.</b> -->
    </body>
    <form method="get" action="index.jsp">
    <input type="submit" value="Index" />
    </form>
</html>