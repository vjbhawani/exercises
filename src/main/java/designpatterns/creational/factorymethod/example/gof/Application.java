package designpatterns.creational.factorymethod.example.gof;

import designpatterns.creational.factorymethod.pattern.Creator;

public abstract class Application extends Creator {
    Document document;

    public void openDocument() {
        //this casting is not required in actual, here it is required because Document is unnecessarily(just for understanding) extending Product
        document = (Document) factoryMethod();
        document.open();
    }

    public void closeDocument() {
        document.close();
    }

    public static void main(String[] args) {
        Application application = new MyApplication();
        application.factoryMethod();

        application.openDocument();
        application.closeDocument();
    }
}
