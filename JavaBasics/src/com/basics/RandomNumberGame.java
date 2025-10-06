package com.testjava;
import java.util.Random;
import java.util.Scanner;
public class RandomNumberGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rand_num = new Random().nextInt(51);
		int tries = 1;
		System.out.println("Guess a number: ");
		int guess = scanner.nextInt();
		while (guess!=rand_num) {
			tries+=1;
			if (guess<rand_num) {
				System.out.println("Too low!");
			}
			else {
				System.out.println("Too high");
			}
			System.out.println("Give another number: ");
			guess = scanner.nextInt();
		}
		System.out.println("You found the number in "+tries+" tries");
		scanner.close();
	}
}
