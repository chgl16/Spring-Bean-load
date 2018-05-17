package top.chgl16.spring_load_bean.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author lin
 * 基本类型和数组
 */
public class Department {
	private String name;
	private String[] empStr;
	private List<Employee> empList;
	private Set<Employee> empSet;
	private Map<String ,Employee> empMap;
	
	public Map<String, Employee> getEmpMap() {
		return empMap;
	}
	public void setEmpMap(Map<String, Employee> empMap) {
		this.empMap = empMap;
	}
	public String getName() {
		return name;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	public Set<Employee> getEmpSet() {
		return empSet;
	}
	public void setEmpSet(Set<Employee> empSet) {
		this.empSet = empSet;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getEmpStr() {
		return empStr;
	}
	public void setEmpStr(String[] empStr) {
		this.empStr = empStr;
	}
}
