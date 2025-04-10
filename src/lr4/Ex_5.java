package lr4;

public class Ex_5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        }
        catch (RuntimeException e){
            System.out.println("2");
        }
        System.out.println("3");
    }

}
