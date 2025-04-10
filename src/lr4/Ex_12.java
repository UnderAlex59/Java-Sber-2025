package lr4;

public class Ex_12 {
    public static void m(String str, double chislo) {
        if (str == null) {
            throw new IllegalArgumentException("Строка введена неверно");
        }
        if (chislo > 0.001) {
            throw new IllegalArgumentException("Неверное число");
        }
    }

    public static void main(String[] args) {
        try{
            m("s", 0.1);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}

