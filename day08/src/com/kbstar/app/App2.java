package com.kbstar.app;

import java.util.List;
import java.util.Scanner;

import com.kbstar.dao.ItemDAO;
import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class App2 {

	public static void main(String[] args) {
		DAO<Integer, ItemDTO> itemDao = new ItemDAO();
		
		//ItemService service = new ItemService();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input command(q,i,d,u,s,sa)");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}else if(cmd.equals("s")) {
				System.out.println("Input ID...");
				ItemDTO item = null;
				try {
					int id = Integer.parseInt(sc.next());
					item = DAO.select(id);
					System.out.println(item);
				}catch(Exception e) {
					System.out.println("id가 존재하지 않습니다.");
				}
			}else if(cmd.equals("sa")) {
				List<ItemDTO> list = null;
				try {
					list = ItemDAO.select(0);
					for(ItemDTO item:list) {
						System.out.println(item);
					}
				} catch (Exception e) {

				}
			}else if(cmd.equals("i")) {
				System.out.println("Input ID...");
				int id = Integer.parseInt(sc.next());
				System.out.println("Input NAME...");
				String name = sc.next();
				System.out.println("Input Price...");
				double price = Double.parseDouble(sc.next());
				System.out.println("Input Quantity...");
				int qt = Integer.parseInt(sc.next());
				
				ItemDTO item = new ItemDTO(id, name, price, qt);
				try {
					itemDao.insert(item);
				} catch (Exception e) {
					System.out.println("id가 존재 합니다.");
				}
				
			}else if(cmd.equals("d")) {
				System.out.println("Input ID...");
				try {
					int id = Integer.parseInt(sc.next());
					itemDao.delete(id);
				}catch(Exception e) {
					System.out.println("id가 존재하지 않습니다.");
				}
				
				
			}else if(cmd.equals("u")) {
				System.out.println("Input ID...");
				int id = Integer.parseInt(sc.next());
				System.out.println("Input NAME...");
				String name = sc.next();
				System.out.println("Input Price...");
				double price = Double.parseDouble(sc.next());
				System.out.println("Input Quantity...");
				int qt = Integer.parseInt(sc.next());
				
				ItemDTO item = new ItemDTO(id, name, price, qt);
				try {
					itemDao.update(item);
				} catch (Exception e) {
					System.out.println("id가 존재하지 않습니다.");
				}
			}
		}
		sc.close();
	}

}

