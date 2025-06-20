class MyThread extends Thread{
    @Override
    public void run(){
        for(int i = 0; i <= 5; i++){
            System.out.print(i + " ");

            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
    }
}