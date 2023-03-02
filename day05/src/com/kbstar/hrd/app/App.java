package com.kbstar.hrd.app;

import com.kbstar.hrd.Employee;
import com.kbstar.hrd.Manager;

public class App {

	public static void main(String[] args) {
		Employee e = new Employee("100", "이말숙", 500);
		System.out.println(e);
		System.out.println(e.getSalary());
		System.out.println(e.getTax());
		System.out.println(e.getAnnSalary());
		System.out.println(e.getAnnTax());

		System.out.println("===========================================");

		Employee emps[] = new Employee[3];
		emps[0] = new Employee("201", "리디아", 400);
		emps[1] = new Employee("202", "엘레이다", 450);
		emps[2] = new Employee("203", "엘리사벳", 480);

		for (Employee em : emps) {
			System.out.println(em);
			System.out.println(em.getTax());
			System.out.println(em.getAnnSalary());
			System.out.println(em.getAnnTax());
		}
	}

	public static void main1(String[] args) {
		Manager m = new Manager("1000", "바우로", 1000, 800);
		System.out.println(m);
		System.out.println(m.getSalary());
		System.out.println(m.getTax());
		System.out.println(m.getAnnSalary());
		System.out.println(m.getAnnTax());

		System.out.println("===========================================");

		Manager mngs[] = new Manager[3];
		mngs[0] = new Manager("301", "스페파노", 800, 700);
		mngs[1] = new Manager("302", "미카엘", 700, 700);
		mngs[2] = new Manager("303", "미카엘라", 900, 700);

		for (Manager mg : mngs) {
			System.out.println(mg);
			System.out.println(mg.getTax());
			System.out.println(mg.getAnnSalary());
			System.out.println(mg.getAnnTax());
		}
	}
}
