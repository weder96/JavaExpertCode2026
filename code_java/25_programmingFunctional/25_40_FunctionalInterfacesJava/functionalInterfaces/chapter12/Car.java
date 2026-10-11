public class Car {
    private String make;
    private String model;
    private Long mp;

    public Car(String ma, String mo, Long mp)
    {
        this.make  = ma;
        this.model = mo;
        this.mp = mp;
    }

    @Override
    public String toString() {return make + " " + model; }
}
