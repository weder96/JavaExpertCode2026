public class TrafficLightSimulator {

    public static void main(String[] args) {

        ThreadSemapharo semapharo = new ThreadSemapharo();

        for (int i = 0; i < 10; i++) {
            System.out.println(semapharo.getColor().name());
            semapharo.waitForColorChange();
        }

        semapharo.stopTrafficLight();
    }
}