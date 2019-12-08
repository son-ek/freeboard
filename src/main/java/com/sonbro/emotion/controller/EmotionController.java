package com.sonbro.emotion.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	private String join(EmotionVO ev) throws Exception{
		service.insertUser(ev);
		
		return "redirect:/";
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
