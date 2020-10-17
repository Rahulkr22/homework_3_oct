package com.rahul;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long fact=factorial(n);
        System.out.println(fact);
    }

    public static long factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
