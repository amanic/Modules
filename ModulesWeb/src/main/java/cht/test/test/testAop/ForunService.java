package cht.test.test.testAop;

import java.sql.SQLException;

/**
 * Created by chenhaitao on 2017/8/31.
 */
public class ForunService {
    public void removeForum(){
        //do sth
        throw new RuntimeException("运行时异常。");
    }
    public void updateForum(){
        //do sth
        try {
            throw new SQLException("数据库更新异常");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
