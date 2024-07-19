package intermediate.inheritance.athlete;

public class Athlete {
    String name;
    String nickName;
    int yearOfBorn;
    String team;
    int gamesPlayed;

    public Athlete(String name, String nickName, int yearOfBorn, String team, int gamesPlayed) {
        this.name = name;
        this.nickName = nickName;
        this.yearOfBorn = yearOfBorn;
        this.team = team;
        this.gamesPlayed = gamesPlayed;
    }

    public  String getName(){
        return name;
    }

    public void getBio(){
        System.out.println(name + " (" + nickName + ")");
        System.out.println("Born in "+ yearOfBorn);
        System.out.println("Last team in "+ team + " and played " + gamesPlayed + " game");
    }

}
