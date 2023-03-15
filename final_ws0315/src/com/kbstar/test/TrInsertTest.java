package com.kbstar.test;

import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.TransactionService;

public class TrInsertTest {

	public static void main(String[] args) {
		CRUDService<String, TransactionDTO> crudService =
				new TransactionService();
		
		TransactionDTO tr = new TransactionDTO("0156", "4774", "in", 0.0);
		try {
			crudService.register(tr);
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
