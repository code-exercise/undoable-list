package com.exercise.undoablelist;

import java.util.Iterator;

public class UnDoableList implements ListIntf<String> {


    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public void add(String value) {

    }

    @Override
    public String remove(final String value) {
        return "";
    }

    @Override
    public void undo() {
    }

    @Override
    public void redo() {
    }
}
