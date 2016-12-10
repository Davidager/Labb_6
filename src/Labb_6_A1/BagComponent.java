package Labb_6_A1;

/**
 * Created by David on 10-Dec-16.
 */
public abstract class BagComponent{
    private String name;
    private double weight;


    public BagComponent(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public BagComponent(){};

    public String toString() {
        return "en " + name;
    }

    public double getWeight() {
        return weight;
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
