package neebal.day1;
import java.util.Scanner;
public class Testcase6 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int temp=n;
		int x=0;
		while(n>0) {
			
			int rem=n%10;
				x=x+(rem*rem*rem);
				n=n/10;
		}
		if(temp==x) {
			System.out.println(x +" is an armstrong number");
		}else{
			System.out.println(x +" is not an armstrong number");
		}
	}
}
