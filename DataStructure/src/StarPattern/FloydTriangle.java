package StarPattern;
import java.util.*;

public class FloydTriangle {
	
	static Scanner sc = new Scanner(System.in);
	
	public FloydTriangle() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the height of the triangle :");
		int a = sc.nextInt();
		
		int c = 1;
		for(int i = 1;i<= a;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
	}

}
