package com.blc.training.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.blc.training.model.Voiture;

public class VoitureServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Voiture v1 = new Voiture();
		
		v1.setName("HELLO_MY_WORLD_CHANGED");
		
		resp.getWriter().print(v1.getName());
	}

}
