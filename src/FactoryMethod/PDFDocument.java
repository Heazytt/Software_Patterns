package FactoryMethod;

public class PDFDocument extends Document {
    @Override
    public void edit(String content) {
        data.append(content).append("\n");
    }

    @Override
    public void save() {
        System.out.println("Эскпорт PDF документа:\n" + data);
    }

    @Override
    public void close() {
        System.out.println("Документ закрыт. Содержимое:");
        System.out.println(data);
        System.out.println();
    }
}
