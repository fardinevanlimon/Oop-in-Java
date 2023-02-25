
package com.mycompany.mark;

import java.util.Scanner;

public class Mark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        String grade = getGrade(number);
        System.out.println("The grade is: " + grade);
    }

    public static String getGrade(int number) {
        if (number >= 90 && number <= 100) {
            return "A+";
        } else if (number >= 80 && number < 90) {
            return "A";
        } else if (number >= 70 && number < 80) {
            return "B";
        } else if (number >= 60 && number < 70) {
            return "C";
        } else if (number >= 50 && number < 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
