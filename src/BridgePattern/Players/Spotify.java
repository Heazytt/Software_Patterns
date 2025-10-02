package BridgePattern.Players;

import BridgePattern.SoftwarePlayer;

public class Spotify implements SoftwarePlayer {
    private final String name = "Spotify";
    @Override
    public void playSong(String title){
        System.out.printf("%s:Playing track %s \n",name,title);
    }

    @Override
    public void SwitchTrack(String title){
        System.out.printf("%s:Switching track %s \n",name,title);
    }

    @Override
    public void stopSong(String title) {
        System.out.printf("%s:Stop track %s \n",name,title);
    }
}
