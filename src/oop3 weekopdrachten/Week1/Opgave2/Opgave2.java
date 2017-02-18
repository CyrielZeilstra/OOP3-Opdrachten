public class Opgave2 {

    static int sum = 0;

    static synchronized void addToSum() {
        sum++;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Threader().start();
        }
        System.out.println(sum);
    }
}

class Threader extends Thread {

    @Override
    public void run() {
        Opgave2.addToSum();
    }
}
