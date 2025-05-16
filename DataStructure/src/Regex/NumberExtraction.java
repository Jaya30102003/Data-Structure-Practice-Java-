package Regex;
import java.util.*;

public class NumberExtraction {
	static Scanner sc = new Scanner(System.in);
	public NumberExtraction() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<Integer> convert(String t) {
		ArrayList<Integer> ans = new ArrayList<>();
		int i = 0; 
		while(i < t.length()) {
			if(i<t.length() && t.charAt(i)>='0' && t.charAt(i)<='9' ) {
				int sum = 0;
				while(i<t.length() && t.charAt(i)>='0' && t.charAt(i)<='9' ) {
					sum = sum * 10 +(t.charAt(i)-'0');
					i++;
				}
				ans.add(sum);
			}
			else {
				i++;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the text :");
		String text = sc.nextLine();
		
		System.out.println("The numbers are "+convert(text));

	}

}
