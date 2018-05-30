package cht.test.test.testAopDI;

/**
 * Created by chenhaitao on 2017/9/8.
 */
public interface PersonServer {

    void save(String name);

    void update(String name, Integer id);

    String getPersonName(Integer id);
}
