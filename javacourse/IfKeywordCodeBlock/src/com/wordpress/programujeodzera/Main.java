package com.wordpress.programujeodzera;

public class Main {

    public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		if (gameOver == true){
			int finalScore = score+ (levelCompleted*bonus);
			System.out.println("Your final score was "+finalScore);
		}
//		boolean secondGameOver = true;
//		int secondScore = 10000;
//		int secondLevelCompleted = 8;
//		int secondBonus = 200;
//
//		if (secondGameOver == true){
//			int finalScore = secondScore +(secondLevelCompleted*secondBonus);
//			System.out.println("Your final score was " + finalScore);
//		}
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		if (gameOver == true){
			int finalScore = score+ (levelCompleted*bonus);
			System.out.println("Your final score was "+finalScore);}

		}
	}
