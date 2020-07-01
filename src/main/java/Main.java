public class Main {
    public static void main(String[] args) {
        Incrementer incrementer = new Incrementer();
        MultiThread racerThread = new MultiThread(incrementer);
        Thread runnableRacer = new Thread(new MultiRunnable(incrementer));
        runnableRacer.start();
        racerThread.start();
    }
}
