package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class FirstServlet extends HttpServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res)throws ServletException, IOException {
		System.out.println(req.getServerPort());
		System.out.println(req.hashCode());
	}

}
