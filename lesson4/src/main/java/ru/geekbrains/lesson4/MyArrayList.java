package ru.geekbrains.lesson4;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<TElement> implements Iterable<TElement> {

    private TElement[] array;
    private int lastElementIndex = -1;

    public int getCapacity(){
        return array.length;
    }

    public int getSize(){
        return lastElementIndex + 1;
    }

    public MyArrayList(TElement[] array) {
        this.array = array;

    }

    public void add(TElement item){
        if (lastElementIndex + 1 < array.length){
            array[++lastElementIndex] = item;
        }
    }

    @Override
    public Iterator<TElement> iterator() {
        return new MyArrayListIterator();
    }

    class MyArrayListIterator implements Iterator<TElement>{

        Iterator<TElement> iterator = Arrays.stream(array).iterator();

        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        @Override
        public TElement next() {
            return iterator.next();
        }
    }

}
