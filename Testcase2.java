package neebal.day1;
import java.util.Scanner;
public class Testcase2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a 4 digit number:");
		int n=sc.nextInt();
		int fh=n/100;
		int sh=n%100;
		System.out.println("output:"+sh+fh);
	}
}
