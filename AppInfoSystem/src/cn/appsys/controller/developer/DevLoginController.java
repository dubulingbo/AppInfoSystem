package cn.appsys.controller.developer;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.appsys.pojo.DevUser;
import cn.appsys.service.developer.DevUserService;
import cn.appsys.tools.Constants;

@Controller
@RequestMapping(value="/dev")
public class DevLoginController {
	@Resource
	private DevUserService service;
	private Logger logger = Logger.getLogger(DevLoginController.class);
	
	@RequestMapping(value="/login")
	public String login(){
		logger.debug("LoginController welcome AppInfoSystem developer=======");
		return "devlogin";
	}
	
	@RequestMapping(value="/dologin",method=RequestMethod.POST)
	public String dologin(@RequestParam String devCode,@RequestParam String devPassword,
			HttpSession session,HttpServletRequest request){
		logger.debug("dologin===================");
		//调用service方法，进行用户的验证
		DevUser devUser = null;
		devUser = service.login(devCode, devPassword);
		if(devUser != null){
			//放session
			session.setAttribute(Constants.DEV_USER_SESSION, devUser);
			//页面跳转(main.jsp)
			return "redirect:/dev/flatform/main";
			
		}else{
			//保留在devlogin.jsp，带出一些提示信息
			request.setAttribute("error", "用户名或密码不正确");
			return "devlogin";
		}
	}
	
	@RequestMapping(value="/flatform/main")
	public String main(HttpSession session){
		if(session.getAttribute(Constants.DEV_USER_SESSION) == null){
			return "redirect:/dev/login";
		}else{
			return "developer/main";
		}
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpSession session){
		//清除session
		session.removeAttribute(Constants.DEV_USER_SESSION);
		return "redirect:login";
	}
	
}
