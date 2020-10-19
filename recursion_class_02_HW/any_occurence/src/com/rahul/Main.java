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
        int k=sc.nextInt();
        int res=firstTimeOccurence(arr,n-1,k,0);
        System.out.println(res);
    }
    public static int firstTimeOccurence(int[] arr,int n,int k,int vindx){
        if(vindx==n+1){
            return -1;
        }
        if(arr[vindx]==k){
            return vindx;
        }
        return firstTimeOccurence(arr,n,k,vindx+1);
    }
}

