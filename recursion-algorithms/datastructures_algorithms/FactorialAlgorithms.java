package datastructures_algorithms;

import java.util.Scanner;

public class FactorialAlgorithms {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter your number, which you want to factorial :");
			int number = scanner.nextInt();
			System.out.println(factorial(number));
		}
	}

	public static int factorial(int n) {
		// Base case if factorial number is 0 return 1
		if (n == 0) {
			return 1;
		}
		// Base Formula to solve this - n! = n * (n -1)
		return n * factorial(n - 1);
	}
}
