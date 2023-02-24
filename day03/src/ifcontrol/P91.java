package ifcontrol;

public class P91 {

	public static void main(String[] args) {
    int a = 99;
    int b = 8;
    int c = 79;
    int d = 88;
    
    //네 수의 최대 값과 최소 값을 구하시오
    
    int max = a;
    if (b>max) max = b;
    if (c>max) max = c;
    if (d>max) max = d;
    
    int min = a;
    if (b<min) min = b;
    if (c<min) min = c;
    if (d<min) min = d;
    
    if(a > b) {
    	max = Math.max(a, c);
    	min = Math.min(b, c);
    }else {
    	max = Math.max(b, c);
    	min = Math.min(a, c);
    }
    
    System.out.printf("MAX: %d, MIN: %d",max,min);
    
	}

}
