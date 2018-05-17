package top.chgl16.spring_load_bean.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @lin  2018-5-16
 * 学习bean中的自动装配
 * 一个Master类依赖一个Dog类
 * ！！自动装配是在property注入后对没有被注入的空null属性自动装配注入
 */

/**
 * 自动装配五种类型
 * byType, byName, autodetect, no, default, constructor  ## constructor是byName来找bean对象作为参数的，autodetect优先constructor,然后byType
 * 配置bean对象不写autowire默认是deault类型，
 * default的指定设置在beans标签中，方法：default-autowire="装配类型" 
 */
public class App {

	public static void main(String[] args) {
		// 创建IOC容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("top/chgl16/spring_load_bean/autowire/beans.xml");
		
		// 获取一个Master对象
		Master master = (Master) ac.getBean("master");
		
		// 打印属性
		System.out.println(master.getName() + "有一条" + master.getDog().getName() + "，" + master.getDog().getAge() + "岁了");
	}

}
