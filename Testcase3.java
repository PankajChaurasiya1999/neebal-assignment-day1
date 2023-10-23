package neebal.day1;
import java.util.Scanner;
public class Testcase3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of days:");
		int n=sc.nextInt();
		int y=n/365;
		n=n%365;
		int m=n/30;
		n=n%30;
		int w=n/7;
		n=n%7;
		int d=n;
		System.out.println("output:"+y+"years"+":"+m+"months"+":"+w+"weeks"+":"+d+"days");
	}

}
