public enum ColorSemaphore {

    GREEN(1000), YELLOW(300), RED(2000);

    private int waitingTime;

    ColorSemaphore(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    public int getWaitingTime() {
        return waitingTime;
    }
}
