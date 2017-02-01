package ru.aahmetshin.models;

/**
 * Class Item.
 *
 * @author aahmetshin
 * @version 1
 * @since 31.01.2017
 */
public class Item {
    /**
     * Private fild name.
     */
    private String name;
    /**
     * Private fild description.
     */
    private String description;
    /**
     * Private fild dateCreate.
     */
    private long dateCreate;
    /**
     * Private fild comments.
     */
    private String[] comments = new String[10];
    /**
     * Private fild id.
     */
    private String id;

    /**
     * This default constructor class Item.
     */
    public Item() {
    }

    /**
     * This constructor class Item.
     *
     * @param name        for constructor
     * @param description for constructor
     * @param dateCreate  for constructor
     */
    public Item(String name, String description, long dateCreate) {
        this.name = name;
        this.description = description;
        this.dateCreate = dateCreate;
    }

    /**
     * Getter for the field "name".
     *
     * @return name of Item
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for the field "description".
     *
     * @return description of Item
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Getter for the field "dateCreate".
     *
     * @return dateCreate of Item
     */
    public long getDateCreate() {
        return this.dateCreate;
    }

    /**
     * Getter for the field "comments".
     *
     * @return comments of Item
     */
    public String[] getComments() {
        return this.comments;
    }

    /**
     * Getter for the field "id".
     *
     * @return id of Item
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter for the field "id".
     *
     * @param id for setter
     */
    public void setId(String id) {
        this.id = id;
    }
}
