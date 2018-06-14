package problem;

public class FullTimeEmployee extends Employee {
	private int annualSalary;


	public FullTimeEmployee() {
		super();
	}

	public FullTimeEmployee(int num, String name, int annualSalary) {
		super(num, name);
		setAnnualSalary(annualSalary);
	}



	@Override
	public int getSalary() {
		int salary=annualSalary/12;
		return salary;
	}

	public int getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}

	@Override
	public String toString() {
		return "empNo=" + getNum() + ", name=" + getName() + ", annualSalary=" + annualSalary
				;
	}
	
	
	

}
