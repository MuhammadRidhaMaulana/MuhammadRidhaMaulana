
public class DecoratorPatternTest {

    public static void main(String[] args) {

        Car sportsRacingCar = new SportsCar(new RacingCar(new BasicCar()));
        sportsRacingCar.assemble();
        System.out.println("\n");
    }

}