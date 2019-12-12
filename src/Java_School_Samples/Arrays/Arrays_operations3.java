package Java_School_Samples.Arrays;

public class Arrays_operations3 {
    //Заполнение массива из 10 чисел, числами от 9 до 0
    public static void main(String[] args) {
        int[] numbers=new int[10];
        for (int i=0;i<numbers.length;i++){
            numbers[i]=9-i;
        }
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
