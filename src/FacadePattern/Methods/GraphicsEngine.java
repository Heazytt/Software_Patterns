package FacadePattern.Methods;

public class GraphicsEngine {
    private String name = "Graphics ";
    private String startGame = "is initializing...";
    private String closeGame = "is terminating...";


    public void init() {
        System.out.println(name + startGame);
    }

    public void termination() {
        System.out.println(name + closeGame);
    }

}
