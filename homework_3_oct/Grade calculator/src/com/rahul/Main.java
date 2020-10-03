package com.rahul;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int n=3;
        int marks[]=new int[n];
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        int total=0;
        for(int i=0;i<n;i++){
            total=marks[i]+total;
        }
        int average=total/n;

        if(average>=90 && average<=100){
            System.out.println("A");
        }
        else if(average>=80 && average<=89){
            System.out.println("B");
        }
        else if(average>=70 && average<=79){
            System.out.println("C");
        }

        else if(average>=60 && average<=69){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }

    }
}