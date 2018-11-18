public class Main {
    public static void main(String[] args) {
        /*
        * Make a thread with Traditional Code
        * */
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!");
            }
        });

        th1.start();

        /*
        * Make a thread with Lambda Expression Code
        * */

        Thread th2 = new Thread(() -> System.out.println("Hello World!"));

        th2.start();
    }
}
