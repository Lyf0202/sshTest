package ssh2;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lyf.po.UserInfo;
import com.lyf.service.UserInfoService;

public class UserTest {

	UserInfoService userInfoService;

	@Before
	public void before() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		userInfoService = (UserInfoService) ac.getBean("userInfoServiceImpl");
	}

	@Test
	public void add() {

		UserInfo user = new UserInfo(90, "张三");

		try {
			userInfoService.add(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void update() {
		UserInfo user = new UserInfo(100, "张小三");
		user.setUserId(7);
		try {
			userInfoService.update(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void delete(){
		UserInfo user = new UserInfo();
		user.setUserId(7);
		try {
			userInfoService.delete(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
