package AbsractFactory.Laptop;

import AbsractFactory.ITechnic;

public abstract class Laptop implements ITechnic {
    String name;
    String CPU;
    int Memory;
    int RamMemory;
    Laptop(String name,String CPU, int Memory, int RamMemory){
        this.name = name;
        this.CPU = CPU;
        this.Memory = Memory;
        this.RamMemory = RamMemory;

    }

    @Override
    public abstract String CPU();

    @Override
    public abstract int Memory();

    @Override
    public abstract int RamMemory();

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", CPU='" + CPU + '\'' +
                ", Memory=" + Memory +
                ", RamMemory=" + RamMemory +
                '}';
    }
}
