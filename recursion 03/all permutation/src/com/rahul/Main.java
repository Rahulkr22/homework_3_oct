package com.rahul;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ArrayList<String> al=new ArrayList<>();
        al=getperm(str);
        System.out.print(al);
    }

    public static ArrayList<String> getperm(String str){
        if(str.length()==0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        char ch=str.charAt(0);
        String rest_string=str.substring(1);
        ArrayList<String> result=getperm(rest_string);
        ArrayList<String> my_result=new ArrayList<>();
        for(String ele:result){
            for(int i=0;i<=ele.length();i++){
                String prefix=ele.substring(0,i);
                String suffix=ele.substring(i);
                my_result.add(prefix+ch+suffix);
            }
        }
        return my_result;
    }
}
