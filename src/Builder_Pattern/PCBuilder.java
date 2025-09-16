package Builder_Pattern;

public class PCBuilder implements IBuilder {
    private String CPU;
    private String GPU;
    private String RAMMemory;
    private String Memory;
    private String Disk;
    private String Name;

    @Override
    public PCBuilder setDisk(String Disk) {
        this.Disk = Disk;
        return this;
    }

    @Override
    public PCBuilder setMemory(String Memory) {
        this.Memory = Memory;
        return this;
    }

    @Override
    public PCBuilder setRAMMemory(String RAMMemory) {
        this.RAMMemory = RAMMemory;
        return this;
    }

    @Override
    public PCBuilder setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }

    @Override
    public PCBuilder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    @Override
    public PCBuilder setName(String Name) {
        this.Name = Name;
        return this;
    }

    public String getCPU() {
        return CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public String getRAMMemory() {
        return RAMMemory;
    }

    public String getMemory() {
        return Memory;
    }

    public String getDisk() {
        return Disk;
    }

    public String getName() {
        return Name;
    }

    public PC build() {
        return new PC(this);}
}