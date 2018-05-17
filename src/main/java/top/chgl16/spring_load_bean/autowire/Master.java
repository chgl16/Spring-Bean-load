package top.chgl16.spring_load_bean.autowire;

public class Master {
	private String name;
	private Dog dog;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	
	/*  无参数构造函数 */
	public Master() {
		System.out.println("调用了无参数构造函数");
	}
	/* dog参数的构造函数  */
	public Master(Dog dog1) {
		this.dog = dog1;
		System.out.println("调用dog参数构造函数");
	}
	/* 全参数构造函数 */
	public Master(String name, Dog dog) {
		System.out.println("调用了全参数构造函数");
		this.name = name;
		this.dog = dog;
	}
	
}
