import java.util.*;
class DiceGame{
    public static void main(string[]args){
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	int a = rand.nextInt(6);
	int b = rand.nextInt(6);
	a++;
	b++;
	c = a+b;
	System.out.println("What is your name?");
	String name = scan.nextLine();
	System.out.println("Hello, "+ name +"!");
	
	System.out.println("Rolling the dice...");

	System.out.println("Die 1: " + a);

	System.out.println("Die 2: " + b);

	System.out.println("Total value: " + c);
	if(c>7){
	    System.out.println(name + "won!");

	}
	else{

	    	System.out.println(name +"lost!");
	}

    }
}
# s1260136
# s1260136
