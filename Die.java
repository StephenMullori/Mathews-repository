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
		
	public static void main(String[] args) {
		Random random = new Random();	// RNG
		
		
		int sides = random.nextInt(95) + 5; //calculates the number of sides for each die
		int sides2 = random.nextInt(95) + 5;
		
		Die Die1 = new Die(sides, 1);// creates the first die object
		Die Die2 = new Die(sides2, 2);// creates the second die object
		
		Die1.NumSides(1, sides);// prints the first dies number of sides
		int Die1roll = Die1.roll(sides, 1);//sets the first dies rolled value
		Die2.NumSides(2, sides2);//  prints the second dies number of sides
		int Die2roll = Die2.roll(sides2,2);//sets the seconds dies rolled value
			
		Die1.printroll(Die1roll, Die2roll);//prints the rolls of the dice
		Die2.total(Die1roll, Die2roll);// prints the total number
		}
}