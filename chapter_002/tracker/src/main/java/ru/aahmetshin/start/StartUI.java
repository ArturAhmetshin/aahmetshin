package ru.aahmetshin.start;

/**
 * Class StartUI.
 * @author aahmetshin
 * @since 06.02.2017
 * @version 1
 */
public class StartUI {
    /**
     * Private fild Input.
     */
    private Input input;
    /**
     * The class constructor.
     *
     * @param input input
     */
    public StartUI(Input input) {
        this.input = input;
    }

    /**
     * This method displays ask.
     */
    public  void init() {

    Tracker tracker = new Tracker();
        MenuTracker menuTracker = new MenuTracker(tracker, this.input);
        menuTracker.fillActions();
        do {
            menuTracker.show();
            int key = Integer.valueOf(input.ask("Select:"));
            menuTracker.select(key);

        } while (!"y".equals(this.input.ask("Exit?(y):")));
    }
    /**
     * main.
     *
     * @param args args
     */
    public static void main(String[] args) {
    Input input = new ConsoleInput();
        new StartUI(input).init();
    }
}