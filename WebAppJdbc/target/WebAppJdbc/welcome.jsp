<%@ page contentType="text/html; charset=utf-8" language="java" import="java.util.*, java.text.*;" errorPage="" %>
<%!
        DateFormat tipe = new SimpleDateFormat("EEE, MMM d, ''yy");
                Calendar cal = Calendar.getInstance();
                String inTime= tipe.format(cal.getTime());


    %>


Registration is Successful at <% out.print(inTime); %>

Please Login Here <a href='index.jsp'>Go to Login</a>