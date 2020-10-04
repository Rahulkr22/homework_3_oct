package com.rahul;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i=1;i<500;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }

    }

    public static boolean isArmstrong(int num){
        int sum=0;
        int t=num;
        while(num!=0){
            int rem=num%10;
            sum=sum+(rem*rem*rem);
            num=num/10;
            //System.out.println(sum);
        }
        if(t==sum){
            return true;
        }
        return false;
    }
}
