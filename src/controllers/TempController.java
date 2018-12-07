package controllers;

import jsp_p.Student;
import main.MyModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet ("/tempController")
public class TempController extends HttpServlet {

    MyModel myModel = new MyModel();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = new Student("Max",22);
        req.setAttribute("stud,", student);

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");

        req.setAttribute("list",list);


        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/jsp/Temp.jsp");
        requestDispatcher.forward(req,resp);





    }
}
