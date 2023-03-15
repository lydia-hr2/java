package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustInsertTest {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudService =
				new CustCRUDServiceImpl();
		
		Cust cust = new Cust("id10", "pwd10", "tom", 40);
		try {
			crudService.register(cust);
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}




