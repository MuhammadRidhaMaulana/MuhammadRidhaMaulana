/*modifikasi mobil biasa ke Racing car*/

public class RacingCar extends CarDecorator {

    public RacingCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Racing Car.");
    }
}