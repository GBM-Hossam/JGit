package com.jgit.hos;

import java.io.IOException;

public class TimeConPuzzle {

	/*
	 * Complete the timeConversion function below.
	 */
	static String timeConversion(String s) {

		String time = s.substring(0, s.length() - 2);
		String zone = s.substring(s.length() - 2, s.length());
		int hour = Integer.parseInt(s.substring(0, 2));
		String restTime = s.substring(2, time.length());

		if (zone.equalsIgnoreCase("AM")) {
			if (hour == 12)
				return "00" + restTime;

			else
				return time;
		}

		else {
			if (hour == 12)
				return time;

			else {
				hour += 12;
				return hour + restTime;
			}
		}

	}

	// private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bw = new BufferedWriter(new FileWriter(
		// System.getenv("OUTPUT_PATH")));

		// String s = scan.nextLine();

		String s = "12:45:54PM";
		// 12:00:00AM

		String result = timeConversion(s);
		System.out.println(result);
		// bw.write(result);
		// bw.newLine();

		// bw.close();
	}
}