package com.images.sex.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.images.sex.entity.ImgViewer;
import com.images.sex.entity.helper.LoggerFile;
import com.images.sex.entity.impl.ImgImpl;

/**
 * Servlet implementation class ImageServlet
 */
public class ImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		ImgImpl imgImpl = new ImgImpl();
		if(action.equalsIgnoreCase("findall")){
			try {
				List<ImgViewer> imgViewers = (List<ImgViewer>) imgImpl.findAllImg();
				request.setAttribute("listImage", imgViewers);
				RequestDispatcher rd = request.getRequestDispatcher("test.jsp");
				rd.forward(request, response);
			} catch (SQLException e) {
				LoggerFile.logger(e, ImageServlet.class.getName());
				e.printStackTrace();
			}
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
