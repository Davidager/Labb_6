package Labb_6_A1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by David on 12-Dec-16.
 */
public class WidthIterator implements Iterator<BagComponent> {

    private LinkedList<BagComponent> queue = new LinkedList<>();

    public WidthIterator(BagComponent root) {
        queue.add(root);
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }

    public BagComponent next() {
        if(queue.isEmpty()) {
            throw new NoSuchElementException();
        }
        BagComponent node = queue.remove();
        if (node instanceof BagContainer) {
            int childrenCount = ((BagContainer) node).getChildCount();
            for (int i = 0 ; i < childrenCount ; i++) {
                queue.add(node.getChild(i));
            }
        }
        return node;
    }
}
