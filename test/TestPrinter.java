import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import print.Printer;

class TestPrinter {

	@Test
	void test() {
		//创建applicationcontext对象
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过getbean方法获得配置的bean信息，并保存这个对象
		Printer p=(Printer) ctx.getBean("colorPrinter");
		//调用方法来实现操作
		p.print();
	}

}
