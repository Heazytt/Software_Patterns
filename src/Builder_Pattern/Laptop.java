package Builder_Pattern;

public class Laptop {
    private final String type = "Laptop";
    private String CPU;
    private String GPU;
    private String RAMMemory;
    private String Memory;
    private String Disk;
    private String Name;

    public Laptop(LaptopBuilder builder) {
        this.CPU = builder.getCPU();
        this.GPU = builder.getGPU();
        this.RAMMemory = builder.getRAMMemory();
        this.Memory = builder.getMemory();
        this.Disk = builder.getDisk();
        this.Name = builder.getName();
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public void setRAMMemory(String RAMMemory) {
        this.RAMMemory = RAMMemory;
    }

    public void setMemory(String memory) {
        Memory = memory;
    }

    public void setDisk(String disk) {
        Disk = disk;
    }

    public void setName(String name) {
        Name = name;
    }




    @Override
    public String toString() {
        return Name + "{" +
                "CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", RAMMemory='" + RAMMemory + '\'' +
                ", Memory='" + Memory + '\'' +
                ", Disk='" + Disk + '\'' +
                '}';
    }
}

