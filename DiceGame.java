import java.util.Random;
import java.util.Scanner;

public class DiceGame{
    public static void main(String[] args){
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);
	System.out.print("What is your name?\n>");
	String name = sc.nextLine();
	System.out.println("Hello, " + name + "!");
	
	System.out.println("Rolling dice...");
	int num;
	int sum = 0;
	for(int i=0; i < 2; i++){
	    num = rand.nextInt(6) + 1;
	    sum += num;
	    System.out.println("Die " + i + ": " + num);
	}
	System.out.println("Total value: " + sum);
	if(sum > 7){
	    System.out.println(name + " won!");
	}
	else{
	    System.out.println(name + " lost!");
	}
    }
}
