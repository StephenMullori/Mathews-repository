import java.util.Random;
import java.util.Scanner;

public class PromTicket {
	
	static String studentName;
	static String code = "";
	static int grade;
	static int guests;
	static Scanner input = new Scanner(System.in);
	static Random rand = new Random();
	
	public PromTicket(String name) {
		signUp();
		ticiket();
		System.out.println(studentName + " purchasesed a " + message() + " ticiket for $" + cost() + ". The conformation code is " + code);
	}
	
	public static void signUp() {
		System.out.println("input name");
		studentName = input.nextLine();
		
		
		int timer = 1;
		while ( timer == 1) {
		
		System.out.println("Enter  your grade");
		System.out.println("Freshman - 9");
		System.out.println("Sophomore - 10");
		System.out.println("Junior - 11");
		System.out.println("Senior - 12");
		grade = input.nextInt();
		
		if  ((grade >= 9) && (grade <= 12)) {
			timer = 0;
		}
		else {
				System.out.println("invalid input try again");
			}
	}
		int timer2 = 1;
		while ( timer2 == 1) {
		System.out.println("Number of guest including yourself up to 4 people");
		guests = input.nextInt();
		
		if ((guests >= 1) && (guests <= 4)) {
			timer2 = 0;
		}
		else {
			System.out.println("invalid input try again");
		}
	
	}
	}
	
	public static void ticiket() {
		int count = 0;
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
		while (count != 6) {
			int temprand = rand.nextInt(characters.length()); 
			String temp = characters.substring(temprand, temprand + 1); 
			code += temp;
			count += 1;
			}
		

	}
	
	public static double cost() {
		double costTemp = 0;
		if (grade == 12) {
			if ((guests == 4) || (guests == 3))  {
				costTemp = 100.00;
			}
			if (guests == 2) {
				costTemp = 60.00;
			}
			if (guests == 1) {
				costTemp = 40.00;
			}
		}
		else if (grade == 11) {
			if ((guests == 4) || (guests == 3))  {
				costTemp = 113.00;
			}
			if (guests == 2) {
				costTemp = 68.00;
			}
			if (guests == 1) {
				costTemp = 45.00;
			}
		}
		else if (grade == 10) {
			if ((guests == 4) || (guests == 3))  {
				costTemp = 138.00;
			}
			if (guests == 2) {
				costTemp = 83.00;
			}
			if (guests == 1) {
				costTemp = 55.00;
			}
		}
		else  {
			if ((guests == 4) || (guests == 3))  {
				costTemp = 163.00;
			}
			if (guests == 2) {
				costTemp = 98.00;
			}
			if (guests == 1) {
				costTemp = 65.00;
			}
		}
		
		return costTemp;
	}

	public  String message() {
	
	String tempMessage = "";
	
	if (grade == 12) {
		if ((guests == 4) || (guests == 3))  {
			tempMessage = "senior group";
		}
		if (guests == 2) {
			tempMessage = "senior couple";
		}
		if (guests == 1) {
			tempMessage = "senior solo";
		}
	}
	else if (grade == 11) {
		if ((guests == 4) || (guests == 3))  {
			tempMessage = "junior group";
		}
		if (guests == 2) {
			tempMessage = "junior couple";
		}
		if (guests == 1) {
			tempMessage = "junior solo";
		}
	}
	else if (grade == 10) {
		if ((guests == 4) || (guests == 3))  {
			tempMessage = "sophomore group";
		}
		if (guests == 2) {
			tempMessage = "sophomore couple";
		}
		if (guests == 1) {
			tempMessage = "sophomore solo";
		}
	}
	else  {
		if ((guests == 4) || (guests == 3))  {
			tempMessage = "freshman group";
		}
		if (guests == 2) {
			tempMessage = "freshman couple";
		}
		if (guests == 1) {
			tempMessage = "freshman solo";
		}
		
	}
	return tempMessage;
}
public static void main(String[] args) {
		
		PromTicket prom = new PromTicket(PromTicket.studentName);

	}
}
