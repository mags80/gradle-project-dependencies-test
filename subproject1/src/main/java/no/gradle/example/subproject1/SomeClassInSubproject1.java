package no.gradle.example.subproject1;

import no.gradle.example.subproject2.HelloWorld;

public class SomeClassInSubproject1 {

 public void doSomethingWithHelloWorld() {
     new HelloWorld().helloWorld();
 }

}
