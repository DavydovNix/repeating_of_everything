package Strings;

public class String_reverce1 {
    //perevesti(preobrazovatb) stroky v standartnii massiv simvolov.For vposledstvii ego reversirovatb
    public static void main(String[] args) {
        String row="hello I am at home";
        String wor=new StringBuilder(row).reverse().toString();
        System.out.println("reverced row: "+wor);

        //вариант 2:
        String row2="I love you";
        StringBuilder stringBuilder=new StringBuilder(row2);
        row2=stringBuilder.reverse().toString();
        System.out.println("row2= "+row2);
    }
}
