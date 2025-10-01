package AbsractFactory.Factory;


import AbsractFactory.Laptop.AcerNitro15;
import AbsractFactory.Smartphone.VivoV21e;

public class VivoAcerFactory implements ITechnicFactory {
    @Override
    public AcerNitro15 LaptopCreate() {
        return new AcerNitro15();
    }

    @Override
    public VivoV21e SmartphoneCreate() {
        return new VivoV21e();
    }
}
