package lr6;



public class Task_4 {
    public static void main(String[] args) {
        Thread tr1 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        Thread tr2 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        Thread tr3 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        Thread tr4 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        Thread tr5 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        Thread tr6 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        Thread tr7 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        Thread tr8 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        Thread tr9 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        Thread tr10 = new Thread(() -> System.out.println(Thread.currentThread().getName()));

        tr1.start();
        tr2.start();
        tr3.start();
        tr4.start();
        tr5.start();
        tr6.start();
        tr7.start();
        tr8.start();
        tr9.start();
        tr10.start();
    }
}
