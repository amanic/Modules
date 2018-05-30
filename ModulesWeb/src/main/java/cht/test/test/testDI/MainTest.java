package cht.test.test.testDI;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by chenhaitao on 2017/9/8.
 */
public class MainTest {

    @Test
    public void printtest(){
        System.out.println("凸凸凸");
    }

    @Test
    public void braveQuestTest(){
        Quest mockQuest = mock(SlayDragonQuest.class);
        BraveKnight braveKnight = new BraveKnight(mockQuest);
        braveKnight.embarkOnQuest();
        verify(mockQuest,times(1)).embark();
    }


    @Test
    public void slayDragonQuest(){
        Quest quest = new SlayDragonQuest();
        BraveKnight braveKnight = new BraveKnight(quest);
        braveKnight.embarkOnQuest();
    }


    /**
     *
     * 使用xml配置方式配置aop
     * 单独使用META-INF/spring/DragonAndMusic.xml
     */
    @Test
    public void singAroundQuest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/DragonAndMusic.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }

}
