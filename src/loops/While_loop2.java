package loops;

public class While_loop2 {
    //Ввести н-значное число и посчитать число четных цифр
    public static void main(String[] args) {
        int number=254,countDigit=0;
        int digit;
        while (number>0){
            digit=number%10; //получить младшую(последнюю) цифру от числа
            if (digit%2==0){
                countDigit++;
            }
            number/=10;
        }
        System.out.println(countDigit);
    }
}
