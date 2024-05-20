public class Mers extends Car{
    public Mers() {
    }

    public Mers(String model, String color, int maxSpeed) {
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
