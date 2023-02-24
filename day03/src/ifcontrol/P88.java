package ifcontrol;

public class P88 {

	public static void main(String[] args) {
		String grade = "";
		String gender = "M";
		double sum = 80.0;
		System.out.println("Start.....");
		if(grade.equals("VIP")) {
			
			System.out.println("실행.....");	
		    //return;
		}
		
		
		if(gender.equals("M")) {
			System.out.println("Male.....");
		}else {
			System.out.println("Female.....");
		}

		//100 ~ 95 또는 90 ~ 85 VIP
		//80 ~ 75 또는 60 ~ 65 GOLD
		//나머지는 NORMAL
		
		if((sum <= 100 && sum >= 95) || (sum <= 90 && sum >= 85)) {
			grade = "VIP";
		}else if((sum <= 80 && sum >= 75) || (sum <= 60 && sum >= 65)) {
			grade = "GOLD";
		}else {
			grade = "NORMAL";
		}
		
		if(grade.equals("VIP")) {
			System.out.println("VIP혜택....");
			//return;
		}
		System.out.printf("%s, %s, %4.2f \n", grade, gender, sum);
		
		System.out.println("End.....");

	}

}
