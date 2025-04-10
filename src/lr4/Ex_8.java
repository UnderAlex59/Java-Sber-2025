package lr4;

public class Ex_8 {
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        }
        catch (RuntimeException e) {
            System.out.println(1);
            return 3;
        }
        finally {
            System.out.println("2");
        }
    }

    public static void main(String[] args) {
        System.out.println(m());
    }

}
