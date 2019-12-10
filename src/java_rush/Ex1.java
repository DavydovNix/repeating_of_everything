package java_rush;

public class Ex1 {
    //создадим переменные вне класса и вызовем их
    //создать метод выводящий текст 1 раза
    //создать метод выводящий текст 3 раза
   private String name = "Den";
   private static String secondName = "Papa";
   public String name2 = "Vaska";
    public static void main(String[] args) {
        Ex1 ex1=new Ex1();
        Ex1 out;
        System.out.println((out=new Ex1()).name);
        System.out.println(secondName);
        System.out.println(ex1.name);
        System.out.println(Ex1.secondName);
        System.out.println(ex1.name2);
        Ex1.multiprint(secondName,4);
        multiprint(ex1.name,2);
        multiprint(ex1.name2,9);
    }
    public static void multiprint(String text,int count){
        for (int i=0;i<count;i++){
            System.out.print(text+" ");
        }
    }
}
