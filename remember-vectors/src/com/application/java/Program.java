package com.application.java;

import java.util.Random;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number to lenght vector: ");
		int numb = input.nextInt();

		Random random = new Random();

		int[] arr = new int[numb];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(arr.length * 2);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "; ");
		}
	}
}
