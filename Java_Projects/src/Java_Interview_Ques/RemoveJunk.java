package Java_Interview_Ques;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s = "@#$%^&*()Learn Java Benchoo@#$%^&*()";
		String s1="!@#$%^&*()BC Learn JAVA 0987654321!@#$%^&*()";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		s1=s1.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(s1);
		

	}

}
