package com.rahul;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        //System.out.println("enter the size of set: ");
        int n=sc.nextInt();
        int even=0;
        int odd=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                even+=arr[i];
            }
            else{
                odd+=arr[i];
            }
        }
        System.out.println(even+" "+odd);
    }
}
