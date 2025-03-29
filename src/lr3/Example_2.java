package lr3;

public class Example_2 {
    public static void main(String[] args) {
        rec(1);
    }

    public static void rec(int x){
        if (2*x+1 < 20){
            rec(2*x+1);
        }
        System.out.println(x);
    }
}
