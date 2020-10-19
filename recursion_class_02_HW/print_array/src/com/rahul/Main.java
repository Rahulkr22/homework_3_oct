package com.rahul;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        print(arr,n,0);
        //System.out.println(res);
    }
    public static void print(int[] arr,int n,int i){
        if(i==n){
            return ;
        }
        System.out.println(arr[i]);
        print(arr,n,i+1);
    }
}
