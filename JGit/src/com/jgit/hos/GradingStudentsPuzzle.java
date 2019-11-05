package com.jgit.hos;

import java.util.ArrayList;
import java.util.List;

public class GradingStudentsPuzzle {

	static final int[] MODS = new int[] { 5, 10, 15, 20, 25, 30, 35, 40, 45,
			50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100 };

	public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> finalgrades = new ArrayList<Integer>();
		for (int grade : grades) {
			int i = -1;
			int res = -1;
			while (res != grade && i < MODS.length - 1) {
				i++;
				res = grade % MODS[i];
			}

			int diff = MODS[i] - grade;
			if (diff < 3 && (grade + diff) >= 40) {
				finalgrades.add(grade + diff);
			} else {
				finalgrades.add(grade);
			}
		}
		return finalgrades;
	}

	public static void main(String[] args) {
		List<Integer> grades = new ArrayList<Integer>();
		grades.add(73);
		grades.add(67);
		grades.add(38);
		grades.add(33);
		grades.add(100);
		grades.add(5);
		grades = gradingStudents(grades);
		System.out.println(grades);

	}
}
