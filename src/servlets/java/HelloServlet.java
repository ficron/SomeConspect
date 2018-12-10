package servlets.java;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = getServletConfig().getInitParameter("name");
        Integer age = Integer.valueOf(getServletConfig().getInitParameter("age"));
        resp.getWriter().write("hello from another side"+"");
        resp.getWriter().write("age "+age);
        resp.getWriter().write("name "+name);

        resp.getWriter().write(getServletContext().getInitParameter("email"));

        /*
        В J2EE есть четыре контейнерных объектв, в которых можно сохранять объекты.
1. PageContext - доступен только в jsp странице
2. HttpServletRequest - текущий запрос пользователя
3. HttpSession - храняться данные сеанса работы пользователя
4. ServletContext - общий для всего web приложения
         */
    }
}
