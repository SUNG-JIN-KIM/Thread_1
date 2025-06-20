class SumR implements Runnable{

    private final int[] numbers;

    public SumR(int[] numbers){
        this.numbers = numbers;
    }

    @Override
    public void run(){

        int sum = 0;

        for(int n : numbers){
            sum += n;

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println(Thread.currentThread().getName() + " - Sum: " + sum);
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] dataSets = {
                {1, 2, 3, 4, 5},
                {100, 200, 300, 400},
                {10, 20, 30},
                {100, 200, 300, 400},
                {7, 14, 21, 28},
                {100, 200, 300, 400},
                {100, 200, 300, 400}
        };
        for(int i = 0; i < dataSets.length; i++){
            Thread t = new Thread(new SumR(dataSets[i]), "Thread-" + (i + 1));
            t.start();
        }
        System.out.println("All sum threads started.");
    }
}
