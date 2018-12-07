package servlets.java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
Cookies обычно хранят идентификаторы сессии
 */
@WebServlet ("/servl")
public class CookiesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("I am here");
        Cookie[] cookies =req.getCookies();
        for(int i=0;cookies!=null&&i<cookies.length;i++){
            System.out.println(cookies[i].getName());
            System.out.println(cookies[i].getValue());
        }

        Cookie cookie = new Cookie("testCooke", "abc");
        cookie.setMaxAge(5); // живет 5 секунд
        cookie.setPath("/servl");  //видимость ooockis будет ограничена страницей
        cookie.setDomain("/servl");  //ooockis будет ограничена конкртетным поддоменом, другой домен и так не видит
        resp.addCookie(cookie);


    }
}
