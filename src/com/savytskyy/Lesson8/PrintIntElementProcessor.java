package com.savytskyy.Lesson8;

public class PrintIntElementProcessor implements ElementProcessor<Integer>{

    @Override
    public void run(Integer elem) {
        System.out.println(elem);
    }
}
