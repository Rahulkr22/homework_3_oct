package com.rahul;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
            Scanner sc=new Scanner(System.in);
            String str=sc.next();
            ArrayList<String> al=new ArrayList<>();
            al=getSS(str);
            System.out.print(al);
            //printarr(al);
    }

    public static ArrayList<String> getSS(String str){
        if(str.length()==0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        if(str.length()>0){
            System.out.println(str);
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> result=getSS(ros);
        ArrayList<String> myal=new ArrayList<>();

        for(String s:result){
            myal.add(s);
            //printarr(myal);
            myal.add(ch+s);

        }

        return myal;
    }

    public static void printarr(ArrayList<String> al){
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
    }
}
