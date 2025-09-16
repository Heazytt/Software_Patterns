package FactoryMethod.Factory;

import FactoryMethod.Document;
import FactoryMethod.PDFDocument;

public class PDFDocumentFactory extends DocumentFactory{

    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}
