package ru.aahmetshin.start;

import java.util.Scanner;

/**
 * Created by Artur on 01.02.2017.
 */
public class ConsoleInput implements Input {
    /**
     * Private fild scanner.
     */
    private Scanner scanner = new Scanner(System.in);
    @Override
    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }
}
