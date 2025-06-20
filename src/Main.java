class MyRunnable implements Runnable{

    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello from Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable(), "CountThread");

        thread.setName("안녕하슈");

        thread.start();
    }
}