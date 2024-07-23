package advanced.exceptions;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        System.out.println(divide(30, 2));
        System.out.println(divide(30, 0));
    }
    private static int divide(int dividend, int divisor){

        try {
            if (divisor == 0){
                throw new ZeroDivisorException("The divisor can't be zero! - Custom exception");
            }
            return dividend / divisor;
        }catch (NullPointerException exception){
            System.out.println("NullPointerException is throw");
            return 0;
        }catch (ZeroDivisorException exception){
            System.out.println("The divisor can't zero!");
            exception.printStackTrace();
            return 0;
        }
        finally {
            System.out.println("Hey, I'm a very good tool to close files and database connections");
        }
    }
}
