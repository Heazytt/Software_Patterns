package FacadePattern.Methods;

public class SoundEngine {
    private String name = "Sounds ";
    private String startGame = "is loading...";
    private String closeGame = "is terminating...";

    public void loadSounds() {
        System.out.println(name + startGame);
    }

    public void soundisoff() {
        System.out.println(name + closeGame);
    }


}
