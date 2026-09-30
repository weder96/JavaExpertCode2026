public class ThreadSemapharo implements Runnable {

    private ColorSemaphore color;
    private boolean stop;
    private boolean colorChanged;

    public ThreadSemapharo() {
        this.color = ColorSemaphore.RED;
        this.stop = false;
        this.colorChanged = false;

        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!stop) {
            try {
                Thread.sleep(this.color.getWaitingTime());
                this.changeColor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void changeColor() {
        switch (this.color) {
            case RED:
                this.color = ColorSemaphore.GREEN;
                break;
            case YELLOW:
                this.color = ColorSemaphore.RED;
                break;
            case GREEN:
                this.color = ColorSemaphore.YELLOW;
                break;
            default:
                break;
        }
        this.colorChanged = true;
        notify();
    }

    public synchronized void waitForColorChange() {
        while (!this.colorChanged) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.colorChanged = false;
    }

    public synchronized void stopTrafficLight() {
        this.stop = true;
    }

    public ColorSemaphore getColor() {
        return color;
    }
}