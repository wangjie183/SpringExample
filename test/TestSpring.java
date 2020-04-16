import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestSpring {

	@Test
	void test() {
		//通过Spring的配置文件来创建一个对象
		ApplicationContext application=new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过applicationContext对象的方法去获得配置文件中的bean
		SpringTest test= (SpringTest) application.getBean("test");
		//调用这个对象的方法来实现输出
		test.print();
	}
	@Test
	void res() {
		//通过Spring的配置文件来创建一个对象
				ApplicationContext application=new ClassPathXmlApplicationContext("applicationContext.xml");
				//通过applicationContext对象的方法去获得配置文件中的bean
				Spring test= (Spring) application.getBean("ps");
				//调用这个对象的方法来实现输出
				test.print();
	}
}
