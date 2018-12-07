<%--
ЧТо такое Bean

обычный класс
есть конструктор по умолчанию
все поля приватные
есть геттеры и сеттеры

http://localhost:8080/admin/jsp/Bean.jsp
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="person" class="jsp_p.Student"/>
<jsp:setProperty name="person" property="name" value="ALex"/>
<jsp:setProperty name="person" property="age" value="21"/>
<jsp:getProperty name="person" property="name"/>
<br>
<jsp:getProperty name="person" property="age"/>

<br>
<br>
<%! String name = "Maz";%>
<jsp:useBean id="person2" class="jsp_p.Student"/>
<jsp:setProperty name="person2" property="name" value="<%=name%>"/>
<jsp:setProperty name="person2" property="age" value="22"/>

<jsp:getProperty name="person2" property="name"/>
<br>
<jsp:getProperty name="person2" property="age"/>
</body>
</html>
