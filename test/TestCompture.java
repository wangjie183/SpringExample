import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import compture.computer;
import print.Printer;

class TestCompture {

	@Test
	void test() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过getbean方法获得配置的bean信息，并保存这个对象
		computer p= (computer) ctx.getBean("compture");
		//调用方法来实现操作
		p.print();
	}

}
