package intermediate.classesandoobject;

public class BasketBallApp {
    public static void main(String[] args) {
        BasketBallPlayer kobe = new BasketBallPlayer("Sam", "Truong", 1999, "", 80, 1299, 12);
        BasketBallPlayer be = new BasketBallPlayer("Ro", "Nghinh", 1999, "", 50, 1299, 12);
        BasketBallPlayer ko = new BasketBallPlayer("Babe", "Girl", 1999, "", 70, 1299, 12);

        BasketBallPlayer[] basketBallPlayers = new  BasketBallPlayer[3];
        basketBallPlayers[0] = ko;
        basketBallPlayers[1] = be;
        basketBallPlayers[2] = kobe;
        for(BasketBallPlayer basketBallPlayer: basketBallPlayers){
            basketBallPlayer.freeThrow();
        }
    }
}
