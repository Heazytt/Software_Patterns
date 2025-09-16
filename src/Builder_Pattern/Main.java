package Builder_Pattern;

public class Main {
    public static void main(String[] args) {
        PC custompc = Director.constructCustomPC1();
        System.out.println(custompc);

        Laptop laptop1 = Director.constructAcerNitro15();
        System.out.println(laptop1);
    }
}