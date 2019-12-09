package com.sonbro.emotion.controller;

import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sonbro.emotion.service.EmotionService;
import com.sonbro.emotion.vo.EmotionVO;

@Controller
@RequestMapping("/user/*")
public class EmotionController {
	@Inject
	EmotionService service;
	
	@RequestMapping(value = "/user/joinView", method = RequestMethod.GET)
	private String joinview() {
		return "joinView";
	}
	
	@RequestMapping(value = "/user/join", method = RequestMethod.POST)
	private void join(EmotionVO ev, HttpServletResponse res) throws Exception{
		try {
			service.insertUser(ev);
			System.out.println("insert success");
			//성공
			System.out.println("sucess");
			PrintWriter out = res.getWriter();
			out.println("<script>alert('계정이 등록 되었습니다'); location.href='http://localhost:8080/emotion/user/loginView';</script>");
			out.flush();
		}catch(Exception e) {
			//실패
			System.out.println("failed");
			System.out.println(e.getMessage());
			PrintWriter out = res.getWriter();
			out.println("<script>alert('계정 등록을 실패하였습니다'); location.href='http://localhost:8080/emotion/user/loginView';</script>");
			out.flush();
		}
	}
	
	@RequestMapping(value = "/user/loginView", method = RequestMethod.GET)
	private String loginview() {
		return "loginView";
	}
	
	@RequestMapping(value = "/user/login", method = RequestMethod.POST)
	private String login() {
		return "login";
	}
}
