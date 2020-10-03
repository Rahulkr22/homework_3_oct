package com.rahul;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);

        switch(c){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;

            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Deficient");
                break;
            case 'F':
                System.out.println("Failing");
                break;

            default:
                System.out.println("enter valid input");
        }
    }
}
