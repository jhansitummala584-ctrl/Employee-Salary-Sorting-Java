package list;

import java.util.ArrayList;
import java.util.Collections;

//step1: implements Comparable interface
class Employee implements Comparable<Employee>{
	int empNo;
	String empName;
	double empSalary;
	public Employee(int empNo, String empName, double empSalary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	//develop the sorting logic
	public int compareTo(Employee e) {
		if(this.empSalary>e.empSalary)
			return 1;
		else if(this.empSalary<e.empSalary)
			return -1;
		else
			return 0;
	}
	
}
public class EmployeeSort{

	public static void main(String[] args) {
		Employee e1=new Employee(1,"Ram",56000);
		Employee e2=new Employee(2,"Janu",52000);
		Employee e3=new Employee(3,"Sindhu",44000);
		Employee e4=new Employee(4,"Manoj",46000);
		Employee e5=new Employee(5,"Yamini",48000);
		ArrayList<Employee>list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		System.out.println("Before Sorting");
		list.forEach(System.out::println);
		System.out.println("After Sorting");
		Collections.sort(list);
		list.forEach(System.out::println);
		

	}

}
