package Adapter_Pattern;

public class Main {
    static void main() {
        ThunderboltPort thunderboltPort = new ThunderboltPort();
        HDMI hdmiadapter = new ThunderboltToHDMIAdapter(thunderboltPort);
        hdmiadapter.connectWithHDMI();
    }
}
