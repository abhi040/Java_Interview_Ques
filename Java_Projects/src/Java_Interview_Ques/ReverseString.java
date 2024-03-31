package Java_Interview_Ques;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Selenium";
		//1. Using for loop
		// there is no reverse function in sting because string is immutable object
		
		int len = s.length();
		String rev = "";
		
		for(int i=len-1;i>=0;i--) {
			
			rev = rev+s.charAt(i);
		}
		
		System.out.println(rev);
		
		//2. Using String buffer class 
		//String Buffer is a mutable class so thats why we have reverse function in string buffer class
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
	}

}
