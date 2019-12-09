package regular_expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {
    //ввести номер телефона(7 цифр) и проверить правильность ввода.номер должен начинаться с цифры 7
    public static void main(String[] args) {
        String number;
        System.out.println("input your number(7digits)");
        Scanner in=new Scanner(System.in);
        number=in.nextLine();
        if (check_number(number)){
            System.out.println("this "+number+" is correct");
        }else {
            System.out.println("this "+number+" is not correct");
        }

    }
    public  static  boolean check_number(String value){
        Pattern pattern=Pattern.compile("^[7]{1}\\d{6}$");
        Matcher matcher=pattern.matcher(value);
        return matcher.matches();
    }
}
