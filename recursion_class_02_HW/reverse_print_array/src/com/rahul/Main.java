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

        print(arr,n-1);
        //System.out.println(res);
    }
    public static void print(int[] arr,int n){
        if(n<0){
            return ;
        }
        System.out.println(arr[n]);
        print(arr,n-1);
    }
}
