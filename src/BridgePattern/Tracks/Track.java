package BridgePattern.Tracks;

import BridgePattern.SoftwarePlayer;

public abstract class Track {
    protected SoftwarePlayer softwareplayer;
    protected String title;

    public Track(SoftwarePlayer softwarePlayer, String title) {
        this.softwareplayer = softwarePlayer;
        this.title = title;
    }

    public abstract void play();
    public abstract void Switch(String newTitle);
    public abstract void stop();
}
