package intermediate.bil;

public class Coffee {
    public static void main(String[] args) {
        BillChallenger billChallenger = new BillChallenger("Trung Nguyen", 1000.0, 2);
        System.out.println(billChallenger.checkMassMax(10));
        System.out.println();
    }
}
