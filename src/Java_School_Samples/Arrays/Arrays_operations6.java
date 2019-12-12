package Java_School_Samples.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays_operations6 {
    //Ввод 10 чисел с клавиатуры чз БуфередРидер
    public static void main(String[] args) {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int[] numbers=new int[10];
        System.out.println("input "+numbers.length+" numbers");
        try {
            for (int i=0;i<numbers.length;i++){
                System.out.println("input number "+(i+1));
                String s = reader.readLine();
                numbers[i]= Integer.parseInt(s);//(Integer.reader.readLine());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        for (int e:numbers) {
            System.out.print(e+" ");
        }

    }
}
