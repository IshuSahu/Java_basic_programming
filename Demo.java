public class Demo {

    public static void main(String[] args) {
        // Create two threads
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        
        // Set the priorities of the threads
        thread1.setPriority(Thread.MIN_PRIORITY); // 1
        thread2.setPriority(Thread.MAX_PRIORITY); // 10
        
        // Start the threads
        thread1.start();
        thread2.start();
    }
    
    private static class MyThread extends Thread {
        public MyThread(String name) {
            super(name);
        }
        
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(getName() + ": " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
