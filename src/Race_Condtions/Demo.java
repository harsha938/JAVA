package Race_Condtions;

//Without synchronization, the output will be different each time you run the program. Because the threads are trying to access the same variable at the same time. When one thread increments the value of the variable, the other thread may also try to increment the value sof the variable at the same time.
class Count {
    int cnt = 0;
    public synchronized void increment() {
        cnt++;
    }
}

public class Demo {

    public static void main(String[] args) throws InterruptedException {
        Count c = new Count();
        Runnable obj1 = ()
                -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };
        Runnable obj2 = ()
                -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.cnt);
    }
}
