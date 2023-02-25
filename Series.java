
package com.mycompany.series;

import java.util.Scanner;

public class Series {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();
        
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        System.out.println("The sum of the series 1+2+3+...+" + n + " is " + sum);
    }

}
