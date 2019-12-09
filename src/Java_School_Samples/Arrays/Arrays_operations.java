package Java_School_Samples.Arrays;

public class Arrays_operations {
    public static void main(String[] args) {
        //Заполнение массива из 10 чисел, числами от 1 до 10:
        int[] array1=new int[10];
        for (int i=0;i<array1.length;i++){
            array1[i]=i+1;
        }
        System.out.println("final array:");
        for (int i=0;i<array1.length;i++){
            System.out.println(array1[i]+" ");
        }
        //
    }

}
