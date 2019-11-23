package com.application.java;

import java.util.Random;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number to lenght vector: ");
		int numb = input.nextInt();

		Random random = new Random();

		int[] arr = new int[numb];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(arr.length * 2);
		}
		System.out.print("Enter number to search: ");
		int number = input.nextInt();
		searchNumber(number, arr);
	}

	public static void searchNumber(int num, int[] arr) {
		boolean localized = false;
		int position = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				localized = true;
				position = i;
			}
		}
		if (localized == true)
			System.out.print("Number " + num + " localized in position: " + position);
		else
			System.out.println("Number not exists.");
	}
}
