package Adapter_Pattern;

public class ThunderboltToHDMIAdapter implements HDMI{
    private ThunderboltPort thunderboltPort;

    public ThunderboltToHDMIAdapter(ThunderboltPort thunderboltPort) {
        this.thunderboltPort = thunderboltPort;
    }

    @Override
    public void connectWithHDMI() {
        thunderboltPort.connectWithThunderbolt();
        System.out.println("Преобразовано в HDMI сигнал");
    }
}
