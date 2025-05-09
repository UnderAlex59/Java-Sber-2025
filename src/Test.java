public class Test {
    public static void main(String[] args) {
        Thread thread = new Thread(new Test_Cuncurrent());
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Главный поток");
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException ex){}
        }
        thread.interrupt();
    }
}


class Test_Cuncurrent implements Runnable{
    private volatile int n = 0;
    @Override
    public void run() {
        do {
            if (!Thread.interrupted()){
                System.out.println("Живой поток " + n);
                n++;
            }
            else return;
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException ex){return;};
        } while (true);
    }
}
