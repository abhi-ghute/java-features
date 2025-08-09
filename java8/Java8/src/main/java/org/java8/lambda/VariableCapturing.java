package org.java8.lambda;

@FunctionalInterface
interface MyFunction{

    int display(int a);
}

public class VariableCapturing {

    int x = 10;

    public void effectiveFinal(){

        int y = 10;
        //y=20;
        MyFunction myFunction = (a)->{
            return a*y;
        };

        System.out.println("Variable Capturing...");
        System.out.println("Effective final: "+myFunction.display(10));
        //y++; we can;t change this once assigned it should be final or effective final
    }

    public void instanceVariable(){

        x = 20;
        MyFunction myFunction = (a)->{
            return a*x;
        };

        //same applies on static instance variable
        System.out.println("Variable Capturing...");
        System.out.println("instance variable: "+myFunction.display(10));
        //y++; we can;t change this once assigned it should be final or effective final
    }
}
