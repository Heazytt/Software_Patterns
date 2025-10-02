package BridgePattern.Tracks;

import BridgePattern.SoftwarePlayer;

public class Hiphop extends Track{
    public Hiphop(SoftwarePlayer softwareplayer, String title) {
        super(softwareplayer, title);
    }

    @Override
    public void play() {
        softwareplayer.playSong(title);
    }

    @Override
    public void Switch(String newtitle) {
        softwareplayer.SwitchTrack(title);
        this.title = newtitle;
    }

    @Override
    public void stop() {
        softwareplayer.stopSong(title);
    }
}
