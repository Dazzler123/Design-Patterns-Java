package Observer_Pattern;

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
        Dasun dasun = new Dasun();
        Ramal ramal = new Ramal();
        Sithum sithum = new Sithum();

        //Register observers to the Subject
        tom.register(dasun);
        tom.register(ramal);
        tom.register(sithum);

        //Now see what will happen after the subject states changed
        tom.notifyAllObservers("Kamali Uploaded a New Photo");
        tom.notifyAllObservers("Kamali left the chat");

    }
}
