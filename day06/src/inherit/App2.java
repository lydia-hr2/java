package inherit;

public class App2 {

	public static void main(String[] args) {
		// Manager is a Employee
		Employee e = new Manager("100", "james", 500, 50);
		// Manager m = new Employee("100", "james", 550);

		Employee ea[] = new Employee[5];
		ea[0] = new Employee("100", "james", 500);
		ea[1] = new Employee("101", "james", 500);
		ea[2] = new Manager("102", "james", 500, 50);
		ea[3] = new Manager("103", "james", 500, 50);
		ea[4] = new Sales("104", "james", 500, "Seoul", 0.35);
		
		for(Employee em:ea) {
			System.out.println(em);
			System.out.println(em.getAnnSalary());
			System.out.println(em.getIncentive());
		}
	}

}
