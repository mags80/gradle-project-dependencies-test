package no.jpro.subproject2;


import no.jpro.library.MyLibrary;
import no.jpro.library.MyLibraryImpl;

public class HelloWorld {

    public void helloWorld(){
        MyLibrary myLibrary = new MyLibraryImpl();
        myLibrary.doSomeThingSmart();

    }

}
