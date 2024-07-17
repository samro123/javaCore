package intermediate.classesandoobject;

public class CarsApp {
    public static void main(String[] args) {
        DodgeChallenger dodgeChallenger = new DodgeChallenger();
        dodgeChallenger.startTheEngine();
        dodgeChallenger.getDescription();

        System.out.println("-------------------------------------");
        DodgeChallenger orangeDodgeChallenger = new DodgeChallenger("orange", (byte) 2,  (short) 392, (short) 492, (short) 6780, 38000, 10000, true);
        orangeDodgeChallenger.startTheEngine();
        orangeDodgeChallenger.getDescription();
    }
}
