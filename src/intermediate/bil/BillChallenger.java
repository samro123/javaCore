package intermediate.bil;

public class BillChallenger {
    private  String nameCoffee;
    private  double priceCoffee;
    private  double massCoffee;

    BillChallenger(String nameCoffee, double priceCoffee, double massCoffee){
        this.nameCoffee = nameCoffee;
        this.priceCoffee = priceCoffee;
        this.massCoffee = massCoffee;
    }

    public  double sumPrice(){
        return massCoffee * priceCoffee;
    }

    public boolean checkMassMax(double massCoffees){
        return this.massCoffee > massCoffees;
    }

    public  boolean checkSum(){
        return  this.sumPrice() > 500;
    }

    public double discountPrice(double x){
        if (this.checkSum()){
            return  (x/100) * this.sumPrice();
        }
        return 0;
    }


}
