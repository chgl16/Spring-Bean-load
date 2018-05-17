package top.chgl16.spring_load_bean.inherit;

/**
 * 学生类，父类
 * @author lin
 */
public class Student {
	protected String name;
	protected int age; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
