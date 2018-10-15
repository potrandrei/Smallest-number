package Smallnr;
import java.util.Scanner;

public class Smalnr {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
				
		System.out.println("Enter the numbers to find the smallest number");
		System.out.println("End when you finish writte");
		System.out.println("done");
	
		double smallest=in.nextDouble();
		
		while(in.hasNextDouble()) {
			double input=in.nextDouble();
			if(input<smallest) {
				smallest=input;
			}
		}
		System.out.println(smallest);
	}
	
}
