package com.bit2015.guestbook.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit2015.guestbook.dao.GuestbookDao;
import com.bit2015.guestbook.vo.GuestbookVo;

@WebServlet("/gb")
public class GuestbookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost( request, response );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding( "UTF-8" );
		
		String a = request.getParameter( "a" );
		
		if( "deleteform".equals( a ) ) {
			forwarding( request, response, "/views/deleteform.jsp" );
		} else if(  "delete".equals( a )  ) {
			String no = request.getParameter( "no" );
			String password = request.getParameter( "password" );
			
			GuestbookVo vo = new GuestbookVo();
			vo.setNo( Long.parseLong( no ) );
			vo.setPassword(password);
			
			GuestbookDao dao = new GuestbookDao();
			dao.delete(vo);
			
			response.sendRedirect( "/guestbook2/gb" );
			
		} else if( "insert".equals( a )  ) {
			String name = request.getParameter( "name" );
			String password = request.getParameter( "pass" );
			String message = request.getParameter( "content" );
			
			GuestbookVo vo = new GuestbookVo();
			vo.setName(name);
			vo.setPassword(password);
			vo.setMessage(message);
			
			GuestbookDao dao = new GuestbookDao();
			dao.insert(vo);
			
			response.sendRedirect( "/guestbook2/gb" );			
		} else {
			// default(idnex) action
			GuestbookDao dao= new GuestbookDao();
			List<GuestbookVo> list = dao.getList();

			request.setAttribute( "list", list );
			forwarding( request, response, "/views/index.jsp" );
		}
	}
	
	private void forwarding(
		HttpServletRequest request,
		HttpServletResponse response,
		String path ) throws ServletException, IOException {
			
		RequestDispatcher requestDispatcher =
				request.getRequestDispatcher( path );
		requestDispatcher.forward( request, response );
	}	
}
