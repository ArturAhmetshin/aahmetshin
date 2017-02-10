package ru.aahmetshin.start;

/**
 * Created by Artur on 02.02.2017.
 */
public class StubInput implements Input {
    /**
     * Private fild answers.
     */
    private String[] answers;
    /**
     * Private fild position.
     */
    private int position = 0;
    /**
     * This constructor class Item.
     *
     * @param answers        for constructor
     */
    public StubInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String ask(String question) {

        System.out.println(this.answers[position]);
        return this.answers[position++];
    }
}
