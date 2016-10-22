import java.util.Scanner;

/**
 * @(#)Hulk.java
 *
 *
 * @author Sean Pogi
 * problemset number 705A
 * @version 1.00 2016/10/15
 */

public class Hulk {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		for(int i=0; i<n; i++) {
			if(i % 2 == 1) {
				System.out.print("I love ");
			}
			else {
				System.out.print("I hate ");
			}
			if(i < n-1){
				System.out.print("that ");
			}
		}
		System.out.println("it");
	}
}