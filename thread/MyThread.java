package thread;

public class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello child!");
        }
    }

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        for (int j = 0; j < 10; j++) {
            System.out.println("Main Thread");
        }
    }
}
