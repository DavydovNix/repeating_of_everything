package conditions;

import java.util.Scanner;

public class If {
    //FindOutMinimalNumber
    public static void main(String[] args) {
        double a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.println("input a");
        a=in.nextDouble();
        System.out.println("input b");
        b=in.nextDouble();
        System.out.println("input c");
        c=in.nextDouble();
        if (a<b && a<c){
            System.out.println("minimal number is a="+a);
        }else {
            if(b<a && b<c){
                System.out.println("minimal number is b="+b);
            }else {
                if(c<a && c<b){
                    System.out.println("minimal number is c="+c);
                }else {
                    if (a==b && b==c) {
                        System.out.println("numbers are equal " + a + "=" + b + "=" + c);
                    }
                }
            }
        }
    }
}
