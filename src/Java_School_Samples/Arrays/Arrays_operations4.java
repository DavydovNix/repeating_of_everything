package Java_School_Samples.Arrays;

import java.util.Scanner;

public class Arrays_operations4 {
    //Ввод 10 строк с клавиатуры через сканер
    public static void main(String[] args) {
        String[] line=new String[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("input "+line.length+" lines");
        for (int i=0;i<line.length;i++){
            System.out.println("input line number "+(i+1));
            line[i]=sc.nextLine();
        }
        System.out.println("dest array:");
        for (String s:line) {
            System.out.println(s);
        }
    }

}
