package conditions;

import java.util.Scanner;

public class Ternary_Operator {
    //booleanExpression ? expression1 : expression2
    //ввести 2 числа и посчитать минимум
    public static void main(String[] args) {
        double a,n;
        Scanner in=new Scanner(System.in);
        System.out.println("input a");
        a=in.nextDouble();
        System.out.println("input n");
        n=in.nextDouble();
        double res=a<n?a:n;
        System.out.println(res);
    }


}
