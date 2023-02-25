
package com.mycompany.fibonaccinumber;

import java.util.Scanner;

public class Fibonaccinumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        sc.close();
        
        int first = 0;
        int second = 1;
        int sum = 0;
        
        System.out.print(first + " " + second + " ");
        
        while(sum < limit) {
            sum = first + second;
            if(sum <= limit) {
                System.out.print(sum + " ");
            }
            first = second;
            second = sum;
        }
    }

}
