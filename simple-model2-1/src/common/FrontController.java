package common;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.Car;
import vo.userVo;
//FrontController
//와일트 카드 사용해서 .hta로 끝나는 모든 요청을 받는다.
//따라서 front controller는 하나만 있으면 된다.
@WebServlet(urlPatterns="*.hta") 
public class FrontController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("클라이언트의 요청 접수...");
		
		//클라이언트의 요청 분석
		//실제 자원의 위치 = URL (uniform resource location)
		//식별자로써의 경로 = URI(uniform resource identifier)
		String requestURI = request.getRequestURI();
		requestURI = requestURI.replace(request.getContextPath(), "");
		System.out.println("클라이언트의 요청 : "+requestURI);
		
		String viewTemplate = null;
		if("/main.hta".equals(requestURI)){
			//viewTemplate에 데이터 전달하기
			Car car = new Car(2008, "마티즈 Matiz");
			userVo userInfo = new userVo("홍길동", "hong@gmail.com", car);
			request.setAttribute("user", userInfo);
			request.setAttribute("message", "배고파 배고파 배고파 배고파 ");
			viewTemplate = "WEB-INF/views/main.jsp";
		}else if("/login.hta".equals(requestURI)){
			viewTemplate = "WEB-INF/views/login.jsp";
		}else if("/mypage.hta".equals(requestURI)){
			viewTemplate = "WEB-INF/views/mapage.jsp";
		}else {
			viewTemplate = "WEB-INF/views/404.jsp";
		}
		
		// 클라이언트의 요청을 viewTemplate으로 이동시키기
		RequestDispatcher rd = request.getRequestDispatcher(viewTemplate);
		rd.forward(request, response);
	}
}
