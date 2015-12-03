package no.gradle.example.subproject2;

import org.testng.annotations.Test;

@Test
public class FooTest {

    public void hello(){
        new Foo().helloWorld();
    }

}
