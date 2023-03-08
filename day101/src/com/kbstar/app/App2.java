package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class App2 {

	public static void main(String[] args) throws Exception {

		DAO<String, UserDTO> userDao = new UserDAO();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input command(q,i,d,u,s)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye");
				break;

			} else if (cmd.equals("i")) {
				System.out.println("Input ID...");
				String id = sc.next();
				System.out.println("Input PWD...");
				String pwd = sc.next();
				System.out.println("Input NAME...");
				String name = sc.next();
				UserDTO user = new UserDTO(id, pwd, name);
				userDao.insert(user);

			} else if (cmd.equals("d")) {
				System.out.println("Input ID...");
				String id = sc.next();
				userDao.delete(id);

			} else if (cmd.equals("u")) {
				System.out.println("Input ID...");
				String id = sc.next();
				System.out.println("Input PWD...");
				String pwd = sc.next();
				System.out.println("Input NAME...");
				String name = sc.next();
				UserDTO user = new UserDTO(id, pwd, name);
				try {
					user = userDao.update(id);
					System.out.println(user);
				} catch (Exception e) {
					System.out.println("id가 존재하지 않습니다.");
				}

			} else if (cmd.equals("s")) {
				System.out.println("Input ID...");
				String id = sc.next();
				UserDTO user = null;
				try {
					user = userDao.select(id);
					System.out.println(user);
				} catch (Exception e) {
					System.out.println("id가 존재하지 않습니다.");
				}

			}
		}
		sc.close();
	}

}