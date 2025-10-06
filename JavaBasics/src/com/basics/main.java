package com.testjava;

/*import java.lang.reflect.Array;
import java.util.Arrays;*/
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give a number");
		double num1 = scanner.nextDouble();
		System.out.println("Give another one:");
		double num2 = scanner.nextDouble();
		System.out.println("Choose operation (+,-,*,/)");
		char operator = scanner.next().charAt(0);
		double result=0;
		switch (operator){
			case '+':
				result = num1+num2;
				break;
			case '-':
				result = num1-num2;
				break;
			case '*':
				result = num1*num2;
				break;
			case '/':
				if (num2!=0) {
					result = num1/num2;
				}
				else {
					System.out.println("Cant divide with 0");
				}
				break;
			default:
				System.out.println("Invalid operator!");
		}
		System.out.println("Result is : "+result);
		scanner.close();
	}
}
	