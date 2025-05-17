package StringManipulation;
import java.util.*;

public class ReverseWord {
	static Scanner sc = new Scanner(System.in);
	public ReverseWord() {
		// TODO Auto-generated constructor stub
	}
	
	public static String reverse(String t) {
		String res = "";
		int i = t.length();
		
		while(i --> 0) {
			res += t.charAt(i);
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the word :");
		String text = sc.nextLine();
		
		System.out.println("Result : "+ reverse(text));
	}

}
