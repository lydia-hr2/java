package com.kbstar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class TransactionDAO implements DAO<String, TransactionDTO>{
	public TransactionDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버가 없습니다.");
			e.printStackTrace();
			return;
		}
		System.out.println("로딩 성공");

	}

	@Override
	public void insert(TransactionDTO v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.trInsertSql);) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getMyAcc());
			pstmt.setString(3, v.getOpositAcc());
			pstmt.setString(4, v.getType());
			pstmt.setDouble(5, v.getAmount());
			pstmt.setDouble(6, v.getBalance());
			pstmt.executeUpdate();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public void delete(String k) throws Exception {
		System.out.println("삭제 불가능합니다.");// tr은 delete 안함

	}

	@Override
	public void update(TransactionDTO v) throws Exception {
		System.out.println("삭제 불가능합니다.");// tr은 update 안함

	}

	@Override
	public TransactionDTO select(String k) throws Exception {
		TransactionDTO tr= null;
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.trSelectSql);) {
			pstmt.setString(1, k);
			try (ResultSet rset = pstmt.executeQuery()) {
				rset.next();
				String db_id = rset.getString("id");
				String acc = rset.getString("myAcc");
				String oposit = rset.getString("opositAcc");
				String type = rset.getString("type");
				Double amount = rset.getDouble("amount");
				Double balance= rset.getDouble("balance");
				Date regdate = rset.getDate("regdate");
				tr=new TransactionDTO(db_id, acc,oposit, type,amount,balance,regdate);
			} catch (Exception e) {
				throw e;
			}
		} catch (Exception e4) {
			throw e4;
		}
		return tr;
	}

	@Override
	public List<TransactionDTO> select() throws Exception {
		List<TransactionDTO> list = new ArrayList<>();
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.trSelectAllSql);) {
			try (ResultSet rset = pstmt.executeQuery();) {
				while (rset.next()) {
					TransactionDTO tr=null;
					String db_id = rset.getString("id");
					String acc = rset.getString("myAcc");
					String oposit = rset.getString("opositAcc");
					String type = rset.getString("type");
					Double amount = rset.getDouble("amount");
					Double balance= rset.getDouble("balance");
					Date regdate = rset.getDate("regdate");
					tr=new TransactionDTO(db_id, acc,oposit, type,amount,balance,regdate);
					list.add(tr);
				}
			} catch (Exception e) {
			}
		} catch (Exception e) {
			throw e;
		}
		return list;
	}

	@Override
	public List<TransactionDTO> search(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}