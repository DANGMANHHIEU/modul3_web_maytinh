package com.example.maytinh;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "servlet",value = "/maytinh")
public class MayTinhServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float number1 = Float.parseFloat(req.getParameter("number1"));
        float number2 = Float.parseFloat(req.getParameter("number2"));
        char a = req.getParameter("aa").charAt(0);

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1>Ket Qua: </h1>");
        try {
            float result = MayTinh.KetQua(number1,number2,a);
            writer.println("<h1>"+number1 + " "+a+" "+number2+" "+"="+" "+result+ "</h1>");
        }catch (Exception e){
            writer.println("Error: " + e.getMessage());
        }
        writer.println("</html>");
    }
}
