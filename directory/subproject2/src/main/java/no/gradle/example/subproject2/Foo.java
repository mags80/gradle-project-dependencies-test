package no.gradle.example.subproject2;


import no.gradle.example.library.MyLibraryImpl;

public class Foo {

    public void helloWorld() {
        System.out.println("Hello: " + new MyLibraryImpl().doSomeThingSmart());
    }

}
