public class FunctionApp {
    public static void main(String[] args) {
        sayHello();
        blackboardPunishment(3);
        System.out.println("Price: "+ getPercentOffDiscountPrice(10));
        System.out.println(getDiscount(100.0, 8));
        getEnergyEfficiency('b');
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
    static  double getDiscount(double price, int percent){
        return  price * percent / 100;
    }
    static  void getEnergyEfficiency(char category){
        switch (category){
            case 'A':
            case 'a':
                System.out.println("Very low energy efficiency categories");
                break;
            case 'B':
            case 'b':
                System.out.println("Low energy efficiency categories");
                break;
            case 'C':
            case 'c':
                System.out.println("Normal energy efficiency categories");
                break;
            case 'D':
            case 'd':
                System.out.println("Above normal low energy efficiency categories");
                break;
            case 'E':
            case 'e':
                System.out.println("High energy efficiency categories");
                break;
            case 'F':
            case 'f':
                System.out.println("Very high energy efficiency categories");
                break;
            case 'G':
            case 'g':
                System.out.println("Extremely high energy efficiency categories");
                break;
            default:
                System.out.println("Error");
        }
    }
}
