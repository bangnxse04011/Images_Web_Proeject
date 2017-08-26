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

public class ImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ImageServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String action = request.getParameter("action");
//		if(action.equalsIgnoreCase("findall")){
			try {
				List<ImgViewer> imgViewers = (List<ImgViewer>) ImgImpl.getInstance().findAllImg();
				request.setAttribute("listImage", imgViewers);
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				rd.forward(request, response);
			} catch (SQLException e) {
				LoggerFile.logger(e, ImageServlet.class.getName());
				e.printStackTrace();
			}
//		}
	}
}
