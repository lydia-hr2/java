package com.kbstar.service;

import com.kbstar.dao.ItemDAO;
import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.SearchService;
import com.kbstar.frame.Service;

public class ItemService implements Service<Integer, ItemDTO>, SearchService {

	DAO<Integer, ItemDTO> dao;

	public ItemService() {
		dao = new ItemDAO();
	}

	@Override
	public void register(ItemDTO v) throws Exception {
		System.out.println(v + "Data Check..");
		try {
			dao.insert(v);
		} catch (Exception e) {
			throw e;
		}
		System.out.println(v + "Send SMS..");
	}

	@Override
	public void remove(Integer k) {
		System.out.println(k + "Data Check..");
		try {
			dao.delete(k);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Send SMS..");
	}

	@Override
	public void modify(ItemDTO v) {
		// TODO Auto-generated method stub

	}

	@Override
	public void search() {

	}

}
