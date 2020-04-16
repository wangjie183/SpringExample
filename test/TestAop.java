import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.pojo.User;
import aop.service.UserService;

class TestAop {

	@Test
	void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
		UserService us = (UserService) ctx.getBean("userService");
		User user = new User(1, "张三", 18);
		us.saveUser(user);
	}

}
