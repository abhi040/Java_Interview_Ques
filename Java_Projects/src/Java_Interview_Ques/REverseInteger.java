package Java_Interview_Ques;

public class REverseInteger {

	public static void main(String[] args) {
		int num = 12345;
		int rev =0;
		
		while(num!=0) {
			rev = rev * 10 + num % 10;
			num = num/10;
		}
		System.out.println("reverse string is:"+rev);
		
		int num1 =12345;
		
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}
