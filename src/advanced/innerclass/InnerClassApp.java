package advanced.innerclass;


import advanced.enumcoding.PizzaSize;



public class InnerClassApp {
    //nested class
    private static boolean isPizzaRead(int waitedInMinutes){
        class Oven{
            public boolean isPizzaBakedProperly(){
                if(waitedInMinutes > 30){
                    return true;
                }
                return false;
            }
        }
        Oven oven = new Oven();
        return oven.isPizzaBakedProperly();
    }

    public static void main(String[] args) {
        Pizza firstPizza = new Pizza("Marghertia", PizzaSize.MEDIUM);
        System.out.println("Name: " + firstPizza.getName());
        Pizza secondPizza = new Pizza("Marghertia", PizzaSize.MEDIUM){
            @Override
            public String getName() {
                return "Anonymous";
            }
        };
        System.out.println("Name: "+ secondPizza.getName());

        if (isPizzaRead(40)){
            System.out.println("The pizza is ready ");
        }else {
            System.out.println("The pizza is no ready yet");
        }

        Pizza thirdPizza = new Pizza("Pizza cake", PizzaSize.MEDIUM);
        //Điều này cho phép truy cập vào lớp nội tuyến từ một đối tượng của lớp bên ngoài.
        Pizza.PizzaSlice pizzaSlice = thirdPizza.cutPizzaSlice();

        System.out.println(pizzaSlice.calculatePizzaSliceArea());
    }
}
