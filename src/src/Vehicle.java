public abstract class Vehicle {
    private int speed;
    private float weight;

    public Vehicle(int speed, float weight) {
        this.speed = speed;
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public float getWeight() {
        return weight;
    }

    public abstract void startEngine();
    public abstract void turnOffEngine();
}
