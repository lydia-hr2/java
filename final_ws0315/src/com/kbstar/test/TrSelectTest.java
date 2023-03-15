package com.kbstar.test;

import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.TransactionService;

public class TrSelectTest {

	public static void main(String[] args) {
		CRUDService<String, TransactionDTO> crudService = new TransactionService();
		TransactionDTO tr = null;
		try {
			tr = crudService.get("0156");
			System.out.println(tr);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
