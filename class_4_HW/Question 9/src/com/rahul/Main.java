package com.rahul;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("value of x: ");
        int x=sc.nextInt();
        System.out.println("value of n: ");
        int n=sc.nextInt();

        double cosX=1;
        int sign=-1;
        for(double i=0;i<=n;i=i+2){
            cosX=cosX+(sign)*(Math.pow(x,i))/(factorial(i));
            sign=sign*(-1);
        }

        System.out.println(cosX);


    }
    public static double factorial(double n){
        if(n==0 || n==1){
            return 1;
        }
        return factorial(n-1)*n;
    }
}

