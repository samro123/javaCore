public class FunctionApp {
    public static void main(String[] args) {
        sayHello();
        blackboardPunishment(3);
        System.out.println("Price: "+ getPercentOffDiscountPrice(10));
    }
    static void sayHello(){
        System.out.println("Hello");
    }
    static void blackboardPunishment(int repeatNumber){
        for (int i = 1 ; i<= repeatNumber ; i++){
            System.out.println("Out");
        }
    }

    static double getPercentOffDiscountPrice(int price){
        return  price * 0.8;
    }

    static  double getDiscount(int price, int percent){
        return price * percent / 100;
    }
}
