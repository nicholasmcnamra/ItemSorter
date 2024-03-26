package rocks.zipcode.io;

import java.util.*;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    private Item[] itemsToSort;

    public ItemSorter(Item[] itemsToSort) {
        this.itemsToSort = itemsToSort;
    }

    public Item[] sort(Comparator<Item> comparator) {
        Arrays.sort(this.itemsToSort, comparator);
        return this.itemsToSort;
    }
}
