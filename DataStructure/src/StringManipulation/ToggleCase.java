package StringManipulation;
import java.util.*;

public class ToggleCase {
	static Scanner sc = new Scanner(System.in);
	public ToggleCase() {
		// TODO Auto-generated constructor stub
	}
	
	public static String toggle(String t) {
		String res = "";
		
		for(int i=0;i<t.length();i++) {
			if(t.charAt(i)>='A' && t.charAt(i)<='Z')
				res += (char) (t.charAt(i) - 'A' + 'a');
			else if(t.charAt(i)>='a' && t.charAt(i)<='z')
				res += (char) (t.charAt(i) - 'a' + 'A');
			else
				res += t.charAt(i);
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the word :");
		String text = sc.nextLine();
		
		System.out.println("Result :"+ toggle(text));
	}

}
