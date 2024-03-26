package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item> {
 
    @Override
    public int compare(Item o1, Item o2) {
//        int result = -1;
//        if (o1.getId() == o2.getId()) {
//            result =  0;
//        }
//        else if (o1.getId() > o2.getId()) {
//            result = 1;
//        }
//        return result;
        return o1.getId().compareTo(o2.getId());
    }
}
