package lr6;

public class Task_3 {
    private static final Object lock = new Object();


    private static int number = 1;

    public static void main(String[] args) {
        Thread tr1 = new Thread(() -> {
            synchronized (lock){
                while (number <= 10){
                    if (number %2 == 1){
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                    }
                    else{
                        try{
                            lock.wait();
                        } catch (InterruptedException ex){
                            ex.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            }

        });

        Thread tr2 = new Thread(() -> {
            synchronized (lock){
                while (number <= 10){
                    if (number %2 == 0){
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                    }
                    else{
                        try{
                            lock.wait();
                        } catch (InterruptedException ex){
                            ex.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            }

        });

        tr1.setName("Odd thread");
        tr2.setName("Even thread");

        tr1.start();
        tr2.start();


    }
}
