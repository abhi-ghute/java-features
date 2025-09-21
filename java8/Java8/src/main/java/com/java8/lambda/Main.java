package com.java8.lambda;

public class Main {

    public static void main(String[] args) {
        LambdaWithParam lambdaWithParam = new LambdaWithParam();

        lambdaWithParam.LambdaWithZeroParam();
        lambdaWithParam.LambdaWithParameters();

        ForEach.forEachDemo();

        CompratorExample.sortIntegers();
        CompratorExample.sortMap();

        //variable capturing
        VariableCapturing variableCapturing = new VariableCapturing();
        variableCapturing.effectiveFinal();
        variableCapturing.instanceVariable();


        //thread creation
        ThreadCreation t = new ThreadCreation();
        t.createThreads();
    }
}
