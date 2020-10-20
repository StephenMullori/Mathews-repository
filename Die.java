import java.util.Random;

public class Die {
	
	public Die(int s, int x) {   //Constructor die with a side number and which number die it is
		int sides =  s;
		int dieNum = x;
}
	
	public void NumSides(int x, int s) {  // random generates the number of die sides
		int sides = s;
		int dieNum = x;
		System.out.println("die " + dieNum +" has " + sides + " sides");
	}
	
	public int roll(int s, int x) { // randomly pick the number rolled by a die
		Random random = new Random();		
		int dieNum = x;
		int roll = random.nextInt(s) + 1;
		return roll;
		
	}

	public void printroll(int r, int n) {// prints the values of the two rolled numbers
		System.out.println("die 1 rolled a " + r);
		System.out.println("die 2 rolled a " + n);
	}
	
	public void total(int r, int n) {//prints the total of the rolled numbers
		int total = r + n;
		System.out.println("The total is " + total);
	}
	
}
