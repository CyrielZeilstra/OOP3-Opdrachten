public class Main {

    private static int sum = 0;

    static void addOneToSumFail() {
        sum++;
        System.out.println(sum);
    }

   static synchronized void addOneToSum() {
        sum++;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            sumAdder b = new sumAdder();
            Thread a = new Thread(b);
            a.start();
        }
    }
}

class sumAdder implements Runnable {
    @Override
    public void run() {
        Main.addOneToSum();
    }
}