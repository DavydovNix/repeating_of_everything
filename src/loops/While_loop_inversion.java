package loops;

public class While_loop_inversion {
    //инверсия числа.Ввести число и перевернуть результат
    public static void main(String[] args) {
        int sourse_number=5678,dest_number=0,digit;
        while (sourse_number!=0){
            digit=sourse_number%10;
            dest_number+=digit;
            dest_number*=10;
            sourse_number/=10;
        }
        dest_number/=10;
        System.out.println(dest_number);
    }
}
