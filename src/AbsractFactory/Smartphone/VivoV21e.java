package AbsractFactory.Smartphone;

public class VivoV21e extends Smartphone{
    public VivoV21e() {
        super("VivoV21e");
    }

    @Override
    public String CPU() {
        return "Snapdragon 720g";
    }

    @Override
    public int Memory() {
        return 128;
    }

    @Override
    public int RamMemory() {
        return 12;
    }
}
