package com.hta.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.Controller;

public class AboutController implements Controller{

	@Override
	public void process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// main.jsp에 표시할 데이터를 조회/가공한다. <-- about.do 요청을 처리한다.
		
		System.out.println("AboutController process() 실행중 ...");
		
		String type = request.getParameter("type");
		System.out.println("문의 분야 : " + type);
		if("job".equals(type)){
			request.setAttribute("category", "채용분야 문의");
			List<String> jobs = Arrays.asList("전산경력직 모집", "영업신입사원 모집");
			request.setAttribute("list", jobs);
		}else if("project".equals(type)){
			request.setAttribute("category", "프로젝트분야 문의");
			List<String> projects = Arrays.asList("국방부 하반기 프로젝트", "국민은행 공인인증서 폐기 프로젝트");
			request.setAttribute("list", projects);
		}else if("etc".equals(type)){
			request.setAttribute("category", "채용분야 문의");
			List<String> others = Arrays.asList("이벤트 관련", "홈페이지 개편 관련");
			request.setAttribute("list", others);
		}
	}
}
