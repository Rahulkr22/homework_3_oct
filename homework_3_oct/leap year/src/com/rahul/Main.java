package com.rahul;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0 || year%100==0 || year%400==0){
            System.out.println("leap year");
        }else{
            System.out.println("not a leap year");
        }
    }
}
