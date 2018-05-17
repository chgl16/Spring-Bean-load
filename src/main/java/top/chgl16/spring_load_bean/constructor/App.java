package top.chgl16.spring_load_bean.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @lin  2018-5-16
 * 学习bean中的构造函数装配
 * 一个person类
 */
public class App {

	public static void main(String[] args) {
		// 创建IOC容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("top/chgl16/spring_load_bean/constructor/beans.xml");
		
		// 获取一个Graduate对象
		Person person1 = (Person) ac.getBean("person1");
		
		// 打印属性
		System.out.println(person1.getName() + " " + person1.getAge());
	}

}
