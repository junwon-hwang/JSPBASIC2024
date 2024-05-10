package com.jsp.chap04;

// 역할 : 댄서 등록 화면을 요청하면 해당 HTML파일을 열기만 해주는 역할

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/chap04/dancer/form")
public class DancerFormRequestServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 적당한 view에게 화면처리를 위임
        // forwarding: 화면 파일을 찾아서 열어주는 개념
        // JSP의 경로 및 파일명을 숨길 수 있음 (디렉토리 구조 알려주는 것은 위험함)
        // JSP파일은 WEB-INF에 넣어서 경로를 숨기고 서블릿을 통해 열어줘야함
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/chap04/register.jsp");
        rd.forward(req,resp);
    }
}
