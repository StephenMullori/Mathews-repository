/**
 *Author: Stephen Mullori
 *Date: Oct 15, 2020
 *Description: Unit 1 Final Project
*/

import java.util.Scanner;

public class Fractions {
	static int num1;
	static int den1;
	static int num2;
	static int den2;
	Scanner scanner = new Scanner(System.in);
	
	public static void Fraction() { 
		num1 = 1;
		den1 = 2;	
		
		num2 = 1;
		den2 = 2;	
	}
	
	public static void adding(int num1, int den1, int num2, int den2) {
		int endden = den1 * den2;
		int endnum = num1 + num2;
		System.out.println(num1  + "/" + den1 + " + " + num2 + "/" + den2 + " = " + endnum + "/" + endden);
	}
	
	public static void sub(int num1, int den1, int num2, int den2) {
		int endden = den1 * den2;
		int endnum = num1 - num2;
		System.out.println(num1  + "/" + den1 + " - " + num2 + "/" + den2 + " = " + endnum + "/" + endden);
	}

	public static void multi(int num1, int den1, int num2, int den2) {
		int endden = den1 * den2;
		int endnum = num1 * num2;
		System.out.println(num1  + "/" + den1 + " x " + num2 + "/" + den2 + " = " + endnum + "/" + endden);
	}

	public static void divde(int num1, int den1, int num2, int den2) {
		int endden = den1 * num2;
		int endnum = num1 * den2;
		System.out.println(num1  + "/" + den1 + " / " + num2 + "/" + den2 + " = " + endnum + "/" + endden);
	}
	
	public static void main(String[] args) {
	
	Fraction();
	
	adding(num1, den1, num2, den2);
	
	sub(num1, den1, num2, den2);
	
	multi(num1, den1, num2, den2);
	
	divde(num1, den1, num2, den2);
	
	}

}