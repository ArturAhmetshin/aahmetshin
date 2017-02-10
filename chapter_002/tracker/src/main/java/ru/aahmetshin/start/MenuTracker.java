package ru.aahmetshin.start;

import ru.aahmetshin.models.Item;

/**
 * Created by Artur on 09.02.2017.
 */
class EditItem implements UserAction {

    @Override
    public int key() {
        return 2;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Please, enter the task's id");
        String name = input.ask("Please, enter the task's name");
        String desc = input.ask("Please, enter the task's description");
        long dateCreate = Integer.valueOf(input.ask("Please, enter the task's date"));
        Item item = new Item(name, desc, dateCreate);
        item.setId(id);
        tracker.update(item);
    }

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "Edit the item.");
    }
}
/**
 * Class MenuTracker.
 * @author aahmetshin
 * @since 10.02.2017
 * @version 1
 */
public class MenuTracker {
    /**
     * Private fild tracker.
     */
    private Tracker tracker;
    /**
     * Private fild Input.
     */
    private Input input;
    /**
     * Private fild actions.
     */
    private UserAction[] actions = new UserAction[5];
    /**
     * The class constructor.
     *
     * @param input input
     *  @param tracker tracker
     */
    public MenuTracker(Tracker tracker, Input input) {
        this.tracker = tracker;
        this.input = input;
    }
    /**
     * This method fillActions.
     */
    public void fillActions() {
        this.actions[0] = this.new AddItem();
        this.actions[1] = new MenuTracker.ShowItems();
        this.actions[2] = new EditItem();
        this.actions[3] = new FindByName();
        this.actions[4] = new FindById();
    }
    /**
     * This method select.
     * @param key is key
     */
    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }
    /**
     * This method show.
     */
    public void show() {
        for (UserAction action : this.actions
                ) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }
    /**
     * Class AddItem.
     * @author aahmetshin
     * @since 10.02.2017
     * @version 1
     */
    private class AddItem implements UserAction {

        @Override
        public int key() {
            return 0;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please, enter the task's name");
            String desc = input.ask("Please, enter the task's description");
            long dateCreate = Integer.valueOf(input.ask("Please, enter the task's date"));
            tracker.addItem(new Item(name, desc, dateCreate));
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Add the new item.");
        }
    }
    /**
     * Class ShowItems.
     * @author aahmetshin
     * @since 10.02.2017
     * @version 1
     */
    private static class ShowItems implements UserAction {

        @Override
        public int key() {
            return 1;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            for (Item item : tracker.findAll()
                 ) {
                System.out.println(String.format("%s. %s", item.getId(), item.getName()));
            }
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "Show all items.");
        }
    }
    /**
     * Class FindbyName.
     * @author aahmetshin
     * @since 10.02.2017
     * @version 1
     */
    private class FindByName implements UserAction {

        @Override
        public int key() {
            return 3;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Please, enter the name item for search");
           Item item = tracker.findByName(name);
            System.out.println(String.format("%s. %s", item.getId(), item.getName()));
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "find the item by name.");
        }
    }
    /**
     * Class FindbiId.
     * @author aahmetshin
     * @since 10.02.2017
     * @version 1
     */
    private class FindById implements UserAction {

        @Override
        public int key() {
            return 4;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Please, enter the id item for search");
            Item item = tracker.findById(id);
            System.out.println(String.format("%s. %s", item.getId(), item.getName()));
        }

        @Override
        public String info() {
            return String.format("%s. %s", this.key(), "find the item by id.");
        }
    }


}
