package com.usmansaeed;

public class Main {

    public static void main(String[] args) {
	//byte, short, int, long, float, double, char, boolean, string

        String myStringVar = "This is a string";
        System.out.println(myStringVar);
        myStringVar = myStringVar + ", and this is more.";
        System.out.println(myStringVar);
        myStringVar = myStringVar + " \u00A9 2015";
        System.out.println(myStringVar);

        String numberString = "250.55";
        numberString = numberString + "49.60";
        System.out.println("The result is: " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to: " + lastString);

    }
}
