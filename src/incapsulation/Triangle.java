package incapsulation;

public class Triangle {
     int a;
      int b;
      int c;

    public Triangle(int a, int b, int c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public  int getPerim(){
        return a+b+c;
    }
    public  double getSquare(){
        double p=getPerim()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public String toString() {
        return "Sides of max perim's triangle are{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
