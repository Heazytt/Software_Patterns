package FactoryMethod;

public class TextDocument extends Document {
    @Override
    public void edit(String content) {
        data.append(content).append("\n");

    }

    @Override
    public void save() {
        System.out.println("Сохранен в TXT:" + data);
    }

    @Override
    public void close() {
        System.out.println("Документ закрыт. Содержимое:");
        System.out.println(data);
        System.out.println();
    }
}
