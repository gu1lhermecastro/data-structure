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
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Number " + arr[i] + " position: " + i);
		}
		System.out.print("Enter number to search: ");
		int number = input.nextInt();
		searchNumber(number, arr);
	}

	public static void searchNumber(int num, int[] arr) {
		int localized = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				System.out.println("Number " + arr[i] + " localized in position: " + i);
				localized++;
			}
		}

		if (localized == 0)
			System.out.println("Number not exists.");
	}
}
