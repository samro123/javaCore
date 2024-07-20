package intermediate.inheritance.car;

public class CarsApp {
    public static void main(String[] args) {

        System.out.println("-------------------------------------");
        DodgeChallenger orangeDodgeChallenger = new DodgeChallenger("orange", (byte) 2,  (short) 392, (short) 492, (short) 6780, 38000, 10000, true);
        System.out.println(orangeDodgeChallenger.getCarName() + "price is "+orangeDodgeChallenger.getPrice());
        orangeDodgeChallenger.setPrice(35000);
        System.out.println(orangeDodgeChallenger.getCarName() + "price is "+orangeDodgeChallenger.getPrice());
        System.out.println("The car is in city mode ");
        orangeDodgeChallenger.startTheElectriEngine();
        orangeDodgeChallenger.startTheEngine();
        System.out.println("The car has " + orangeDodgeChallenger.getMileage() + "miles");
        orangeDodgeChallenger.drive(108);
        System.out.println("After driving the car, it has " + orangeDodgeChallenger.getMileage() + "miles");
        orangeDodgeChallenger.getDescription();
    }
}
