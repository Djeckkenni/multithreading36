public class Incrementer {
    private static final int FINISH = 100;
    private int position;

    public void inc() {
        position++;
    }

    public boolean isFinish() {
        return position == FINISH;
    }

    public int getPosition() {
        return position;
    }
}
