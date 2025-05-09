package lr6;

public class Task_2 {
    public static void main(String[] args) throws InterruptedException{
        Thread tr = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        });

        tr.start();

        tr.join();
    }
}
