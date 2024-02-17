package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		
		//random number
		Random random = new Random();
		int randomNumber = random.nextInt(101);
		
		//input number
		System.out.println("Pick a number between 1 and 100: ");	
		Scanner scan = new Scanner(System.in);
		
		//start loop
		int error = 5;
		boolean gameOver = false;
		
		while(!gameOver) {
			int guessNumber = scan.nextInt();
		if (guessNumber < 1 || guessNumber > 100){
			System.out.println("Your guess is not between 1 and 100, please try again: ");
		} else {
			if (guessNumber == randomNumber){
				System.out.println("You win!");
				gameOver = true;
			} else {
				error--;
				if (error == 0) {
					System.out.println("You lose, the number to guess was: " + randomNumber);
					gameOver = true;
				}else {
					if (guessNumber < randomNumber) {
						System.out.println("Please pick a higher number.");
					}else 
					{
						System.out.println("Please pick a lower number.");
					}
					
				  }
			   }
			}
	
		}
	}
} 
	
		
 
