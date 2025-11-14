class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " started with priority " + getPriority());

        // Simulate some work (optional)
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(getName() + " finished.");
    }
}

public class PriorityDemo {
    public static void main(String[] args) {

        MyThread t1 = new MyThread("minPriority1");
        MyThread t2 = new MyThread("NormPriority");
        MyThread t3 = new MyThread("maxPriority");
        MyThread t4 = new MyThread("minPriority2");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);    // 1
        t2.setPriority(Thread.NORM_PRIORITY);   // 5
        t3.setPriority(Thread.MAX_PRIORITY);    // 10
        t4.setPriority(Thread.MIN_PRIORITY);    // 1

        // Start threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
