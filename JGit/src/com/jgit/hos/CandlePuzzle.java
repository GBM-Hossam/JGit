package com.jgit.hos;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CandlePuzzle {

	// Complete the birthdayCakeCandles function below.
	static int birthdayCakeCandles(int[] ar) {
		int total = 0, maxTall = 0;
		Arrays.sort(ar);
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == maxTall)
				total++;

			else {
				maxTall = ar[i];
				// rest total
				total = 1;
			}
		}

		return total;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		/*
		 * BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(
		 * System.getenv("OUTPUT_PATH")));
		 * 
		 * int arCount = scanner.nextInt();
		 * scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		 * 
		 * int[] ar = new int[arCount];
		 * 
		 * String[] arItems = scanner.nextLine().split(" ");
		 * scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		 * 
		 * for (int i = 0; i < arCount; i++) { int arItem =
		 * Integer.parseInt(arItems[i]); ar[i] = arItem; }
		 */
		int[] ar = new int[5];
		ar = new int[] { 8, 5, 1, 7, 7 };

		int result = birthdayCakeCandles(ar);
		System.out.println(result);

		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();

		// bufferedWriter.close();

		scanner.close();
	}
}
