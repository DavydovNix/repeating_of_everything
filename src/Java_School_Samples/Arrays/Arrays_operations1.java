package Java_School_Samples.Arrays;

public class Arrays_operations1 {
    public static void main(String[] args) {
        //Заполнение массива из 10 чисел, числами от 1 до 10:
        int[] array=new int[10];
        for (int i=0;i<array.length;i++){
            array[i]=i+1;
        }
        for (int e:array) {
            System.out.print(e+" ");
        }
    }

}
