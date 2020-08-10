package LanguageBasics;


public class Calculator {

    interface IntegerMath {
        int operation(int a, int b);
    }

    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a,b);
    }

    public  int methodReferencing(int a, int b){
        return a+b;
    }



    public static void main(String... args) {

        Calculator myApp = new Calculator();
        //note you can encapsulate a method using lamdas and method references using only a functional interface
        IntegerMath addition = myApp::methodReferencing;
        System.out.println(myApp.methodReferencing(5,4));
        IntegerMath subtraction = (a, b) -> a - b;
        System.out.println("40 + 2 = " +
                myApp.operateBinary(40, 2, addition));
        System.out.println("20 - 10 = " +
                myApp.operateBinary(20, 10, subtraction));

    }
}