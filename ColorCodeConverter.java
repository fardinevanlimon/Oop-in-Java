package com.mycompany.colorcodeconverter;



import java.util.Scanner;

public class ColorCodeConverter {

public static void main(String[] args) {
       
        String[] colors = {"red", "green", "blue", "cyan", "magenta", "yellow", "white", "black"};
        String[] codes = {"100", "010", "001", "011", "101", "110", "111", "000"};
        
       
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a color code (as a string of 0s and 1s): ");
        String colorCode = scanner.nextLine();
        
       
        int index = -1;
        for (int i = 0; i < codes.length; i++) {
            if (codes[i].equals(colorCode)) {
                index = i;
                break;
            }
        }
        
       
        if (index == -1) {
            System.out.println("Invalid color code.");
        } else {
            System.out.println("The corresponding color is " + colors[index] + ".");
        }
        
       
        scanner.close();
    }
}
