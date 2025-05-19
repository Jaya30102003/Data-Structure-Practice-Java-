package StringManipulation;
import java.util.*;

public class AnagramChecker {
	static Scanner sc = new Scanner(System.in);
	public AnagramChecker() {
		// TODO Auto-generated constructor stub
	}
	public static boolean anagram(String t1,String t2) {
		Map <Character,Integer> check = new HashMap<>();
		t1 = t1.toLowerCase();
		t2 = t2.toLowerCase();
		
		for(int i=0;i<t1.length();i++) {
			if(check.containsKey(t1.charAt(i))) 
				check.put(t1.charAt(i), check.get(t1.charAt(i))+1);
			else if(t1.charAt(i)== ' ') continue;
			else
				check.put(t1.charAt(i), 1);
		}
		
		for(int i=0;i<t2.length();i++) {
			if(check.containsKey(t2.charAt(i))) 
				check.put(t2.charAt(i), check.get(t2.charAt(i))-1);
			else if(t2.charAt(i)== ' ') continue;
			else
				check.put(t2.charAt(i), 1);
		}
		
		if(!check.containsValue(0)) return false;
		else return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the text-1 :");
		String text1 = sc.nextLine();
		
		System.out.println("Enter the text-2 :");
		String text2 = sc.nextLine();
		
		System.out.println(anagram(text1,text2)?"yes":"no");
	
	}

}
