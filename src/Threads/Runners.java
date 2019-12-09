package Threads;

import java.util.List;
import java.util.Random;

public class Runners extends Thread{
   final int TOTAL_DISTANCE=100;
   final int MIN_Step=3;
   final int MAX_Step=6;
   final int MIN_Delay=500;
   final int MAX_DELAY=800;
   private Random rnd=new Random();
    private int runer_number;
    private long run_time;
    private int current_distance;
   List<Integer> places;

    public Runners(int runer_number, int current_distance, List<Integer> places) {
        this.runer_number = runer_number;
        this.current_distance = current_distance;
        this.places = places;
    }
    @Override
    public  void  run() {
        System.out.println("я спортсмен "+runer_number+" начал бежать");
        run_time=System.nanoTime();
        while (current_distance<TOTAL_DISTANCE){
            System.out.println("я спортсмен "+runer_number+" пробежал "+current_distance+" осталось бежать "+(TOTAL_DISTANCE-current_distance));
            int current_step=MAX_Step-MIN_Step;
            int current_delay=MAX_DELAY-MIN_Delay;
            current_distance+=current_step;
            try {
                Thread.sleep(current_delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        places.add(runer_number);
        System.out.println("я спортсмен"+runer_number+"прибежал,моё время"+(System.nanoTime()-run_time)/1000000000);
    }

}
