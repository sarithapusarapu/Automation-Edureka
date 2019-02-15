package day2;

public class DemoEmployee {

	public static void main(String[] args) {
	
		//Declaration of variable
		
		Employee Saritha;
		
		//instantiation (means allocate memory) and initialization (sets default value)
		
		Saritha = new Employee();
		
		Saritha.salary = 80000;
		
		Saritha.bonus = 5000;
		
		Saritha.calculateSalary();

		System.out.println("-----------------------------------");
		
		Employee Rao = new Employee();
		
		Rao.salary = 100000;
		Rao.bonus = 20000;
		Rao.calculateSalary();
		 System.out.println("---------------------------------------");
		
		 Employee rao = new Employee();
		 
		 rao.salary = 33377777;
		 
		 rao.bonus = 223425;
		 
		 int raosalary = rao.calculatesalary1();
				 
				 System.out.println(" Salary of Rao is :  "+ raosalary);
		 
				 System.out.println("---------------------------------------");
		 Employee Anvita = new Employee();
		 
		 int anvitasalary = Anvita.calculatesalary2(500000,4222);
		System.out.println("AnvitaSalary  : "+ anvitasalary);
	}

}
