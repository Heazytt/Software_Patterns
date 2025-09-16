package FactoryMethod;

public abstract class Document {
    protected StringBuilder data = new StringBuilder();

    public void open() {
        System.out.println("Документ открыт");
    }

    public abstract void edit(String content);

    public abstract void save();

    public abstract void close();
}