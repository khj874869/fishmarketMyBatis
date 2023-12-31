package fishmarket.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fishmarket.model.service.MemberService;

/**
 * Servlet implementation class DeleteController
 */
@WebServlet("/delete.do")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberService service = new MemberService();
		String memberId = request.getParameter("memberId");
		int result = service.deleteMemeber(memberId);
		if(result>0) {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/member/login.jsp");
			view.forward(request, response); 
		}
		else {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/member/myInfo.jsp");
			view.forward(request, response); 
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}



