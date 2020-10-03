package com.rahul;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num<0){
            System.out.println(-1*num);
        }
        else{
            System.out.println(num);
        }
    }
}
