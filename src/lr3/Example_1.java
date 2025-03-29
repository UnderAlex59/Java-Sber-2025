package lr3;

public class Example_1 {
    public static void main(String[] args) {
        recursion(1);
    }

    public static void recursion(int x){
        System.out.println(x);
        if (2*x+1 < 20){
            recursion(2*x+1);
        }
    }

}
