package org.example;
//Напишите обобщенный класс Pair, который представляет собой пару значений разного типа. Класс должен иметь методы getFirst(),
//        getSecond() для получения значений пары, а также переопределение метода toString(), возвращающее строковое представление пары.
public class Pair <T,E> {
public T first;
public E second;

    public T getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public Pair(T first, E second) {
        this.first = first;
        this.second = second;
    }

}
