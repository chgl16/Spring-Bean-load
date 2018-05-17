package top.chgl16.spring_load_bean.constructor;

/**
 * 重载多个构造函数
 * @author lin
 */
public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		System.out.println("Person(String name, int age)方法被调用 name:" + name + " age:" + age);
		this.name = name;
		this.age = age;
	}
	public Person() {
		System.out.println("Person()方法被调用");
	}
	public Person(int age) {
		System.out.println("Person(int age)方法被调用 age:" + age);
		this.age = age;
	}
	public Person(String name) {
		System.out.println("Person(String name)方法被调用 name:" + name);
		this.name = name;
	}
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
