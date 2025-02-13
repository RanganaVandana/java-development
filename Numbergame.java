package TASK1;

import java.util.*;
public class Numbergame {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		
		int lowerBound=1;
		int upperBound=100;
	
		int numberToGuess=random.nextInt(upperBound - lowerBound + 1);
		int attempts=0;
		int maxAttempts=10;
		 
		System.out.println(" Welcome to the Number GAme!! ");
		System.out.println("I have selected a number between "+lowerBound+" and "+upperBound+". Can you guess it??");
		
		while(attempts < maxAttempts)
		{
			System.out.println(" Enter your Guess Number: ");
			int userGuess=sc.nextInt();
			attempts++;
			
			if(userGuess == numberToGuess)
			{
				System.out.println(" Congratulations! You've guessed the correct number in " +attempts+ " attempts.");
				break;
				
			}
			else if(userGuess<numberToGuess)
			{
				System.out.println("Try a higher number.");
			}
			else 
			{
				System.out.println("Try a smaller number.");
			}
		}
		if(attempts == maxAttempts)
		{
			System.out.println(" Sorry, You've reached the maximum numbr of attempts. The correct number was: "+numberToGuess);
			
		}
		
		
		System.out.println("Thanks for playing!");
		sc.close();
	}

}
