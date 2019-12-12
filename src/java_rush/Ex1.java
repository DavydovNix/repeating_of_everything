package java_rush;

public class Ex1 {
    //создадим переменные вне класса и вызовем их
    //создать метод выводящий текст 1 раза
    //создать метод выводящий текст 3 раза
   public static void output(int count,String s){
       for (int i=0;i<count;i++){
           System.out.print(s+" ");
       }
   }
   private static String line="makaroni";
   private String line2="s tvorogom";
   public int calc_mult(int a,int b){
        int res=a*b;
       return res;
   }

    public static void main(String[] args) {
        Ex1 ex1=new Ex1();
        System.out.println(ex1.calc_mult(6,8));
        System.out.println(ex1.line2);
        Ex1.output(3,"korova");
    }
}
