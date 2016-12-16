package Labb_6_A3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by David on 16-Dec-16.
 */
public class Builder<E> extends LinkedList<E>{


    public Builder() {
        super();
    }

    public void add(int index, E item){
        super.add(index, item);
    }

    /*public ArrayList<E> build() {
        //ArrayList retlis = new ArrayList();
        E[] array = (E[])this.toArray();
        ArrayList<E> retlis = new ArrayList<>(Arrays.asList(array));
        return retlis;
    }*/

    public E[] build() {
        //ArrayList retlis = new ArrayList();
        E[] array = (E[])this.toArray();
        //ArrayList<E> retlis = new ArrayList<>(Arrays.asList(array));
        return array;
    }
}
