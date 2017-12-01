package action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.UserService;
import Service.impl.UserServiceImpl;
import bean.User;

/**
 * Servlet implementation class FindAllServlet
 */
public class FindAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService userService=new UserServiceImpl();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindAllServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> list=userService.findAll();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/alluser.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
