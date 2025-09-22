package AbsractFactory.Factory;

import AbsractFactory.Laptop.Laptop;
import AbsractFactory.Smartphone.Smartphone;

public interface ITechnicFactory {
    public Laptop LaptopCreate();
    public Smartphone SmartphoneCreate();
}
