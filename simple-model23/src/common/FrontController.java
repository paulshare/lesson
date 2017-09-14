package common;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class FrontController extends HttpServlet{

	private Properties prop;
	
	public void init() throws ServletException{
		prop = new Properties();
		try {
			prop.load(this.getClass().getResourceAsStream("mappings.properties"));
			System.out.println(prop);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ServletException(e);
		}
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String requestURI = request.getRequestURI().replace(request.getContextPath(), "");
		System.out.println("요청 URL : "+requestURI);					//mapper의 key값으로 사용된다.
		
		//controller 이름 알아내기
		String controllerClassName = prop.getProperty(requestURI); // mapper의 requestURI key의 value값
		System.out.println("컨트롤러 클래스명 : " + controllerClassName);
		
		// controller 객체 생성하기
		Controller controller = null;
		try {
			if(controllerClassName != null){
				controller = (Controller) Class.forName(controllerClassName).newInstance();
			}
			//controller 실행
			String viewTemplate = null;
			if(controller != null){
				viewTemplate = controller.process(request, response);
			}
			if(viewTemplate != null)
				if(viewTemplate.startsWith("redirect:")){
					viewTemplate = viewTemplate.replace("redirect:", "");
					response.sendRedirect(viewTemplate);
				}else{
					request.getRequestDispatcher("WEB-INF/views/" + viewTemplate).forward(request, response);
				}
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
