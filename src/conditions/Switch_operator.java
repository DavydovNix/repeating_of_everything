package conditions;

import java.io.*;
import java.util.Scanner;

public class Switch_operator {
    //проверка месяца по номеру
    public static void main(String[] args) throws IOException {
        int month_number;
        FileReader fr=new FileReader("src/conditions/in");
        Scanner in=new Scanner(fr);
        FileWriter fw=new FileWriter("src/conditions/out_switch");
        PrintWriter pw=new PrintWriter(fw);
        month_number=in.nextInt();
        switch (month_number){
            case 1:
                System.out.println("month is January");
                break;
            default:
                System.out.println("Such month doesn't exist");
            case 3:
                System.out.println("month is March");
        }

    }
}
