package com.epam.mjc.generics;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generics {

    //TODO: Refactor Method-1
    public List<List<String>> boxingMethod(String name) {
        List<String> firstList = new ArrayList<>();
        firstList.add(name);
        List<List<String>> secondList = new ArrayList<>();
        secondList.add(firstList);
        return secondList;
    }

    //TODO: Refactor Method-2
    public List<Object> genericMethod(Object data) {
        return Collections.singletonList(data);
    }

    //TODO: Refactor Method-3
    public void cloneMethod(List<? super Integer> consumer, List<? extends Integer> producer) {
        consumer.addAll(producer);
    }

}
