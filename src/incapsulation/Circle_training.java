package incapsulation;

public class Circle_training {
    //типичный инкапсулированный класс
    private int radius;

    public Circle_training(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    //P=2PiR
    public double getPerim(){
        return 2*Math.PI*radius;
    }
    //S=Pir^2
    public double getSquare(){
        return Math.PI*radius*radius;
    }
}
