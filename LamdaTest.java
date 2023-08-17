package com.catalyst.interface_programs;

import java.rmi.Remote;
import java.util.RandomAccess;

@FunctionalInterface
interface Shape
{
void area();
}
class Circle implements Shape
{
    @Override
    public void area() {
        System.out.println("i am from circle shape class");
    }
}
public class LamdaTest implements RandomAccess {
    public static void main(String[] args) {
        Shape shape=new Circle();
        shape.area();

//  Shape square=new Shape(); 'Shape' is abstract; cannot be instantiated

        Shape square=new Shape()  {
            @Override
            public void area() {
                System.out.println("I am from shape Square");
            }
        };
        square.area();

  //lamda expression is not at all replacement of Annonymoous inner class. Lamda is just an Annonymous function.
        Shape triangle=()-> System.out.println("i am triangle shape");
        triangle.area();
    }
}
/*Annonymous inner class vs Lamda expression.

* i]Annonymous inner class is a inner class with no name.
* i]Lamda expression is a function without name. (Annonymous function).
*
* ii]for Ann. inner class .class file will be created after compiling the code.
* ii]as Lamda is just a function .class file won't create.
*
* iii]declaring any variable inside ann inner class's but ouside inner class impl method, that variable will act as Instance variabe.
* iii]declaring variable in Lamda is consideres as Local Variable.
*
* iv]we Can implement Ann inner class with Functional interface and other type of interfces and with asbtract class as well.
* iv]to use lamda we must have only FUnctionalInterface.
* */