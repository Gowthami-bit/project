/**
 * 
 */
package mypackage;

import java.util.Scanner;

/**
 * @author pasumarthi haritha
 *
 */
public class swap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		int temp;
System.out.println("enter first number");
int a=sc.nextInt();
System.out.println("enter second number");
	int b=sc.nextInt();
	temp=a;
	a=b;
	b=temp;
	System.out.println(" After swap: "+a);
	System.out.println(" After swap: "+b);
	
	}
	

}
