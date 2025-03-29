package lr3;

public class Example_5 {
    public static void main(String[] args) {
        System.out.println("Результат расчета 5 элемента Фибоначчи: " + fib(5, 0));
    }

    public static int fib(int n, int count){
        if (n == 0) {
            System.out.print("----".repeat(count) + "Fib " + n + "\n");
            return 0;
        }
        else if (n == 1) {
            System.out.print("----".repeat(count) + "Fib " + n + "\n");
            return 1;
        }
        else{
            System.out.print( "----".repeat(count) + "Fib " + n + " {\n");
            int fib_1 = fib(n-1, count +1);
            int fib_2 = fib(n-2, count +1);
            System.out.println("----".repeat(count) + " }");
            return fib_1+fib_2;
        }
    }
}
