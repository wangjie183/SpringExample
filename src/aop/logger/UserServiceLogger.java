package aop.logger;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class UserServiceLogger {
	private Logger log=Logger.getLogger(UserServiceLogger.class);
	//调用保存方法前得增强方法
	public void before(JoinPoint jp) {
		log.info("调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法。方法参数："+Arrays.toString(jp.getArgs()));
		
	}
	//调用保存方法后得增强方法
	public void after(JoinPoint jp,Object result) {
		log.info("调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法，方法返回值是："+result);
	}
}