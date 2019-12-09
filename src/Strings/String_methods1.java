package Strings;

public class String_methods1 {
    /*Дана строка. Вывести первый, последний и средний (если он есть) символы. Напишите программу,
     *  которая выводит часть строки до первой встреченной точки, включая точку.
     *  Также предусмотрите вывод количества пробелов.*/
    public static void main(String[] args) {
        String line="my  li.fey is hard struggle";
        int size=line.length();
        System.out.println(size);
        size=line.lastIndexOf('f');
        System.out.println(size);
        String upper=line.toUpperCase();
        System.out.println(upper);
        String replace=line.replace('l','m');
        System.out.println(replace);
        replace=line.replaceAll("y","gopa");
        System.out.println(replace);
        String substr=line.substring(4,6);
        System.out.println(substr);
        System.out.println("first symbol: "+line.charAt(0));
        System.out.println("last symbol is: "+line.charAt(line.length()-1));
        System.out.println("average symbol is: "+(line.length()%2!=0 ? line.charAt(line.length()/2) : "string hasn't an average symbol"));
        System.out.println("part of string before first dot: "+(line.indexOf(".")!=-1 ? line.substring(0, line.indexOf(".")+1) : "string doesn't have any dots"));
        int countSpaces=0;
        for (int i=0;i < line.length();i++){
            if (line.charAt(i)==' '){
                countSpaces++;
            }
        }
        System.out.println("row has such amount of spaces: "+countSpaces);
    }
}
