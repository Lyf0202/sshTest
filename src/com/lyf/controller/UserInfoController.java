package com.lyf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lyf.po.UserInfo;
import com.lyf.service.UserInfoService;
/**
 * 控制层
 * @author lyf
 *
 */
@Controller
public class UserInfoController {

	/**
	 * 业务逻辑
	 */
	@Autowired
	private UserInfoService service;
	
	
	public void setService(UserInfoService service) {
		this.service = service;
	}


	/**
	 * 
	 * @return
	 */
	@RequestMapping("/userlist.do")
	public String list(Model model){
		List<UserInfo> userlist = null;
		
		try {
			userlist = service.getAllUser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		model.addAttribute("list",userlist);
		return "user_list";
	}
	
}
