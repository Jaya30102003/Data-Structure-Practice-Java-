package Regex;
import java.util.*;

public class CamelCaseSplit {
	static Scanner sc = new Scanner(System.in);
	public CamelCaseSplit() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<String> camelcase(String t){
		List<String> res = new ArrayList<>();
		int i = 0,startIndex = 0;
		while(i < t.length()) {
			if(t.charAt(i)>='A' && t.charAt(i)<='Z' && i > 0 || i == t.length()-1) {
				String sub;
				if(i < t.length()-1)
					sub = t.substring(startIndex, i);
				else
					sub = t.substring(startIndex);
				startIndex = i;
				res.add(sub);
			}
			i++;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the text :");
		String text = sc.nextLine();
		
		System.out.println("The Short form :"+ camelcase(text));
		
	}

}
