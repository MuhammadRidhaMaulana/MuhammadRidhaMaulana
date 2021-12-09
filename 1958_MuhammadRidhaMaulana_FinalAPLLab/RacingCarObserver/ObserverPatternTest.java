public class ObserverPatternTest {

    public static void main(String[] args) {
        RacingCar RacingCar = new RacingCar(true);

        Customer customer1 = new Customer(RacingCar, "Ridha");
        RacingCar.addObserver(customer1);

        Customer customer2 = new Customer(RacingCar, "Maulana");
        RacingCar.addObserver(customer2);

        RacingCar.setInStock(true);
    }
}