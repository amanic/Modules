package cht.test.test.testDI;

/**
 * 暗夜骑士实现类
 * Created by chenhaitao on 2017/9/8.
 */
public class BraveKnight implements Knight{
    private Quest quest;

    public BraveKnight(Quest q){
        this.quest = q;
    }

    public void embarkOnQuest(){
        quest.embark();
    }
}
