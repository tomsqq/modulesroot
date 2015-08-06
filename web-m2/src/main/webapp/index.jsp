<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.xinunet.HelloEntity" %>
<%@ page import="com.xiniunet.Show" %>
<%@ page import="com.xiniunet.First" %>
<html>
<body>
<h2>Hello World!</h2>

<%
    HelloEntity he = new HelloEntity("01","孙庆庆","男");
    out.print(Show.show(he));
    out.print(First.hello());
%>



</body>
</html>
