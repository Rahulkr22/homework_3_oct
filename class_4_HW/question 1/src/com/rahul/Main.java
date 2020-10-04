package com.rahul;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of N: ");
        int positive =0;
        int negative =0;
        int zero=0;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(num==0){
                zero++;
            }
            else if(num<0){
                negative ++;
            }else{
                positive ++;
            }
        }
        System.out.println("Positive number "+positive);
        System.out.println("Negative Number "+negative);
        System.out.println("Zero "+zero);
    }
}
