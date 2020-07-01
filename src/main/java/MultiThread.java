import org.apache.log4j.Logger;

public class MultiThread extends Thread {
    private final Incrementer incrementer;
    private final Logger logger = Logger.getLogger(MultiThread.class);

    public MultiThread(Incrementer incrementer) {
        this.incrementer = incrementer;
    }

    @Override
    public void run() {
        while (!incrementer.isFinish()) {
            incrementer.inc();
            logger.info("Thread: " + incrementer.getPosition());
        }
        logger.info("Thread has finished!");
    }
}
