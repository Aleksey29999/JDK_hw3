package org.example;



//Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
//        Параметры этих методов – два
//        числа разного типа, над которыми должна быть произведена операция.
public class Calculator {

    public static <T, K> Object sum(Object t, Object k) {
        if (t instanceof Number && k instanceof Number) {
            return ((Number) t).doubleValue() + ((Number) k).doubleValue();
        }
        return "ошибка";
    }
    public static <T, K> Object multiply(Object t, Object k) {
        if (t instanceof Number && k instanceof Number) {
            return ((Number) t).doubleValue() * ((Number) k).doubleValue();
        }
        return "ошибка";
    }

    public static <T, K> Object divide(Object t, Object k) {
        if (t instanceof Number && k instanceof Number && ((Number) k).doubleValue()!= 0) {
            return ((Number) t).doubleValue() / ((Number) k).doubleValue();
        }
        return "ошибка";
    }
    public static <T, K> Object subtract(Object t, Object k) {
        if (t instanceof Number && k instanceof Number) {
            return ((Number) t).doubleValue() - ((Number) k).doubleValue();
        }
        return "ошибка";

    }

}
