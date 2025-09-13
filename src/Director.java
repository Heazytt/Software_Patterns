public class Director {

    public static Laptop constructAcerNitro15(){
        return new LaptopBuilder()
                .setCPU("AMD")
                .setGPU("4050rtx")
                .setRAMMemory("16gb")
                .setDisk("512gb")
                .setName("AcerNitro5")
                .build();
    }

    public static PC constructCustomPC1(){
        return new PCBuilder()
                .setRAMMemory("32gb")
                .setDisk("SSD")
                .setName("Custom PC1")
                .setMemory("2tb")
                .setCPU("AMD")
                .setGPU("5060rtx")
                .build();
    }
}
