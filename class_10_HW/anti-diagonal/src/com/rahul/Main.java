package com.rahul;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int n=4;
        int arr[][]={{01,02,03,04},{05,06,07,8},{9,10,11,12},{13,14,15,16}};
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        antiDiagonal(arr);
    }
    public static void antiDiagonal(int arr[][]){
        int n=arr[0].length;
        for(int col=0;col<n;col++){
            int startcol=col;
            int startrow=0;
            while(startcol>=0 && startrow<n){
                System.out.print(arr[startrow][startcol]);
                startrow++;
                startcol--;
            }
            System.out.println();
        }
        for(int row=1;row<n;row++){
             int startcol=n-1,startrow=row;
             while(startrow<n && startcol>=1){
                 System.out.print(arr[startrow][startcol]+" ");
                 startrow++;
                 startcol--;
             }
            System.out.println();
        }
    }
}
