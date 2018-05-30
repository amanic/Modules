package cht.test.test.testDI;

/**
 * 屠龙勇士要求
 * Created by chenhaitao on 2017/9/8.
 */
public class SlayDragonQuest implements Quest {
    @Override
    public void embark() {
        System.out.println("Embarking on quest to slay dragon");
    }
}
