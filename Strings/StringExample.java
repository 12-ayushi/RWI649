package com.company;

public class StringExample {
    public static void main(String[] args) {
        String str="Hello Ayushi sahu,Ayushi xyz,Ayushi abc";
        int r=-1,count=0;
        while ((r=str.indexOf("Ayushi",r+1))!=-1){
            count++;
        }
        System.out.println("Total Ayushi Found: "+count);
        /* Question:
        Found total alphabet in string
        found total lowercase alpabets
        count total uppercase
        count total vowels
        count total consonents;

         */
    }
}
