package top.chgl16.spring_load_bean.inherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @lin  2018-5-16
 * 学习bean中的继承装配
 * 一个Student父类和Graduate子类
 */
public class App {

	public static void main(String[] args) {
		// 创建IOC容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("top/chgl16/spring_load_bean/inherit/beans.xml");
		
		// 获取一个Graduate对象
		Graduate graduate = (Graduate) ac.getBean("graduate");
		
		// 打印属性
		System.out.println(graduate.getName() + " " + graduate.getAge() + " " + graduate.getDegree());
	}

}
