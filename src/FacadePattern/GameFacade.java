package FacadePattern;

import FacadePattern.Methods.GraphicsEngine;
import FacadePattern.Methods.MapLoader;
import FacadePattern.Methods.PlayerLoader;
import FacadePattern.Methods.SoundEngine;

public class GameFacade {
    private final GraphicsEngine graphicsEngine = new  GraphicsEngine();
    private final MapLoader maploader =  new MapLoader();
    private final SoundEngine soundengine = new  SoundEngine();
    private final PlayerLoader playerloader =  new  PlayerLoader();




    public void startGame(String mapname) {
        System.out.println("Game started...");
        graphicsEngine.init();
        maploader.loadMap(mapname);
        soundengine.loadSounds();
        playerloader.loadPlayers();

    }

    public void closeGame() {
        System.out.println("Game closed...");
        graphicsEngine.termination();
        maploader.mapClosing();
        soundengine.soundisoff();
        playerloader.playersLeaving();

    }


}
