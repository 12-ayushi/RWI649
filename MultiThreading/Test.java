package Multithreading;
class A{
    String d(){
        System.out.println("jh");
        return null;
    }
}
class B extends A{

}

public class Test {
   static int fun(int x,int y){
        if(x==0)
            return y;
        return fun(x-1,x+y);
    }
   static void s(int i,int j){
       int t;
       t=i;
       i=j;
       j=t;
    }
    public static void main(String[] args) {
//        int i;
//        int s;
//        for ( i = 10; i !=0; i++) {
//            i=s;
//        }
//        int i=3;
//        do {
//            System.out.println(i+3);
//            i-=1;
//        }while (i!=0);

//        for (int i =-10; i <(-5) ; i++) {
//            System.out.println(i);
//        }

//        int x=0,y=1,z=4;
//        y=x++ + z++;
//        x=z+y;
//        y=y-3;
//        z=y++ + --x;
//        y=z++;
//        System.out.println(x+" "+ y+" "+z);
//        System.out.println( fun(4,3));
//int a=4;
//int b= a++ + --a - a--;
//        System.out.println(a+" "+b);

        int a=10;
        int b=20;
        s(10,20);
        System.out.println(a+" "+b);
    }
}
