package com.java8.lambda;

@FunctionalInterface
interface ZeroParameter{
    void display();
}

@FunctionalInterface
interface FunctionalParameter{
    int operation(int x, int y);
}

public class LambdaWithParam {

    public void LambdaWithZeroParam(){
        ZeroParameter zeroParameter = ()->System.out.println("Hello, inside zero param abstract");
        zeroParameter.display();
    }

    public void LambdaWithParameters(){
        FunctionalParameter multiply = (x,y)->x*y;
        FunctionalParameter add = (x, y) -> x+y;

        System.out.println("Lambda with Params");
        System.out.println("20*30: "+multiply.operation(20,30));
        System.out.println("20+30: "+add.operation(20,30));
    }
}
