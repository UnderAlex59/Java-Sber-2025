package lr3;

public class Example_3 {
    public static void main(String[] args) {
        rec(1,0);
    }

    public static void rec(int x, int count){
        System.out.println("    ".repeat(count) +"Перед рекурсией: " + count + ", x = " + x);
        if (2*x+1 < 20){
            rec(2*x+1, count+1);
        }
        System.out.println("    ".repeat(count) +"После рекурсии: " + count + ", x = " + x);
    }
}
//    Вариант преподавателя
//public class Example_3 {
//    public static void main(String[] args) {
//        m(1);
//    }
//    private static int step = 0;
//
//    public static void m(int x){
//        space();
//        System.out.println("" + x + "-> ");
//        step++;
//        if(2*x+1 < 20){
//            m(2*x+1);
//        }
//        step--;
//        space();
//        System.out.println("" + x + " <-");
//    }
//
//    public static void space(){
//        for (int i = 0; i < step; i++) {
//            System.out.print(" ");
//        }
//    }
//}
