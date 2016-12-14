package Labb_6_A1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;


/**
 * Created by David on 12-Dec-16.
 */

public class DepthIterator implements Iterator<BagComponent> {

    private LinkedList<BagComponent> queue = new LinkedList<>();

    public DepthIterator(BagComponent root) {
        addNodes(root);
    }

    public void addNodes(BagComponent node) {
        queue.add(node);
        if (node instanceof BagContainer) {
            int childrenCount = ((BagContainer) node).getChildCount();
            for (int i = 0 ; i < childrenCount ; i++) {
                addNodes(node.getChild(i));
            }
        }
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }

    public BagComponent next() {
        if(queue.isEmpty()) {
            throw new NoSuchElementException();
        }
        BagComponent node = queue.remove();
        return node;
    }
}
