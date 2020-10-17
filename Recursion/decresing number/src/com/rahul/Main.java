package com.rahul;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        printDecreasing(n);
    }
    public static void printDecreasing(int n){
       if(n==0){
           return;
       }
       int ind=n;
        System.out.println(ind);
        printDecreasing(ind-1);
    }
}
