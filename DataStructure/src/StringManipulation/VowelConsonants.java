package StringManipulation;
import java.util.*;

public class VowelConsonants {
	static Scanner sc = new Scanner(System.in);
	public VowelConsonants() {
		// TODO Auto-generated constructor stub
	}
	
	public static Map<String,Integer> count(String t){
		Map<String,Integer> res = new HashMap<>();
		
		for(int i=0;i<t.length();i++) {
			if(t.charAt(i)=='A' || t.charAt(i)=='E' || t.charAt(i)=='I' || t.charAt(i)=='O' || t.charAt(i)=='U' || t.charAt(i)=='A' || t.charAt(i)=='E' || t.charAt(i)=='I' || t.charAt(i)=='O' || t.charAt(i)=='U')
				res.put("Vowels", res.getOrDefault("Vowels",0)+1);
			else
				res.put("Consonants", res.getOrDefault("Consonants",0)+1);
		}
		
		return res;
	}

	public static void main(String[] args) {
		System.out.println("Enter the word :");
		String text = sc.nextLine();
		
		System.out.println("Result :"+ count(text));
	}

}
