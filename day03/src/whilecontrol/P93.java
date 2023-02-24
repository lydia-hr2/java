package whilecontrol;

public class P93 {

	public static void main(String[] args) {
		// 합과 평균을 구하시오
		int sum = 0;
		double avg = 0.0;

		System.out.println("Start...");
		int cnt = 0;
		for (int i = 1; i <= 112; i++) {
			sum += i;
			cnt++;
		}
		avg = sum / (cnt*1.0);
		System.out.printf("%d,%f \n", sum, avg);
		System.out.println("End..." + cnt);
		
	}
}
