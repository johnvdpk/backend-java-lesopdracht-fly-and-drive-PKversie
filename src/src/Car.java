public class Car extends Vehicle {

    public Car (int speed, float weight) {
        super(speed, weight);
    }
    @Override
    public void startEngine(){
        System.out.println("Start de auto");
    }

    @Override
    public float getWeight() {
        return super.getWeight();
    }

    public void turnOffEngine(){
        System.out.println("Stop de auto");
    }

}
