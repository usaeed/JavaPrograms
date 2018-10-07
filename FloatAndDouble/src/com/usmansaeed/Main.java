package com.usmansaeed;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double myPoundValue = 200d;
        double myKilogramValue = myPoundValue * 0.45359237d;
        System.out.println("Result in Kilorgrams = " + myKilogramValue);


    }
}
