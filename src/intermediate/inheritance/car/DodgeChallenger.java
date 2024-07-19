package intermediate.inheritance.car;

public class DodgeChallenger extends Car{



     DodgeChallenger( String color, byte numberOfVehicleOwners, short power,
                     short horsePower, short cubicCapacity,
                     int price, int mileage,
                     boolean isDamaged
     ){
         super("Dodge", color, numberOfVehicleOwners, power, horsePower, cubicCapacity, price,
                 mileage, isDamaged
                 );
     }

     @Override
     public void startTheEngine() {
          System.out.println("Dodge challenger");
     }
}
