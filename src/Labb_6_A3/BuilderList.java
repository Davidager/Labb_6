package Labb_6_A3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by David on 15-Dec-16.
 */
public class BuilderList<E> extends LinkedList<E> implements List<E>{
    private boolean inAddMode;
    private E[] outArray;

    public BuilderList () {
        super();
        inAddMode = true;
    }

    public void add(int index, E item) {
        //inAddMode = true;   //kan tas bort? kolla prestanda
        super.add(index, item);
    }

    public E get(int index) {
        if (inAddMode) {
            long startTime = System.nanoTime();
            outArray = (E[])this.toArray();
            System.out.println(System.nanoTime() - startTime);
            inAddMode = false;
        }
        return outArray[index];
    }
}
