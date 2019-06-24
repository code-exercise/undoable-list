package com.exercise.undoablelist;

public interface ListIntf<T> extends Iterable<T>{

    void add(T value);
    T remove(T value);
    void undo();
    void redo();
    
}
