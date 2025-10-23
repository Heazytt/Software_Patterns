package FacadePattern.Methods;

public class PlayerLoader {
    private String name = "Players ";
    private String startGame = "is loading...";
    private String closeGame = "is kicking...";

    public void loadPlayers() {
        System.out.println(name + startGame);
    }

    public void playersLeaving() {
        System.out.println(name + closeGame);
    }


}
