package FactoryMethod.Factory;

import FactoryMethod.Document;
import FactoryMethod.TextDocument;

public class TextDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}
