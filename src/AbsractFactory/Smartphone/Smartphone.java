package AbsractFactory.Smartphone;

import AbsractFactory.ITechnic;

public abstract class Smartphone implements ITechnic {
    String name;
    String CPU;
    int Memory;
    int RamMemory;
    Smartphone(String name,String CPU, int Memory, int RamMemory){
        this.name=name;
        this.CPU = CPU;
        this.Memory = Memory;
        this.RamMemory = RamMemory;
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
        return 0;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "name='" + name + '\'' +
                '}';
    }
}
