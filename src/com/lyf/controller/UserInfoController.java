package com.lyf.controller;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	
	@RequestMapping("/testResponse.do")
	public void testResponse(HttpServletRequest request, HttpServletResponse response){
		Map<String, String> parameters = new HashMap<String, String>();
		Map<String, String[]> map = request.getParameterMap();
		for (String keySet : map.keySet()) {
			System.out.println("request key = -" + keySet + "---value = -"
					+ request.getParameter(keySet) + "-");
			parameters.put(keySet, request.getParameter(keySet));
		}
		
		String result = "123456";
		OutputStreamWriter dos = null;
		try {
			String outObj = result;
			System.out.println("result : " + result);
			dos = new java.io.OutputStreamWriter(response.getOutputStream());
			dos.write(outObj);
			dos.flush();
			dos.close();
			dos = null;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (dos != null) {
					dos.close();
					dos = null;
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
