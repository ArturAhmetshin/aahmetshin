package ru.aahmetshin.start;

import ru.aahmetshin.models.Item;

import java.util.Random;

/**
 * Class Tracker.
 * @author aahmetshin
 * @since 16.01.2017
 * @version 1
 */
public class Tracker {
    /**
     *Private fild "items" massiv item.
     */
    private Item[] items = new Item[10];
    /**
     *Private fild "position" number Item.
     */
    private int position = 0;
    /**
     *Private fild "RN".
     */
    private static final Random RN = new Random();
    /**
     *This method add new Item.
     *@param item is new Item
     *@return Item
     */
    public Item addItem(Item item) {
        item.setId(this.generateId());
        this.items[position++] = item;
        return item;
    }
    /**
     *This method find Item.
     *@param id is id item
     *@return Item
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item: this.items
                ) {
            if (item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
    /**
     *This method find Item.
     *@param key is name item
     *@return Item
     */
    public Item findByName(String key) {
        Item result = null;
        for (Item item: items
                ) {
            if (item.getName().equals(key)) {
                result = item;
                break;
            }
        }
        return result;
    }
    /**
     *This method find all Item.
     *@return all Item
     */
    public Item[] findAll() {
        Item[] result = new Item[this.position];
        for (int index = 0; index != this.position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }
    /**
     *This method update Item.
     *@param item is item
     */
    public void update(Item item) {
        for (int index = 0; index != this.position; index++) {
            if (this.items[index].getId().equals(item.getId())) {
                this.items[index] = item;
                break;
            }
        }
    }
    /**
     *This method delete Item.
     *@param item is item
     */
    public void delete(Item item) {
        for (int index = 0; index != this.position; index++) {
            if (this.items[index].getId().equals(item.getId())) {
                this.items[index] = null;
                break;
            }
        }
    }
    /**
     *This method generates random numbers.
     *@return new id
     */
    String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }
}
