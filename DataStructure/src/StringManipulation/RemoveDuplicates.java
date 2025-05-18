package StringManipulation;
import java.util.*;

public class RemoveDuplicates {
	
	static Scanner sc = new Scanner(System.in);
	public RemoveDuplicates() {
		// TODO Auto-generated constructor stub
	}
	
	public static String dup(String t) {
		Set<Character> ch = new HashSet<>();
		String res = "";
		for(int i = 0 ; i<t.length(); i ++) {
			if(ch.contains(t.charAt(i)))
				continue;
			else {
				res += t.charAt(i);
				ch.add(t.charAt(i));
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the word :");
		String text = sc.nextLine();
		
		System.out.println("Result :"+ dup(text));
	}

}
