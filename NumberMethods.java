package NumMethods;

import java.util.Scanner;

public class NumberMethods {
	
	public static boolean isPrime(int num) {
		boolean prime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				prime = false;
			}
			
		}
		
		return prime;
	}
	
	public static int divisorSum(int num) {
		int sum = 0;
		String divisors = "";
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
				divisors = divisors + String.valueOf(i) + "";
			}
			
		}
		/*
		This method should return the sum of all of the divisors of n
		if divisorSum(8) is called, a value of 7 should be returned because
		the proper divisors of 8 are 1, 2, and 4.
		*/
		return sum;
	}
	
	public static boolean isStrong(int num) {
		boolean strong = false;
		
		if ((isPrime(num) == false) && (divisorSum(num) < num)) {
			strong = true;
		}
		if ((isPrime(num) == false) && (divisorSum(num) > num)) {
			strong = false;
		}
		/*
		 A number is considered strong if it is:
		 1) Greater than the sum of its divisors
		 2) A composite number
		 */
		
		/*
		 A number is considered weak if it is:
		 1) Less than the sum of its divisors
		 2) A composite number
		 */
		
		/*
		 * This method should check if n is strong.
		 * The call isStrong(8) should return true because 8 > (1 + 2 + 4) = 7
		 * The call isStrong(12) should return false because 12 < (1 + 2 + 3 + 4 + 6) = 16
		 */
		
		//This method MUST use the divisorSum and isPrime method
		
		return strong;
	}
	
	public static String printDivisors(int num) {
		String divisors = "";
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				divisors = divisors + " " + String.valueOf(i);
			}
		}
		
		return divisors;
		
		/*
		 This method should print the divisors of n (not including n)
		 on a single line.
		 If printDivisors(12) is called, 1 2 3 4 6		should be printed.
		 */
	}
	
	public static String printPrimes(int num) {
		
		String primes = " ";
		
		for (int i = 2; i <= num; i++) {
			if (isPrime(i) == true) {
				primes = primes + String.valueOf(i) + " ";
			}
			}
		return primes;
		//This method prints all prime numbers less than n on a single line
		//The call printPrimes(30) should print 2 3 5 7 11 13 17 19 23 29
		//This method MUST use the isPrime method
	}
		
	
	public static String printComposites(int num) {
		
		String primes = " ";
		
		for (int i = 2; i < num; i++) {
			if (isPrime(i) == false) {
				primes = primes + String.valueOf(i) + " ";
			}
			}
		return primes;
		//This method prints all composite numbers less than n on a single line
		//The call printComposites(30) should print 4 6 8 9 10 12 14 15 16 18 20 21 22 24 25 26 27 28 
		//This method MUST use the isPrime method
	}
	
	public static String printStrong(int num) {
		
		String strong = "";
		
		for (int i = 2; i < num; i++) {
			while (isPrime(i) == true) {

				if (isPrime(i) == true) {
				i++;
			}
			}
			if ((isStrong(i) == true) && (i < num)) {
				strong = strong + String.valueOf(i) + " ";
			}
			}
		return strong;
		//This method prints all the strong numbers less than n on a single line
		//The call printStrong(30) should print 4 8 9 10 14 15 16 21 22
		//This method MUST use the isStrong method
	}
	
	public static String printWeak(int num) {
		String weak = "";
		
		for (int i = 2; i < num; i++) {
			while (isPrime(i) == true) {

				if (isPrime(i) == true) {
				i++;
			}
			}

			if ((isStrong(i) == false) && (i < num)) {
				weak = weak + String.valueOf(i) + " ";
			}
		}
		return weak;
		//This method prints all the weak numbers less than n on a single line
		//The call printWeak(30) should print 6 12 18 20 24 28
		//This method MUST use the isStrong method
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("input number");
		int num = input.nextInt();
		
		System.out.println("is " + num + " prime: " + isPrime(num));
		System.out.println("divisors of " + num + ":" + printDivisors(num));
		System.out.println("sum of " +  num + "'s divisors: " + NumberMethods.divisorSum(num));
		System.out.println("is " + num + " strong : " + isStrong(num));
		System.out.println("prime numbers between 0 and " + num + ":" + printPrimes(num));
		System.out.println("composite numbers between 0 and " + num + ":" + printComposites(num));
		System.out.println("prints strong numbers between 0 and " + num + ": " + printStrong(num));
		System.out.println("prints weak numbers between 0 and " + num + ": " + printWeak(num));
	}

} 
