package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); // ArrayList 생성

		Random r = new Random();
		for (int i = 1; i <= 10; i++) {
			int num = r.nextInt(10) + 1; // 1부터 10까지의 랜덤한 숫자 생성
			list.add(num); // 리스트에 랜덤한 숫자 저장
		}
		list.add(5, 100);
		list.remove(5);
		for (int data : list) {
			System.out.println(data);
		}
	}
}