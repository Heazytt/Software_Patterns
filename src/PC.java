public class PC {
    private final String CPU;
    private final String GPU;
    private final String RAMMemory;
    private final String Memory;
    private final String Disk;
    private final String Name;

    public PC(String CPU, String GPU, String RAMMemory, String Memory, String Disk,String Name) {
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAMMemory = RAMMemory;
        this.Memory = Memory;
        this.Disk = Disk;
        this.Name = Name;
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
