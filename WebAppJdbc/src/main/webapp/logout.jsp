<%@ page contentType="text/html; charset=utf-8" language="java" import="java.util.*, java.text.*;" errorPage="" %>
<%!
        DateFormat tipe = new SimpleDateFormat("EEE, MMM d, ''yy");
        Calendar cal = Calendar.getInstance();
        String outTime= tipe.format(cal.getTime());

    %>
<%

session.setAttribute("userName", null);
session.invalidate();
response.sendRedirect("logging.jsp");

%>