package Java_School_Samples.Arrays;

public class Arrays_operations2 {
    //Заполнение массива из 10 чисел, числами от 10 до 1:
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i=0;i<numbers.length;i++){
            numbers[i]=10-i;
        }
        for (int element: numbers) {
            System.out.print(element+" ");
        }
    }

}
