package Labb_6_A1;

import java.util.Iterator;

/**
 * Created by David on 10-Dec-16.
 */
public abstract class BagComponent implements Iterable<BagComponent>, Cloneable{
    private String name;
    private double weight;


    public BagComponent(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public BagComponent(){}

    public BagComponent clone() {
        BagComponent clonedItem;
        try {
            clonedItem = (BagComponent) super.clone();
            clonedItem.name = name;
            clonedItem.weight = weight;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException();
        }
        return clonedItem;
    }

    /*public DepthIterator iterator() {
        return new DepthIterator(this);
    }*/

    public WidthIterator iterator() {
        return new WidthIterator(this);
    }

    public String toString() {
        return "en " + name;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public BagComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    public void add(BagComponent child){
        throw new UnsupportedOperationException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }




}
