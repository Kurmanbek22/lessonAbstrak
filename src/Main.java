public class Main {
    public static void main(String[] args) {
        Car  car =new Mers("W211","black",220);
        Car car1 = new BMW("M5","white",220);
        System.out.println(car);
        System.out.println(car1);
        car.gas();
        car.brake();
        car1.gas();car1.brake();

    }
}