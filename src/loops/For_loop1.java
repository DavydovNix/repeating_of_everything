package loops;

import java.util.Scanner;

public class For_loop1 {
    //произведение нечетных чисел от 1 до н
    public static void main(String[] args) {
        int n,mult=1;
        Scanner in=new Scanner(System.in);
        System.out.println("input n");
        n=in.nextInt();
        /*for (int i=1;i<=n;i++){
            if (i%2==1){
                mult*=i;
            }
        }*/
        for (int i=1;i<=n;i+=2){
            mult*=i;
        }
        System.out.println(mult);

    }
}
