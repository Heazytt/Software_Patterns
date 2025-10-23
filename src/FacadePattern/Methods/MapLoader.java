package FacadePattern.Methods;

public class MapLoader {
    private String name = "Map ";
    private String startGame = "is loading... \n";
    private String closeGame = "is closing... ";

    public void loadMap(String mapName) {
        System.out.printf(name + mapName + startGame );
    }

    public void mapClosing() {
        System.out.println(name + closeGame);
    }


}
