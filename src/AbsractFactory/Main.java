package AbsractFactory;

import AbsractFactory.Factory.ITechnicFactory;
import AbsractFactory.Factory.VivoAcerFactory;
import AbsractFactory.Laptop.Laptop;
import AbsractFactory.Smartphone.Smartphone;
import AbsractFactory.Smartphone.VivoV21e;

public class Main {
    public static void main(String[] args) {
        Laptop laptop;
        Smartphone smartphone;

        final ITechnicFactory VivoAcerFactory = new VivoAcerFactory();
        laptop = VivoAcerFactory.LaptopCreate();
        smartphone = VivoAcerFactory.SmartphoneCreate();

        System.out.println(laptop);
        System.out.println(smartphone);
    }
}
