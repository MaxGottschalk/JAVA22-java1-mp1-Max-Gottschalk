package guessingGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int sum = 0;	
		int rand = 0;
		while(running)
		{	
			rand = (int) Math.round(Math.random()*100);
			String nrCorrect = higherLower(input, rand);
			sum = 0;
			System.out.println("Guess what number the computer is thinking of");
			System.out.println("Write a number between 0-100: ");
			//För att se svaret direkt
			//System.out.println(rand);
			do {
				input = sc.nextInt();
				sum++;
				nrCorrect = higherLower(input, rand);
				System.out.println(nrCorrect);
				if(nrCorrect == "Winner")
				{	
					System.out.println("It took you: " + sum + " tries");
					System.out.println("_________________________________");
				}
			}while(nrCorrect != "Winner");
			
		}
		sc.close();
	}
	
	static String higherLower(int input, int rand) {
		
			if(input > rand)
			{
				return "Lower";
			}
			else if( input < rand)
			{
				return "Higher";
			}	
			else {
				return "Winner";
			}
	}

}
