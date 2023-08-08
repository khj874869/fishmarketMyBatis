package fishmarket.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fishmarket.model.service.MemberService;
import fishmarket.model.vo.Member;

/**
 * Servlet implementation class MyInfoController
 */
@WebServlet("/myinfo.do")
public class MyInfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyInfoController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String memberId = request.getParameter("memberId");
		MemberService service = new MemberService();
		Member member = service.selectOneById(memberId);
		if(member!=null) {
			request.setAttribute("member",member);
			request.getRequestDispatcher("/WEB-INF/views/member/login.jsp").forward(request, response);
		}else {
			request.setAttribute("msg", "회원 정보가 없습니다.");
			request.setAttribute("url", "/index.jsp");
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/common/errorpage.jsp");
			view.forward(request, response);
		}
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}
		

}

