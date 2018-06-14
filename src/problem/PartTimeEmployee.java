package problem;

public class PartTimeEmployee extends Employee {
	private int hourlySalary;
	

	public PartTimeEmployee() {
		super();
	}

	public PartTimeEmployee(int num, String name, int hourlySalary) {
		super(num, name);
		setHourlySalary(hourlySalary);
	}



	@Override
	public int getSalary() {
		int salary=hourlySalary*160;
		return salary;
	}


	public int getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(int hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	@Override
	public String toString() {
		return "empNO=" + getNum() + ", name=" + getName() + ", hourlySalary=" + hourlySalary;
	}

	
	
}
