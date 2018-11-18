import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

        /*
        * Func With Interface
        * */

        Func add = (int a, int b) -> a + b;
        Func subtr = (int a, int b) -> a - b;
        System.out.println("add : " + add.calc(10, 5));
        System.out.println("subtr : " + subtr.calc(10, 5));

        /*--------------------------------------------------------------------------*/
        /*
        * Func With return
        * */
        Func add2 = (int a, int b) -> { return a+b; };
        int addResult = add2.calc(1, 2);
        System.out.println("add result : " + addResult);

        /*--------------------------------------------------------------------------*/
        /*
        * Stream API
        * Get Stream From Collection Framework
        * */
        Arrays.asList(1, 2, 3).stream();
        Arrays.asList(1, 2, 3).parallelStream();

        /*--------------------------------------------------------------------------*/
        /*
         * Stream API
         * forEach
         * */
        Arrays.asList(1, 2, 3, 4, 5).stream()
                .forEach(System.out::print);
        System.out.println();
        /*--------------------------------------------------------------------------*/
        /*
         * Stream API
         * map
         * */
        Arrays.asList(1, 2, 3).stream()
                .map(i -> i*i)
                .forEach(System.out::print);
        System.out.println();
        /*--------------------------------------------------------------------------*/
        /*
         * Stream API
         * limit
         * */
        Arrays.asList(1, 2, 3, 4, 5)
                .stream()
                .limit(2)
                .forEach(System.out::print);
        System.out.println();
        /*--------------------------------------------------------------------------*/
        /*
         * Stream API
         * skip
         * */
        Arrays.asList(1, 2, 3).stream()
                .skip(1)
                .forEach(System.out::print);
        System.out.println();
        /*--------------------------------------------------------------------------*/
        /*
         * Stream API
         * filter
         * */

        Arrays.asList(1, 2, 3).stream()
                .filter(i -> (2 >= i))
                .forEach(System.out::print);
        System.out.println();
        /*--------------------------------------------------------------------------*/
        /*
         * Stream API
         * flatMap
         * */
        Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5), Arrays.asList(6, 7, 8))
                .stream()
                .flatMap(i -> i.stream())
                .forEach(System.out::print);
        System.out.println();

        /*--------------------------------------------------------------------------*/
        /*
         * Stream API
         * reduce
         * */

        System.out.println(Arrays.asList(1, 2, 3).stream()
                .reduce((a, b)->(a-b))
                .get()
        );


        /*--------------------------------------------------------------------------*/
        /*
         * Stream API
         * collection
         * */
        Arrays.asList(1, 2, 3).stream()
                .collect(Collectors.toList());
        Arrays.asList(1, 2, 3).stream()
                .iterator();

    }
}
