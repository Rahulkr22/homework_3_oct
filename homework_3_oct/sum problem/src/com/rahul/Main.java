package com.rahul;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int choice;
        int n1,n2;
        do{
            System.out.println("enter first no:");
            n1=sc.nextInt();
            System.out.println("enter second no:");
            n2=sc.nextInt();

            System.out.println("press 1 to continue and 0 to terminate");
            System.out.println("enter your choice:");
            choice=sc.nextInt();
            System.out.println("sum: "+(n1+n2));
        }
        while(choice==1);

    }
}
