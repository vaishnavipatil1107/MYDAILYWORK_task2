package com.task2;

import java.util.Scanner;

public class Studentgradecalculator {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of subjects: ");
	        int n = sc.nextInt();

	        int totalMarks = 0;

	        // Input marks
	        for (int i = 1; i <= n; i++) {
	            System.out.print("Enter marks for subject " + i + " (out of 100): ");
	            int marks = sc.nextInt();
	            totalMarks += marks;
	        }

	        // Calculate average percentage
	        double averagePercentage = (double) totalMarks / n;

	        // Grade calculation
	        char grade;
	        if (averagePercentage >= 90) {
	            grade = 'A';
	        } else if (averagePercentage >= 75) {
	            grade = 'B';
	        } else if (averagePercentage >= 60) {
	            grade = 'C';
	        } else if (averagePercentage >= 40) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }

	        // Display results
	        System.out.println("\n--- Result ---");
	        System.out.println("Total Marks: " + totalMarks);
	        System.out.println("Average Percentage: " + averagePercentage + "%");
	        System.out.println("Grade: " + grade);

	        sc.close();
	    }
	}


