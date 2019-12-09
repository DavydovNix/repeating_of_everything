package java_rush;

public class Ex1 {
    //создать метод выводящий текст 1 раза
    //создать метод выводящий текст 3 раза
    private String text1="mamka";
    public String text2="papka";
    private static String  text3="papik";
    public static  String  text4="mamik";

    public static void main(String[] args) {
        Ex1 output=new Ex1();
        Ex1 out;
        System.out.println((out=new Ex1()).text1); //инициализировали прямо в методе
        System.out.println(output.text2);
        System.out.println(text3);
        System.out.println(text4);
        multiPrint(text3,2);
        System.out.println();
        multiPrint(text4,2);
    }
    public static void multiPrint(String s,int count){
        for (int i=0;i<=count;i++){
            System.out.print(s+" ");
        }
    }
}
