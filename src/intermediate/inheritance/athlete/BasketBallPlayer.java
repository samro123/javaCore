package intermediate.inheritance.athlete;

import java.util.Random;

public class BasketBallPlayer extends Athlete{

    double freeThrowPercentage;
    double pointsPerGame;


    public  BasketBallPlayer(String name, String nickName, int yearOfBorn, String team,
                             double freeThrowPercentage,double pointsPerGame,int gamesPlayed){
        super(name, nickName, yearOfBorn, team, gamesPlayed);
        this.pointsPerGame = pointsPerGame;
        this.freeThrowPercentage = freeThrowPercentage;


    }

    public void freeThrow(){
        Random randomNumberGenerator = new Random();
        if(randomNumberGenerator.nextDouble()* 100 > freeThrowPercentage){
            System.out.println(super.getName() + " failed to score free throw");
        } else {
            System.out.println(super.getName() + " scored free throw");
        }
    }

}
