package variable;

public class P64 {

	public static void main(String[] args) {
		int a = 10;
		double d = 111111111110.2355;
		String str1 = "abc";
		String str2 = "abc";
		str1 = "def"; 
		System.out.printf("%d %4.2f %s",a,d,str1);
		if(str1 == str2) {
			System.out.println("OK");
		}
		if(str1.equals(str2)) {
			System.out.println("OK2");
		}
		String str3 = new String("abc");
		String str4 = new String("abc");

	}

}
