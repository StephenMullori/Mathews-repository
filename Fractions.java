/**
 *Author: Stephen Mullori
 *Date: Oct 15, 2020
 *Description: Unit 1 Final Project
*/

import java.util.Random;

public class Fractions {
	static int num;
	static int den;
	
	static Random rand = new Random();
	
	public Fractions() { 
		Fractions.num = 1; 
		Fractions.den = 2;	
	
	}
	
	public Fractions(int num, int den) {
		Fractions.num = num;
		Fractions.den = den;
	}
	
	public static void adding(int num,int den) {
		update();
		int num1 = Fractions.num;
		int den1 = Fractions.den; 
		update1();
		int num2 = Fractions.num;
		int den2 = Fractions.den;
		
		int endnum = (num1 * den2) + (num2 * den1);
		int endden = den1 * den2;
		System.out.println(num1  + "/" + den1 + " + " + num2 + "/" + den2 + " = " + endnum + "/" + endden);
	}
	
	public static void sub(int num, int den) {
		update();
		int num1 = Fractions.num;
		int den1 = Fractions.den; 
		update1();
		int num2 = Fractions.num;
		int den2 = Fractions.den;
		int endden = den1 * den2;
		int endnum = (num1 * den2) - (num2 * den1);
		System.out.println(num1  + "/" + den1 + " - " + num2 + "/" + den2 + " = " + endnum + "/" + endden);
	}

	public static void multi(int num, int den) {
		update();
		int num1 = Fractions.num;
		int den1 = Fractions.den; 
		update1();
		int num2 = Fractions.num;
		int den2 = Fractions.den;
		int endden = den1 * den2;
		int endnum = num1 * num2;
		System.out.println(num1  + "/" + den1 + " x " + num2 + "/" + den2 + " = " + endnum + "/" + endden);
	}

	public static void divde(int num, int den) {
		update();
		int num1 = Fractions.num;
		int den1 = Fractions.den; 
		update1();
		int num2 = Fractions.num;
		int den2 = Fractions.den;
		int endden = den1 * num2;
		int endnum = num1 * den2;
		System.out.println(num1  + "/" + den1 + " / " + num2 + "/" + den2 + " = " + endnum + "/" + endden);
	}

	public static void update() {
		Fractions fraction = new Fractions();
	}
	
	public static void update1() {
		Fractions fraction2 = new Fractions(5, 12);
	}
	
	public static void main(String[] args) {
		adding(Fractions.num, Fractions.den);
		
		sub(Fractions.num, Fractions.den);

		multi(Fractions.num, Fractions.den);
	
		divde(Fractions.num, Fractions.den);
	}
		
		
}
