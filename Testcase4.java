package neebal.day1;
import java.util.Scanner;
public class Testcase4 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int x=50*(n/50);
		System.out.println("number of people travelling:"+x);
	}
}
