package no.gradle.example.subproject2;


import net.webservicex.GetWeather;
import no.gradle.example.library.MyLibraryImpl;

public class Foo {

    public void helloWorld() {
        new GetWeather().getCountryName();
        System.out.println("Hello: " + new MyLibraryImpl().doSomeThingSmart());
    }

}
