package com.rahul;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int pow=power(x,n);
        System.out.println(pow);
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }

        return x*power(x,n-1);
    }
}
