package org.example;

import java.util.Arrays;
import java.util.Comparator;

//Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые,
//        и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа.
//        ______________________
//public class CompareArrays<E extends Comparable <E>> implements Comparable <CompareArrays<E>> {
public class CompareArrays<E> implements Comparator<E> {

    private E[] array1;
        private E[] array2;



    public CompareArrays(E[] array1,E[] array2 ) {
        this.array1 = array1;
        this.array2 = array2;
    }


    public static <E> void compareArrays(E array1, E array2) {
        if (Arrays.equals((Object[]) array1, (Object[]) array2)) {
            System.out.println("true");
        } else System.out.println("false");

    }


    @Override
    public int compare(E o1, E o2) {
        if (o1.equals(o2));
    return 0;
    }
}


