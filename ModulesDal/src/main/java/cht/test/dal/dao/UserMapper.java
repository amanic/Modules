package cht.test.dal.dao;

import cht.test.dal.annotation.MybatisMapper;
import cht.test.dal.entity.User;

/**
 * Created by chenhaitao on 2017/8/22.
 */

@MybatisMapper

public interface UserMapper {

    User selectByPrimaryKey(Integer id);
}
