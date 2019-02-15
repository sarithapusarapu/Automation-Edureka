package day2;

public class Employee {

	int salary;
	
	int bonus;
	
	void calculateSalary() {
		
		int totalSalary = salary+bonus;
		
		System.out.println("Total Salary for the employees  "+ totalSalary);
	}
	
	int calculatesalary() {
		
		int totalsalary = salary + bonus;
		
		return totalsalary;
		
		
	}
	
int calculatesalary1() {
		
		int totalsalary = salary + bonus;
		
		return totalsalary;
	
}

int calculatesalary2(int sal, int bon){
	
	int totalsalary = sal + bon;
	
	return totalsalary;
}
}