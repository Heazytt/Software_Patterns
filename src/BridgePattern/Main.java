package BridgePattern;

import BridgePattern.Players.SoundCloud;
import BridgePattern.Players.Spotify;
import BridgePattern.Tracks.Hiphop;
import BridgePattern.Tracks.PopTrack;
import BridgePattern.Tracks.Track;

public class Main {
    static void main() {
        SoftwarePlayer spotify = new Spotify();

        Track pop = new PopTrack(spotify,"Blinding Lights");
        pop.play();
        pop.Switch("Sicko Mode");
        pop.stop();

        System.out.println("\n");
        SoftwarePlayer soundcloud = new SoundCloud();
        Track hiphop = new Hiphop(soundcloud,"That i liked");
        hiphop.play();
        hiphop.Switch("");
        hiphop.stop();

    }
}
