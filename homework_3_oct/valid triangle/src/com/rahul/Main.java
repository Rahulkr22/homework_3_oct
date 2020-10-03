package com.rahul;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter tree angles: ");
        int ang1=sc.nextInt();
        int ang2=sc.nextInt();
        int ang3=sc.nextInt();
        int whole_angle=ang1+ang2+ang3;
        if(whole_angle==180){
            System.out.println("Valid");
        }else{
            System.out.println("not valid");
        }
    }
}
