package servlets.java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Random;

@WebServlet("/sess")

/*
Cookies обычно хранят идентификаторы сессии
Session -хранит состояние, некий блок информации который благодаря Cookies (session ID) ассоциирован с вами
сама сессия хранится в req

по умолчанию сессия живет 30 минут
сессия храниться на сервере
 */
public class SessionServlet  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Enumeration<String> attributesNames= session.getAttributeNames();
        while (attributesNames.hasMoreElements()){
            String attributeName = attributesNames.nextElement();
            System.out.println(attributeName+ " = "+session.getAttribute(attributeName));
        }
        session.setAttribute(new Random().doubles()+"",new Random().longs()+"");
    }
}
