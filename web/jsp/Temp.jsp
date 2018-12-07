<%--
Expression Language
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>TempJSP</title>

</head>
<body>

<%--
Expression Language
${stud.name}
${stud.age}
${sessionScope.stud.name}
--%>
${list[1]}
${cookie.JSESSIONID}


</body>
</html>
