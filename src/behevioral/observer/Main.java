package behevioral.observer;

public class Main {
    public static void main(String[] args) {

        Channel c = new Channel();
        c.subscribe(new Subscriber("Rishu"));
        c.subscribe(new Subscriber("Dixit"));
        c.subscribe(new Subscriber("Test"));
        c.subscribe(new Subscriber("Name"));

        c.notification("Ramayan");

        c.unsubscribe(new Subscriber("Rishu"));
        c.notification("Gita Gyan");


    }
}
