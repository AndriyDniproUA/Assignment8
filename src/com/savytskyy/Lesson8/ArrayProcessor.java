package com.savytskyy.Lesson8;

public class ArrayProcessor <T>{
    T[] array;

    public ArrayProcessor(T[] array) {
        this.array = array;
    }

    public void process (ElementProcessor<T> ep) {
        for (T t : array) {
            ep.run(t);
        }
    }
}
