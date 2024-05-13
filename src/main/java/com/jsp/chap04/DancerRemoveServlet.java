package com.jsp.chap04;
import com.jsp.repository.DancerJdbcRepo;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/chap04/remove")
public class DancerRemoveServlet extends HttpServlet {

    private final DancerJdbcRepo repo = DancerJdbcRepo.getInstance();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("삭제 요청 서버에 들어옴");

        // 삭제를 하려면 데이터베이스에서 해당 데이터를 지워야 함
        // 지우려면 객체 뭘 지워야 할지 클라이언트가 알려줘야 함
        // 클라이언트에서 보낸 url에 붙은 id값 읽어오기

        String id = req.getParameter("id");
        System.out.println("id = " + id);

        // db에 삭제명령
        repo.delete(id);

        // /chap04/show-list 요청을 자동으로 보냄(리다이렉션)
        resp.sendRedirect("/chap04/show-list");
    }
}
