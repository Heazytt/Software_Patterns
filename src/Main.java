public class Main {
    public static void main(String[] args) {
        PC laptop = new PCBuilder().setName("Acer").setDisk("SSD").setGPU("NVIDIA").setCPU("AMD").setMemory("512GB").setRAMMemory("16GB").build();
        System.out.println(laptop.toString());


    }
}