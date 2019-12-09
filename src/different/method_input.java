package different;

public class method_input {
    static int j = 0;

    static void method_example() {
        j++;
        System.out.println("value of j"+j);
    }
}
    class test1{
        public static void main(String[] args) {
            method_input.method_example();
        }
    }

