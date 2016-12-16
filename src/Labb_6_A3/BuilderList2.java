package Labb_6_A3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by David on 15-Dec-16.
 */
public class BuilderList2<E> extends ArrayList<E> implements List<E>{
    private LinkedList<E> linkedList;
    private boolean inAddMode;
    private E[] newArray;
    Builder builder;

    public BuilderList2() {
        super();
        builder = new Builder();
        inAddMode = true;
    }

    public void add(int index, E item) {
        builder.add(index, item);
    }

    public E get(int index) {
        if (inAddMode) {
            long startTime = System.nanoTime();
            //this.addAll(builder.build());
            newArray = (E[])builder.build();
            System.out.println(System.nanoTime() - startTime);
            inAddMode = false;
        }
        //return super.get(index);
        return newArray[index];
    }

    public String toString() {
        return Arrays.toString(newArray);
    }


}
