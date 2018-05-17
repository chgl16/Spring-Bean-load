package top.chgl16.spring_load_bean.collection;

import java.util.Iterator;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @Lin 2018-5-15
 * 1.数组和集合(set,list,map)的属性装载
 * 2.继承转载
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("top/chgl16/spring_load_bean/collection/beans.xml");
    	
    	Department department = (Department) ac.getBean("department");
        
    	/*  打印department name  */
    	System.out.println("department: " + department.getName());
    	
    	/*  打印字符数组  */
    	System.out.println("\n打印数组");
    	for(String name : department.getEmpStr()) {
    		System.out.println(name);
    	}
    	
    	/*  打印List集合  */
    	System.out.println("\n打印List集合");
    	for(Employee e : department.getEmpList()) {
    		System.out.println(e.getName());
    	}
    	
    	/*  打印Set集合  */
    	System.out.println("\n打印Set集合");
    	for(Employee e : department.getEmpSet()) {
    		System.out.println(e.getName());
    	}
    	
    	/*  打印Map集合 for-each  */
    	System.out.println("\n打印Map集合  for-each");
    	for(Entry<String, Employee> entry : department.getEmpMap().entrySet()) {
    		System.out.println(entry.getKey() + " " + entry.getValue().getName());
    	}
    	
    	/*  打印Map集合  iterator */
    	System.out.println("\n打印Map集合  iterator");
    	Iterator it = department.getEmpMap().keySet().iterator();
    	while(it.hasNext()) {
    		// 运行一次it.next()，除了返回对象，还迭代了下一个
    		String key = (String) it.next();    
    		System.out.println(key + " " + department.getEmpMap().get(key).getName() );
    	}
    }
}
