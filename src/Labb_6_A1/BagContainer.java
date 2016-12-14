package Labb_6_A1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 10-Dec-16.
 */
public class BagContainer extends BagComponent{
    private String name;
    private double weight;
    private List<BagComponent> childList;

    public BagContainer(String name, double weight) {
        super(name, weight);
        this.name = name;
        this.weight = weight;
        childList = new ArrayList<>();
    }

    public BagContainer clone() {
        BagContainer clonedItem;
        clonedItem = (BagContainer) super.clone();
        clonedItem.childList = new ArrayList<>();
        if (!childList.isEmpty()) {
            for (BagComponent child : childList) {
                clonedItem.add(child.clone());
            }
        }
        return clonedItem;
    }

    public String toString() {
        String retString = "";
        if (!childList.isEmpty()) {
            retString = ", som innehåller ";
            int listLength = childList.size();
            retString += childList.get(0).toString();

            if (listLength > 1) {
                if (listLength > 2) {
                    for (int i = 1 ; i<listLength-1 ; i++) {
                        retString += ", " + childList.get(i).toString();
                    }
                }
                retString += " och " + childList.get(listLength-1).toString();
            }
        }
        return "en " + name + retString;
    }

    public double getWeight() {
        double retWeight = weight;
        if (!childList.isEmpty()) {
            for (BagComponent item : childList) {
                retWeight += item.getWeight();
            }
        }
        return retWeight;
    }

    public BagComponent getChild(int index) {
        return childList.get(index);
    }

    public int getChildCount() {
        return childList.size();
    }

    public void add(BagComponent child){
        childList.add(child);
    }

    public void remove(BagComponent component) {
        childList.remove(component);
    }

}
