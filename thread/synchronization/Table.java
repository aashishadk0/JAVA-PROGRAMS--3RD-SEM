package thread.synchronization;

class Something {
    public synchronized void mul(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}

class ThreadOne extends Thread {
    Something sth;

    public ThreadOne(Something t) {
        this.sth = t;
    }

    public void run() {
        sth.mul(7);
    }
}

class ThreadTwo extends Thread {
    Something sth;

    public ThreadTwo(Something t) {
        this.sth = t;
    }

    public void run() {
        sth.mul(10);
    }
}

class Thread_priority {
    public static void main(String[] args) {
        Something obj = new Something();
        ThreadOne t1 = new ThreadOne(obj);
        ThreadTwo t2 = new ThreadTwo(obj);
        t1.start();
        t2.start();
    }
}