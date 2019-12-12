package Java_School_Samples.Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Arrays_operations5 {
    //Ввод 10 строк с клавиатуры чз BufferedReader ...(new InputStreamReader(System.in))
    public static void main(String[] args) {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String[] list=new String[10];
        try {
            System.out.println("input "+list.length+" lines");
            for (int i=0;i<list.length;i++){
                System.out.println("input line number "+(i+1));
                list[i]=reader.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
