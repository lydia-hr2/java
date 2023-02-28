package oop2;

public class App {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		System.out.println(e1.toString());
		
		Employee e2 = new Employee("리디아신", 50000000);
		
		System.out.println(e2.toString());
		System.out.println(e2.getAnnSalary());
		System.out.println(e2.getTax());
		
		e2.setName("엘레이다신");
		System.out.println(e2.toString());
	}

}
