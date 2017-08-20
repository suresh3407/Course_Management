<%-- 
    Document   : index
    Created on : May 4, 2017, 5:24:28 PM
    Author     : suresh
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.bigdata.entity.Course"%>


<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<h1>hello application</h1>
<%
    try
    {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
    String q="insert into tbl_demo (name) values(?)";
    PreparedStatement ps=con.prepareStatement(q);
    ps.setString(1, "sushil");
    ps.execute();
    }
    catch(Exception e)
    {
        out.println(e.toString());
    }
    


   %>

</body>
</html>
