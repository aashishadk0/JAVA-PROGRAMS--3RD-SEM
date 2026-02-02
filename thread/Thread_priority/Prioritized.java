package thread.Thread_priority;

public class Prioritized extends Thread {
    public Prioritized(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Priority of " + getName() + " is " + getPriority());
    }

    public static void main(String[] args) {
        Prioritized p1 = new Prioritized("Least priority");
        Prioritized p2 = new Prioritized("Most priority");
        p1.setPriority(Thread.MIN_PRIORITY);
        p2.setPriority(Thread.MAX_PRIORITY);
        p1.start();
        p2.start();
    }
}
