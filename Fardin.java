/*
 * write a java program 1!/1 + 2!/2 + 3!/3 +4!/4
 */

package com.mycompany.fardin;

/**
 *
 * @author gub_cse
 */
public class Fardin {

    
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 4; i++) {
            sum += factorial(i) / i;
        }
        System.out.println("Sum of factorials divided by their respective numbers: " + sum);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
