package Threads.methodsSynchronize;

import java.util.ArrayList;
import java.util.List;

public class Container {
    List<Integer> list=new ArrayList<>();
    public void list_out(){
        System.out.println(list);
    }
    public synchronized void addTocollection(int number,int count_time) throws InterruptedException {
        for (int i=0;i<count_time;i++){
            list.add(number);
            System.out.println("numbers "+number+" adding "+count_time+" times");
            Thread.sleep(2000);
        }
    }

}
