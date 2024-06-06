package com.company;
import java.lang.String;
import java.util.Locale;

public class StringEx {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Ayushi";
        String s3="This is demo of java";
        System.out.println(s1.concat(s2));
        System.out.println(String.join(",",s1,s2));
        // System.out.println(String.join(null,s1,s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s3.substring(3));
        System.out.println(s3.substring(3,11));
        System.out.println(s3.subSequence(2,12));
        System.out.println(s3.replace("i","o"));
        System.out.println(s3.replace("is","was"));
        System.out.println(s3.replaceFirst("is","was"));
        System.out.println(s3.replaceAll("is","hii"));
        System.out.println(s3.replaceAll("is(.)","was"));
        System.out.println(s3.replaceAll("is(.*)","was"));
        ///// String searching method
        System.out.println(s2.indexOf('u'));// index value
        System.out.println(s2.indexOf("yu"));
        System.out.println(s2.lastIndexOf('s'));
        System.out.println(s2.lastIndexOf("sh"));
        System.out.println(s3.toLowerCase());
        System.out.println(s3.toUpperCase());
        // type casting
         int a=10,b=20;
         String s=String.valueOf(a);
         String s5=String.valueOf(b);
         String s4=String.valueOf(a+b);

         char [] c=s2.toCharArray();

        System.out.println(c);
    }
}
