package loops;

public class While_loop1 {
    //Дано н-значное число.Определить кол-во цифр
    public static void main(String[] args) {
        int number=135,n=0;
        while (number>0){
            number/=10;
            n++;
        }
        System.out.println(n);
    }
}
