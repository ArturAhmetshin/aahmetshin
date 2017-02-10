package ru.aahmetshin.start;

/**
 * Created by Artur on 02.02.2017.
 */
public class StartUITest {
    /**
     * main.
     *
     * @param args args
     */
    public static void main(String[] args) {
        Input input = new StubInput(new String[] {"create stub task"});
        new StartUI(input).init();
    }
}
