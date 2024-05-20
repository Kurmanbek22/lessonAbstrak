public class BMW extends Car{
    public BMW() {
    }

    public BMW(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println(getModel()+" gas");

    }

    @Override
    public void brake() {
        System.out.println(getModel()+" brake");

    }
}
