package cht.test.test.testAopDI;

/**
 * Created by chenhaitao on 2017/9/8.
 */
public class PersonServerBean implements PersonServer {
    @Override
    public void save(String name) {
        System.out.println("我是save()方法");
    }

    @Override
    public void update(String name, Integer id) {
        System.out.println("我是update()方法");
    }

    @Override
    public String getPersonName(Integer id) {
        System.out.println("我是getPersonName()方法");
        return "XXX";
    }
}
