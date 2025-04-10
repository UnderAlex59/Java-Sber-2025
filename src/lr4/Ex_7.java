package lr4;

public class Ex_7 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
            try{
                throw new ArithmeticException();
            }
            catch (ArithmeticException ex){
                System.out.println(2);
            }
        } catch (ArithmeticException e) {
            System.out.println("3");
        }
        System.out.println("4");
    }
}
