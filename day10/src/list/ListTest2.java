package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); // ArrayList 생성

		Random r = new Random();
		int i = 1;
		while (list.size() < 20) {
		    int num = r.nextInt(10) + 1; // 1부터 10까지의 랜덤한 숫자 생성
		    list.add(num); // 리스트에 랜덤한 숫자 저장
		    i++;
		}
		    System.out.println(list.size());
		    System.out.println("------------------------------------");
		    for(int data:list) {
		    	System.out.println(data);
		    }
		
/*		// list 정보를 출력 하시오.		
		// 1~10까지의 숫자를 20개 입력 한다.
		// 단 while 문을 이용한다.
*/
	}

}
