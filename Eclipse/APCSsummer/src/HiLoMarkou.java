import java.util.Scanner;
import java.lang.Math;

public class HiLoMarkou {
//Nicholas Markou
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Rules
		System.out.println("Guess a number between 1 - 100. Then, pick another number until you guess the number.");
		System.out.println("The score is recorded based on how many numbers entered until you guess the number.");
		System.out.println("Enter '0' to quit the game.");
		System.out.println("Enter a number now.");
		//array to store scores from each round. later used in the table
		int[] score = new int[5];
		//game starts here
		for (int i=0;i<5;i++) {
			//random number, 1 - 100
			int num = (int)(Math.random() * 100) + 1;
			int currentscore = 0;
			while (true) {
				Scanner userguess = new Scanner(System.in);
				int guess = userguess.nextInt();
				currentscore++;
				//if the guess is correct the code below executes
				if (guess == num) {
					score[i] = currentscore;
					System.out.println("Correct! Guess for a new number.");
					break;
				}
				//if the guess is to low the below code executes.
				if (guess < num) {
					System.out.println("Your guess was to low.");
				}
				// if the guess is to high the below code executes.
				if (guess > num) {
					System.out.println("Your guess was to large.");
				}
				//user enters 0 to quit game
				if (guess == 0) {
					break;
				}
			}
		}
		results(score);
	}
	public static void results(int roundScore[]) {
		System.out.println("Results:");
		int totalScore = 0;
		int bestScore = roundScore[0];
		System.out.println("Round   | Score");
		//loop to print out each rounds score from the array
		for (int i=0;i<roundScore.length;i++) {
			System.out.print(i+1 + "\t| ");
			System.out.println(roundScore[i]);
			totalScore = totalScore + roundScore[i];
			if (bestScore > roundScore[i]) {
				bestScore = roundScore[i];
			}
		}
		//prints out the rest of the info
		System.out.println("Total: " + totalScore);
		System.out.println("Best score: "+bestScore);
	}
}
