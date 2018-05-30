package cht.test.test.testAop;

/**
 * Created by chenhaitao on 2017/8/31.
 */
public class NaiveWaiter implements Waiter{
    @Override
    public void greetTo(String name) {
        System.out.println("Greet to "+name+"...");
    }

    @Override
    public void serveTo(String name) {
        System.out.println("Serving "+name+"...");
    }
}
