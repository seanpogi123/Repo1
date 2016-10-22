import java.util.*;

/**
 * @(#)Vitya.java
 *
 *
 * @author Sean Pogi
 * problemset number 719A
 * @version 1.00 2016/10/19
 */

/**PROBLEM
 *
 *
 *
 *
 *
 *
 *
 */

public class Vitya
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a[] = new int[93];

		for (int i=0; i<n; i++){
			a[i] = input.nextInt();
		}

		if (a[n-1] == 15)
			System.out.println("DOWN");

		else if (a[n-1] == 0)
			System.out.println("UP");

		else if (n == 1)
			System.out.println(-1);

		else if (a[n-1] < a[n-2])
			System.out.println("DOWN");

		else
			System.out.println("UP");
	}
}

