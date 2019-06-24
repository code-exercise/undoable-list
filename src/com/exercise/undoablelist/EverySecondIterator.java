package com.exercise.undoablelist;

import java.util.Iterator;

public class EverySecondIterator<T> implements Iterator<T> {

    public EverySecondIterator(Iterator<T> target) {

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }
}
