package Observer_Pattern;

import Observer_Pattern.service.impl.Jack;
import Observer_Pattern.service.impl.Tom;

public class Main {
    /* ========  Observer Design Pattern  ========*/
    /*
     * Define an One-to-Many dependency between objects where a state change in one object results
     * in all its dependents being notified and update automatically.
     * */
    public static void main(String[] args) {

        //Initialize the Subject
        //he's the one who messages others here in this case scenario
        Tom tom = new Tom();

        //Initialize two Observers
        Jack jack = new Jack();
        Ramal ramal = new Ramal();

        //Register observers to the Subject
        tom.register(jack);
        tom.register(ramal);


        //tom sends a message
        //Now see what will happen after the subject states changed
        tom.notifyAllObservers("Kamali Uploaded a New Photo");
        tom.notifyAllObservers("Kamali left the chat");

    }
}
