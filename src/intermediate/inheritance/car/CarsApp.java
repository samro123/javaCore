package intermediate.inheritance.car;

public class CarsApp {
    public static void main(String[] args) {

        System.out.println("-------------------------------------");
        DodgeChallenger orangeDodgeChallenger = new DodgeChallenger("orange", (byte) 2,  (short) 392, (short) 492, (short) 6780, 38000, 10000, true);
        orangeDodgeChallenger.startTheEngine();
        orangeDodgeChallenger.getDescription();
    }
}
