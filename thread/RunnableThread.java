package thread;

public class RunnableThread implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {
        RunnableThread rt = new RunnableThread();
        Thread t = new Thread(rt);
        t.start();
        for (int j = 0; j < 10; j++) {
            System.out.println("Main Thread");
        }
    }
}
