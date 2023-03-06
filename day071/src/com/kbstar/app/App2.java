package com.kbstar.app;

import com.kbstar.dao.AccountMariaDBDAO;
import com.kbstar.dao.AccountOracleDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;

public class App2 {

	public static void main(String[] args) {
		DAO dao = new AccountMariaDBDAO();
		AccountDTO account = new AccountDTO("100", "자유저축", 1000);
		dao.insert(account);
		System.out.println("자유저축계좌가 성공적으로 만들어졌습니다");

		DAO dao1 = new AccountOracleDAO();
		AccountDTO account1 = new AccountDTO("100", "자유저축", 1000);
		dao.insert(account);

	}
}
