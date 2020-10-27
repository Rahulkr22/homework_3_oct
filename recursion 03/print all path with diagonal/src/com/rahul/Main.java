package com.rahul;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int [][] board=new int[n][n];
        findPath(n,1,1,"");
    }
    public static void findPath(int n,int row,int col,String ans){
        if(row==n && col==n){
            System.out.println(ans);
            return;
        }
        if(row>n || col>n){
            return;
        }
        findPath(n,row+1,col,ans+"H");
        findPath(n,row,col+1,ans+"V");
        findPath(n,row+1,col+1,ans+"D");



    }
}
