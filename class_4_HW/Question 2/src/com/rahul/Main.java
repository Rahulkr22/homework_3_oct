package com.rahul;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of N: ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        int max=0;
        int min=0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        max=arr[0];
        min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("max "+max);
        System.out.println("min "+min);
    }
}
