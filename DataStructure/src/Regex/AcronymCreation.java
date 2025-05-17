package Regex;
import java.util.*;

public class AcronymCreation {
	static Scanner sc = new Scanner(System.in);
	public AcronymCreation() {
		// TODO Auto-generated constructor stub
	}
	
	public static String acronym(String t) {
		StringBuilder res = new StringBuilder();
		
		int i = 0;
		while(i < t.length()) {
			if(i == 0 ||( i > 0 && t.charAt(i-1)== ' ')) {
				res.append(t.charAt(i));
			}
			i++;
		}
		
		return res.toString().toUpperCase();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the text :");
		String text = sc.nextLine();
		
		System.out.println("The Short form :"+ acronym(text));
	}

}
