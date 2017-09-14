package com.sample.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.Controller;
import vo.User;

public class RegistController implements Controller {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		System.out.println(id + " : " + password + "회원정보 저장 완료");
		return "redirect:home.do";
	}
}
