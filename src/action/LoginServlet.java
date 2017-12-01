package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.UserService;
import Service.impl.UserServiceImpl;
import bean.User;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService userService=new UserServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		String re = request.getParameter("remenberMe");
		User user=userService.login(name,pwd);
		if(user==null){
			//失败
			request.setAttribute("error", "用户名或密码不能为空 ");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{
			//
			Cookie c=new Cookie("name", name);
			Cookie c1=new Cookie("upwd", pwd);
			request.getSession().setAttribute("user", user);
			if("on".equals(re)){	
				//设置15天
				c.setMaxAge(15*24*3600);
				c1.setMaxAge(15*24*3600);
				response.addCookie(c);
				response.addCookie(c1);
			}else{
				//没选中记住我，并且登陆成功
				c.setMaxAge(0);
				c1.setMaxAge(0);
				response.addCookie(c);
				response.addCookie(c1);
			}
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
