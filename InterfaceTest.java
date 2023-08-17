package com.catalyst.interface_programs;

//interface,Java 8 changes in interface, Annonymous inner class, lamda expression, functionalInterface, marker interface.
/*interface: interface is keyword to create an interface in java.
* we can never create an Object of interfaces.
* interfaces only having abstract methods...until 1.8 version only..  (Java's latest version is Java 20).
* interface allows static and default methods from Java 8.
* interface allows private methods from java 9.
* bydefault interface abstract methods are public abstract.
* bydefault interface variables are public static final...
* "implements" keyword iis used to achieve the inheritance.. if child is class and Parent is interface.
* multiple inheritance is supported in case of interface.. (single class can have multiple parents as an interfaces..)
* FunctionalInterface: Interface with Single Abstract Method is called as Functional Interface.
* Marker Interface: Empty interface is called as Marker interface.  (Serializable, Cloneable, RandomAccess, Remote)
*
* sublcass has to provide implementation to all the abstract methods which are there in Parent interfaces.
* */

interface Bank
{
  void provideLoanInfo();

}
class SBI implements Bank
{
    @Override
    public void provideLoanInfo() {
        System.out.println("SBI provides car Loan @10.00 ROI");
    }
}
class ICICI implements Bank
{
    @Override
    public void provideLoanInfo() {
        System.out.println("ICICI provides car Loan @10.50 ROI");
    }
}
public class InterfaceTest {

    public void applyForLoan(Bank bank)
    {
        bank.provideLoanInfo();
    }
    public static void main(String[] args) {
        InterfaceTest interfaceTest=new InterfaceTest();
        interfaceTest.applyForLoan(new SBI());
        interfaceTest.applyForLoan(new ICICI());
/*Annonymous inner class.
* inner class: defining a class inside anather class is called as inner class.
* the inner class which does not have name is called as Annonymus inner class.
* */
//        Bank bank=new Bank();  'Bank' is abstract; cannot be instantiated
        interfaceTest.applyForLoan(new Bank() {
            @Override
            public void provideLoanInfo() {
                System.out.println("PNB provides car Loan @9.50 ROI");
            }
        } );
        //using lamda expression.. only possible in case of functionalInterface..
        interfaceTest.applyForLoan(()->System.out.println("Axis Bank provides car Loan @12.50 ROI"));
        Bank kotak=new Bank(){
            @Override
            public void provideLoanInfo() {
                System.out.println("Kotak Bank provides car Loan @13.50 ROI");
            }
        };
        kotak.provideLoanInfo();

        Bank mh=()->System.out.println("MH bank provides car Loan @8.50 ROI");
        mh.provideLoanInfo();

        //2014 : java 8 introducted..
        //lamda : functional Programming..
        //lamda is also called as annonymous function..(The function which does not have name...)

    }
}

/*diff between and abstract methods and interface.

i]abstract class contains abstract as well as non-abstract methods.
ii]interface contains asbtract, default, static, private methods.

ii]abstract class won't support multiple inheritance.
ii]interface supports multiple inheritance.


* */
