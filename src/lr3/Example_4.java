package lr3;

public class Example_4 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int x){
        if (x <= 1) return 1;
        else return x* factorial(x-1);
    }
}
