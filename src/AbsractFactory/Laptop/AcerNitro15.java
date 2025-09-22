package AbsractFactory.Laptop;

public class AcerNitro15 extends Laptop{

    public AcerNitro15(){
        super("AcerNitro15","AMD ryzen 7 7535hs",512,16);
    }

    @Override
    public String CPU() {
        return this.CPU;
    }

    @Override
    public int Memory() {
        return this.Memory;
    }

    @Override
    public int RamMemory() {
        return this.RamMemory;
    }

}
