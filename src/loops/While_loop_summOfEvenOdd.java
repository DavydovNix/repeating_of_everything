package loops;

public class While_loop_summOfEvenOdd {
    //найти сумму четных/нечетных чисел в числе
    public static void main(String[] args) {
        int number=234567,summOfEven=0,summOfOdd=0;
        while (number>0){
            if (number%2==0){
                summOfEven++;
            }else {
                summOfOdd++;
            }
            number/=10;
        }
        System.out.println("summ of even="+summOfEven+" "+"summ of odd="+summOfOdd);
    }
}
