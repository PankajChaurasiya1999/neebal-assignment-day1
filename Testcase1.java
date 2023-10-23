package neebal.day1;

import java.util.Scanner;

public class Testcase1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		long n = sc.nextInt();
		long hr = n / (60 * 60 * 1000);
		n = n % (60 * 60 * 1000);
		long min = n / (60 * 1000);
		n = n % (60 * 1000);
		long sec = n / 1000;
		System.out.println("Output:" + hr + ":" + min + ":" + sec);

	}

}
