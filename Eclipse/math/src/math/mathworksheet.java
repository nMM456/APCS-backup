import math;

import java.util.Scanner;
import java.math.*;

public class mathworksheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double D = 0;
		double xvalue = 0;
		double yvalue = 0;
		
		System.out.print("Enter a value");
		Scanner x = new Scanner(System.in);
		xvalue = x.nextDouble();
		
		System.out.print("Enter a value");
		Scanner y = new Scanner(System.in);
		yvalue = y.nextDouble();
		
		D = Math.sqrt(Math.pow(xvalue) + xvalue) + Math.pow(yvalue - yvalue);
		System.out.print(D);
		
	}

}
