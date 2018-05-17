package top.chgl16.spring_load_bean.inherit;

/**
 * 毕业生，子类，一个私有属性
 * @author lin
 *
 */
public class Graduate extends Student {
	private String degree;

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
	
}
