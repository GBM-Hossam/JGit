package com.jgit.hos;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSumPuzzle {

	// Complete the miniMaxSum function below.
	static void miniMaxSum(int[] arr) {
		Arrays.sort(arr);
		long minSum = 0, maxSum = 0;
		for (int i = 0; i < 4; i++)
			minSum += arr[i];

		for (int i = 1; i < 5; i++)
			maxSum += arr[i];

		System.out.println(minSum + " " + maxSum);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];

		// String[] arrItems = scanner.nextLine().split(" ");
		// scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		// for (int i = 0; i < 5; i++) {
		// int arrItem = Integer.parseInt(arrItems[i]);
		// arr[i] = arrItem;
		// }

		arr = new int[] { 4, 6, 1, 10, 3 };
		miniMaxSum(arr);

		scanner.close();
	}
}