package no.gradle.example.subproject2;


import no.gradle.example.library.MyLibrary;
import no.gradle.example.library.MyLibraryImpl;

public class HelloWorld {

    public void helloWorld(){
        MyLibrary myLibrary = new MyLibraryImpl();
        myLibrary.doSomeThingSmart();

    }

}
