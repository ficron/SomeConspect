<%@ page import="jsp_p.Student" %><%--
  Created by IntelliJ IDEA.
  User: Max
  Date: 06/12/2018
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyView</title>
</head>
<body>
<%--
В чем разница?
        эта запись
        <jsp:useBean id="Student" class="jsp_p.Student" scope="request"/>
            аналогична (в Servlet)
        Student student = myModel.getStudent();
        req.setAttribute("Student", student);


        эта запись
        <jsp:useBean id="Student" class="jsp_p.Student" scope="session"/>
             аналогична (в Servlet)
        Student student = myModel.getStudent();
        req.getSession().setAttribute("Student", student);

        эта запись
        <jsp:useBean id="Student" class="jsp_p.Student" scope="application"/>
        Student student = myModel.getStudent();
        req.getServletContext().setAttribute("Student", student);


<jsp:useBean id="Student" class="jsp_p.Student" scope="request"/>
<jsp:useBean id="Student" class="jsp_p.Student" scope="session"/>
<jsp:useBean id="Student" class="jsp_p.Student" scope="application"/>

--%>

<jsp:useBean id="Student" class="jsp_p.Student" scope="request"/>
<jsp:getProperty name="Student" property="name"/>
<jsp:getProperty name="Student" property="age"/>
 </body>
</html>
