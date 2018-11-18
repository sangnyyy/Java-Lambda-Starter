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

        /*--------------------------------------------------------------------------*/

        Func add = (int a, int b) -> a + b;
        Func subtr = (int a, int b) -> a - b;
        System.out.println("add : " + add.calc(10, 5));
        System.out.println("subtr : " + subtr.calc(10, 5));
    }
}
