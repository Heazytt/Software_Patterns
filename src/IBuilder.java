public interface IBuilder {
    IBuilder setRAMMemory(String RAMMemory);
    IBuilder setDisk(String Disk);
    IBuilder setGPU(String GPU);
    IBuilder setCPU(String CPU);
    IBuilder setMemory(String Memory);
    IBuilder setName(String Name);
}
