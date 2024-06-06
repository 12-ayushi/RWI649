package com.company;

  class StringBufferEx {
    public static void main(String[] args) {
      // constrocters
      StringBuffer sb= new StringBuffer();
      StringBuffer sv=new StringBuffer("Ayushi ");
      System.out.println(sb.capacity());
      System.out.println(sv.capacity());//16 + string length
      StringBuffer sc=new StringBuffer(10000);
      System.out.println(sc.capacity() );
      // methods
    }
}
