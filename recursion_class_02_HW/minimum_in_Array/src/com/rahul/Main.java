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

        int res=minimum(arr,n);
        System.out.println(res);
    }
    public static int minimum(int[] arr,int n){
        if(n==1){
            return arr[0];
        }

        return Math.min(arr[n-1],minimum(arr,n-1));
    }
}
