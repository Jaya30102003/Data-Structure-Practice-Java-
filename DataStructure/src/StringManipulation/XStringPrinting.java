package StringManipulation;
import java.util.*;

public class XStringPrinting {
	
	static Scanner sc = new Scanner(System.in);
	public XStringPrinting() {
		// TODO Auto-generated constructor stub
	}
	
	public static void printing(String t) {
		for(int i=0;i<t.length();i++) {
			for(int j=0;j<t.length();j++) {
				if(i==j || j == (t.length()-i-1))
					System.out.print(t.charAt(i)+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the word :");
		String text = sc.nextLine();
		
		printing(text);
	}

}
