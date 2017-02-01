package ru.aahmetshin.start;

import org.junit.Test;
import ru.aahmetshin.models.Item;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Test.
 *
 * @author aahmetshin
 * @version 1
 * @since 22.01.2017
 */
public class TrackerTest {
    /**
     * Test add.
     */
    @Test
    public void whenAddOneItemThenReturnItem() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        Item result = tracker.addItem(item);
        assertThat(result, is(item));
    }
    /**
     * Test find ID.
     */
    @Test
    public void whenfindItemThenReturnItemById() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("item1", "descr1", 123);
        Item item2 = new Item("item2", "descr2", 456);
        Item item3 = new Item("item3", "descr3", 678);
        tracker.addItem(item1);
        tracker.addItem(item2);
        tracker.addItem(item3);
        Item checked = item1;
        Item result = tracker.findById(item1.getId());

        assertThat(result, is(checked));
    }
    /**
     * Test find name.
     */
    @Test
    public void whenfindItemThenReturnItemByName() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("item1", "descr1", 123);
        Item item2 = new Item("item2", "descr2", 456);
        Item item3 = new Item("item3", "descr3", 678);
        tracker.addItem(item1);
        tracker.addItem(item2);
        tracker.addItem(item3);
        Item checked = item1;
        Item result = tracker.findByName("item1");
        assertThat(result, is(checked));
    }

    /**
     * Test All items.
     */
    @Test
    public void whenfindItemThenReturnItemAll() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("item1", "descr1", 123);
        Item item2 = new Item("item2", "descr2", 456);
        Item item3 = new Item("item3", "descr3", 678);
        tracker.addItem(item1);
        tracker.addItem(item2);
        tracker.addItem(item3);
        Item[] checked = {item1, item2, item3};
        Item[] result = tracker.findAll();
        assertThat(result, is(checked));
    }
    /**
     * Test update item.
     */
    @Test
    public void whenAddItemThenReturnItemUpdate() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("item1", "descr1", 123);
        Item item2 = new Item("item2", "descr2", 456);
        Item item3 = new Item("item3", "descr3", 678);
        Item item4 = new Item("item4", "descr4", 454);
        tracker.addItem(item1);
        tracker.addItem(item2);
        tracker.addItem(item3);
        item4.setId(item2.getId());
        tracker.update(item4);
        Item[] checked = {item1, item4, item3};
        Item[] result = tracker.findAll();
        assertThat(result, is(checked));
    }
    /**
     * Test All items.
     */
    @Test
    public void whendeleteItemThenReturnItem() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("item1", "descr1", 123);
        Item item2 = new Item("item2", "descr2", 456);
        Item item3 = new Item("item3", "descr3", 678);
        tracker.addItem(item1);
        tracker.addItem(item2);
        tracker.addItem(item3);
        tracker.delete(item1);
        Item[] checked = {null, item2, item3};
        Item[] result = tracker.findAll();
        assertThat(result, is(checked));
    }

}
