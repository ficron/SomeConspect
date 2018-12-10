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


В J2EE есть четыре контейнерных объектв, в которых можно сохранять объекты.
1. PageContext - доступен только в jsp странице
2. HttpServletRequest - текущий запрос пользователя
3. HttpSession - храняться данные сеанса работы пользователя
4. ServletContext - общий для всего web приложения
--%>
${list[1]}
${cookie.JSESSIONID}


</body>
</html>
