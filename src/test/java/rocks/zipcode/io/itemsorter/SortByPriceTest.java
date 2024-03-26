package rocks.zipcode.io.itemsorter;

import rocks.zipcode.io.Item;
import rocks.zipcode.io.ItemSorter;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Comparator;

import org.junit.Test;
import org.junit.Assert;

/**
 * @author leon on 30/01/2019.
 */
public class SortByPriceTest {

    @Test
    public void sortByPriceTest1() {
        Item item1 = new Item(22L, "shoes", 50.0);
        Item item2 = new Item(23L, "pants", 70.0);
        Item item3 = new Item(24L, "shorts", 45.0);
        Item[] itemsToSort = {item2, item1, item3};
        Item[] expectedSortedItems = {item3, item1, item2};
        ItemSorter itemSorter1 = new ItemSorter(itemsToSort);
        Comparator<Item> itemComparator = new PriceComparator();
        Item[] actualSortedItems = itemSorter1.sort(itemComparator);

        Assert.assertEquals(expectedSortedItems, actualSortedItems);
    }

    @Test
    public void sortByPriceTest2() {
        Item item1 = new Item(23L, "jersey", 120.0);
        Item item2 = new Item(22L, "flowers", 10.0);
        Item item3 = new Item(24L, "watch", 12000.0);
        Item[] itemsToSort = {item2, item3, item1};
        Item[] expectedSortedItems = {item2, item1, item3};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> itemComparator = new PriceComparator();
        Item[] actualSortedItems = itemSorter.sort(itemComparator);

        Assert.assertEquals(expectedSortedItems, actualSortedItems);
    }

    @Test
    public void sortByPriceTest3() {
        Item item1 = new Item(23L, "socks", 8.0);
        Item item2 = new Item(22L, "ice axe", 92.0);
        Item item3 = new Item(24L, "planter", 6.0);
        Item[] itemsToSort ={item1, item2, item3};
        Item[] expectedSortedItems = {item3, item1, item2};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> itemComparator = new PriceComparator();
        Item[] actualSortedItems = itemSorter.sort(itemComparator);

        Assert.assertEquals(expectedSortedItems, actualSortedItems);
    }
}
