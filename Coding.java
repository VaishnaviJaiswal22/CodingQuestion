package oct23;

import java.util.Scanner;

public class Coding {
		public void sumofdigits(int n) {
			int sum = 0;
			while(n>0) {
				sum=sum+(n%10);
				n=n/10;
			}
			System.out.println("Sum of the digits of Number is  " + sum);
		}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = s.nextInt();
		Coding c = new Coding();
		c.sumofdigits(num);
		s.close();
	}

}
