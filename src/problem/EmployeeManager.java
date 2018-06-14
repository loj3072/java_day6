package problem;


public class EmployeeManager {
	Employee[] em=new Employee[100];
	int index=0;
	
	public void add(Employee a) {
		em[index++]=a;
	}
	
	public void allList() {
		for(int i=0; i<index; i++) {
			System.out.println(em[i]);
		}
	}
	
	public void partTimeEmpList() {
		for(int i=0; i<index; i++) {
			if(em[i] instanceof PartTimeEmployee) {
				System.out.println(em[i]);
			}
		}
	}
	
	public void fullTimeEmpList() {
		for(int i=0; i<index; i++) {
			if(em[i] instanceof FullTimeEmployee) {
				System.out.println(em[i]);
			}
		}
	}
	
	public int size() {
		return index;
	}
	
	public int getTotalSalary() {
		int sum=0;
		for(int i=0; i<index; i++) {
			if(em[i] instanceof Employee) {
				sum+=em[i].getSalary();
			}
		}
		return sum;
	}
	
	public Employee search(int num) {
		for(int i=0; i<index; i++) {
			if(em[i].getNum()==num) {
				return em[i];
			}
		}
		return null;
	}
	
	public Employee[] search(String name) {
		Employee[] search = new Employee[index];
		for(int i=0; i<index; i++) {
			if(em[i].getName().contains(name)) {
				search[i]=em[i];
			}else {}
		}
		return search;
	}

}
