package intermediate.classesandoobject;

import java.util.Random;

public class BasketBallPlayer {
    String name;
    String nickName;
    int yearOfBorn;
    String team;
    double freeThrowPercentage;
    double pointsPerGame;
    int gamesPlayed;

    public  BasketBallPlayer(String name, String nickName, int yearOfBorn, String team,
                             double freeThrowPercentage,double pointsPerGame,int gamesPlayed){
        this.gamesPlayed = gamesPlayed;
        this.pointsPerGame = pointsPerGame;
        this.freeThrowPercentage = freeThrowPercentage;
        this.team = team;
        this.yearOfBorn = yearOfBorn;
        this.nickName = nickName;
        this.name = name;
    }

    public void freeThrow(){
        Random randomNumberGenerator = new Random();
        if(randomNumberGenerator.nextDouble()* 100 > freeThrowPercentage){
            System.out.println(name + " failed to score free throw");
        } else {
            System.out.println(name + " scored free throw");
        }
    }

}
