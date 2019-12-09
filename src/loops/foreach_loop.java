package loops;

public class foreach_loop {
    //double array.count summ of + and - elements
    public static void main(String[] args) {
        double[] array={23,-56,0,2,-4,6};
        double summOfPositive=0,summOfNegative=0;
        for (double d:array) {
            if (d>0){
                summOfPositive+=d;
            }else {
                summOfNegative+=d;
            }
        }
        System.out.println("summ+ ="+summOfPositive+" "+"summ- ="+summOfNegative);
    }
}
