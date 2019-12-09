package Arrays;

import java.util.Random;

public class Array_random {
    //получить случайный(рандомный) массив и вывести его на консоль.
    //НИ кол-во элементов ни сами элементы неизвестны
    public static void main(String[] args) {
        int[] array;
        int n;
        Random rnd=new Random();
        n=rnd.nextInt(5)+5;
        array=new int[n];
        for (int i=0;i < array.length;i++){
            array[i]=rnd.nextInt(50)+50;
        }
        System.out.println("dest array");
        for (int i=0;i < array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

}
