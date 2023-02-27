package array;

import java.util.Arrays;
import java.util.Random;

public class P105 {

	public static void main(String[] args) {

		int arr[] = new int[5];
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(9) + 1;
		}
		System.out.println(Arrays.toString(arr));

		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum += arr[i];
				cnt++;
			}
		}
		avg = sum / (cnt*1.0);
		System.out.printf("%d, %4.2f", sum,avg);

		// 배열의 합과 평균을 구하시오
		// 홀수 번째의 합과 평균을 구하시오

	}
}