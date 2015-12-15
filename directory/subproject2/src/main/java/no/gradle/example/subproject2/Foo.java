package no.gradle.example.subproject2;


import net.webservicex.GetWeather;
import no.gradle.example.library.MyLibraryImpl;
import org.joda.time.DateTime;

public class Foo {

    public void helloWorld() {
        new GetWeather().getCountryName();
        new DateTime();
        System.out.println("Hello: " + new MyLibraryImpl().doSomeThingSmart());
    }

}
