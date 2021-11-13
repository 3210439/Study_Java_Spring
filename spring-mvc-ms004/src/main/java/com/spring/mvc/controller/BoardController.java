package com.spring.mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String registerForm() { 
		logger.info("get");
		return "/board/register";
	}
	
	@RequestMapping(value = "/register", method=RequestMethod.POST)
	public String register() {
		logger.info("post");
		return "/board/success";
	}

	@RequestMapping(value = "/modify", method=RequestMethod.GET)
	public String modifyForm() {
		logger.info("get");
		return "/board/modify";
	}
	
	@RequestMapping(value = "/modify", method=RequestMethod.POST)
	public String modify() {
		logger.info("post");
		return "/board/success";
	}

	@RequestMapping(value="/remove", method=RequestMethod.POST)
	public String remove() {
		return "/board/success";
	}
	
	@RequestMapping("/list")
	public String list() {
		return "/board/list";
	}
	
	@RequestMapping(value = "/read", method=RequestMethod.GET)
	public String read(@RequestParam(value = "boardno") int boardno)
	{
		logger.info("boardno: "+boardno);
		return "board/read";
	}

	@RequestMapping("/read2/{no}")
	public String read2(@PathVariable("no") int boardno)
	{
		logger.info("boardno: "+boardno);
		return "board/read";
	}
}
