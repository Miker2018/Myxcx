package com.swshfu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.swshfu.po.User;
import com.swshfu.service.UserService;

/**
 * 用户处理Controller
 * @author yanzhou
 *
 */
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/userList")
	public ModelAndView getUserById() {
		//根据id查询用户
		User user = userService.findUserById(0);
		//吧结果传递给页面
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("userList", user);
		//设置逻辑视图
		modelAndView.setViewName("userList");
		//返回结果
		return modelAndView;
	}
}
