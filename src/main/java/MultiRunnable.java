import org.apache.log4j.Logger;

public class MultiRunnable implements Runnable {
    private final Incrementer incrementer;
    private final Logger logger = Logger.getLogger(MultiRunnable.class);

    public MultiRunnable(Incrementer incrementer) {
        this.incrementer = incrementer;
    }

    @Override
    public void run() {
        while (!incrementer.isFinish()) {
            incrementer.inc();
            logger.info("Runnable: " + incrementer.getPosition());
        }
        logger.info("Runnable has finished!");
    }
}
