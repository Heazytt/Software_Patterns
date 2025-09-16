package FactoryMethod;

import FactoryMethod.Factory.DocumentFactory;
import FactoryMethod.Factory.PDFDocumentFactory;
import FactoryMethod.Factory.TextDocumentFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DocumentFactory factory;

        factory = new TextDocumentFactory();
        Document txt = factory.createDocument();
        txt.open();

        while (true) {
            String content = scanner.nextLine();
            if (content.equals(".")) {
                txt.close();
                break;
            } else{
                txt.edit(content);
            }
        }

        System.out.println("\nОткрывается PDF документ");

        factory = new PDFDocumentFactory();
        Document pdf = factory.createDocument();
        pdf.open();

        while (true) {
            String content = scanner.nextLine();
            if (content.equals(".")) {
                pdf.close();
                break;
            } else{
                pdf.edit(content);
            }
        }
    }


}
