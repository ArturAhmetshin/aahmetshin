package ru.aahmetshin.start;

/**
 * Created by Artur on 09.02.2017.
 */
public interface UserAction {
    /**
     *This method key.
     *@return key
     */
    int key();
    /**
     *This method execute.
     *@param input is input
     *@param tracker is tracker
     */
    void execute(Input input, Tracker tracker);
    /**
     *This method info.
     *@return info
     */
    String info();
}
