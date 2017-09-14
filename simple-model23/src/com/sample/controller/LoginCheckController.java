package com.sample.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.Controller;
import vo.User;

public class LoginCheckController implements Controller{

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		User user1 = new User("hong", "zxcv1234");
		
		return "home.jsp";
	}
}
