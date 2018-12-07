<%--
@ page -директива,
может импортировать классы
можно отключать session
с помощью error page перенаправить на errop page
buffer , autoflush


 --%>

<%-- Comments -- http://localhost:8080/admin/jsp/MyJsp.jsp --%>
<%@ page  import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Hello


<%-- подклють JSP можно двумя способами:--%>
<%-- Способ 1. на этапе компиляции
мы видим переменные и методы сервлета forinclude1 --%>
<%@include file="forinclude1.jsp"%>
<%=k+5%>

<%-- Способ 2. на этапе request
переменная j jsp-страницы forinclude2 не видна
именно поэтому лучше всегда импользовать include, что бы случайно не использовать переменную или метод из другой jsp
--%>
<jsp:include page="forinclude2.jsp"/>
<jsp:include page="/servl"/>
<jsp:include page="/WEB-INF/web.xml"/>




<%--
можно перенаправить запрос на другую JSP
<jsp:forward page="/forinclude2.jsp"/>

в сервлете используется redirect
--%>


<%-- Declaratiom --%>
<%! int i=5; %>

<%! private void doJob(){
    System.out.println("Hello2");
}%>

<%-- Expression --%>
<%="hello worlds111"%>

<%-- Scriplets --%>
<%if (Math.random()>0.5){ %>
   <b>HEEEEEL</b>
<%} %>

</br>
<%=i+2%>
</br>
<%=new Date()%>
</br>
<%=request.getMethod()%>
</br>
<%=session.getAttribute("one")%>
</br>
</br
Hello world123456789
</body>
</html>
