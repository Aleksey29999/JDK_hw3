package org.example;

import java.util.Arrays;

import static org.example.Calculator.*;


public class Main {
    public static void main(String[] args) {
//      ------------------------------------------------------
        System.out.println(sum(-2.05, 3.25f));
        System.out.println(multiply(-2.05, 3.25f));
        System.out.println(divide(-2.05, 0));
        System.out.println(subtract(-2.05, 3.25f));
//        --------------------------------------------------------
        Number[] array1 = new Number[3];
        array1[0] = 1;
        array1[1] = 2.0f;
        array1[2] = 29384759823476L;

        Number[] array2 = new Number[3];
        array2[0] = 1;
        array2[1] = 2.0f;
        array2[2] = 29384759823476L;

        Integer[] array3 = new Integer[3];
        array3[0] = 1;
        array3[1] = 3;
        array3[2] = 5;

        Integer[] array4 = new Integer[3];
        array4[0] = 1;
        array4[1] = 3;
        array4[2] = 5;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        CompareArrays.compareArrays(array1, array2);
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
        CompareArrays.compareArrays(array3, array4);
//------------------------------------------------------------
int a = 10;
String b ="hello";
        System.out.println(new Pair(a,b));

    }

}