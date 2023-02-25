
package com.mycompany.searching;

import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();
        sc.close();
        
        int index = -1;
        
        for(int i = 0; i < size; i++) {
            if(arr[i] == key) {
                index = i;
                break;
            }
        }
        
        if(index == -1) {
            System.out.println(key + " not found in the array.");
        } else {
            System.out.println(key + " found at index " + index + " in the array.");
        }
    }

}
