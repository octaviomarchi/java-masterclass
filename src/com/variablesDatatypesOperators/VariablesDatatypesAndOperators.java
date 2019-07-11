package com.variablesDatatypesOperators;

public class VariablesDatatypesAndOperators {
    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue / 2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue / 2);
        System.out.println("myNewByteValue= " + myNewByteValue);

        // short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue / 2);

        //long has a width of 64
        long myLongVlaue = 9_223_372_036_854_775_807L;

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue= " + myIntValue);
        System.out.println("myFloatValue= " + myFloatValue);
        System.out.println("myDoubleValue= " + myDoubleValue);

        char myChar = '\u00A9';
        System.out.println("unicode output: " + myChar);

        boolean myBolean = false;
        boolean isMale = true;

        String numberString = "258";
        System.out.println("My new String is: " + (numberString + myIntValue));
    }
}
