package servlets.java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;


@WebServlet("/webservlet")
public class HelloWebServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*
        Recommended method for escaping HTML in Java
        https://stackoverflow.com/questions/1265282/recommended-method-for-escaping-html-in-java

        List of HTTP status codes
        https://en.wikipedia.org/wiki/List_of_HTTP_status_codes
         */
        System.out.println("----");
        String one = req.getParameter("one");
        System.out.println(one);
        String two = req.getParameter("two");
        System.out.println(two);
        String three = req.getParameter("three");
        System.out.println(three);

        Enumeration<String> parametrNames = req.getParameterNames();
        while (parametrNames.hasMoreElements()){
            String elementName = parametrNames.nextElement();
            System.out.println(elementName +" = "+req.getParameter(elementName));
        }

        Map<String,String[]> param = req.getParameterMap();
        System.out.println("req.getRequestURI(): "+req.getQueryString());
        System.out.println("req.getRequestURI(): "+req.getRequestURI());
        System.out.println("req.getRequestURL(): "+req.getRequestURL());
        System.out.println("req.getServletPath(): "+req.getServletPath());
        System.out.println("req.getRemoteHost(): "+req.getRemoteHost());
        System.out.println("req.getLocalPort(): "+req.getLocalPort());

        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String s = headerNames.nextElement();
            System.out.println(s+" = "+req.getHeader(s));
        }

        //resp.setStatus(HttpServletResponse.SC_OK);
        //resp.sendRedirect("http://dtek-kem.com.ua");
        //resp.sendError(HttpServletResponse.SC_BAD_REQUEST,"blaaaaaaaaa");
        resp.setHeader("Refresh","1"); // каждую 1 секунду наша страница будет Refresh
        resp.setHeader("Refresh","5;http://dtek-kem.com.ua"); // через 5 секунд произойдет редирект
        System.out.println("hello");

    }
}
