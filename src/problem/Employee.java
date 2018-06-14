package problem;

public class Employee {
	private int num;
	private String name;
	
	public Employee() {
		super();
	}

	public Employee(int num, String name) {
		setNum(num);
		setName(name);
	}

	public int getSalary() {
		return 0;
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "empNo" + num + ", name=" + name;
	}
	
	

}
