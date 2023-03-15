package com.kbstar.service;

import java.sql.SQLRecoverableException;
import java.util.List;

import com.kbstar.dao.TransactionDAO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeAccountNumber;

public class TransactionService implements CRUDService<String, TransactionDTO> {
	DAO<String, TransactionDTO> dao;

	public TransactionService() {
		dao = new TransactionDAO();
	}

	@Override
	public void register(TransactionDTO v) throws Exception {
		try {
			String id = MakeAccountNumber.makeTrNum();
			v.setId(id);
			v.setBalance(0.0); // 0원으로 시작. 나중에 변경해야돼
			dao.insert(v);
			System.out.println("거래 등록 성공");
		} catch (Exception e) {
			throw new Exception("시스템 장애 입니다.");

		}
	}

	@Override
	public void remove(String k) throws Exception {
		System.out.println("삭제 불가능합니다.");// tr은 remove 안함

	}

	@Override
	public void modify(TransactionDTO v) throws Exception {
		System.out.println("변경 불가능합니다.");// tr은 modify 안함

	}

	@Override
	public TransactionDTO get(String k) throws Exception {
		TransactionDTO tr = null;
		try {
			tr = dao.select(k);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애 입니다.");
			} else {
				throw new Exception("ID가 존재 하지 않습니다.");
			}
		}
		return tr;
	}

	@Override
	public List<TransactionDTO> get() throws Exception {
		List<TransactionDTO> list = null;
		try {
			list = dao.select();
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애 입니다.");
			}
			e.printStackTrace();
		}
		return list;
	}

}