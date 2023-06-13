public class Main {

    public static void main(String[] args) {
        // Maak een nieuw Car object
        Car myCar = new Car(60, 1200.5f);  // Bijvoorbeeld: snelheid 60, gewicht 1200.5

        // Print de snelheid en het gewicht van de auto
        System.out.println("Snelheid van de auto: " + myCar.getSpeed());
        System.out.println("Gewicht van de auto: " + myCar.getWeight());

        // Start de auto
        myCar.startEngine();

        // Stop de auto
        myCar.turnOffEngine();
    }
}
