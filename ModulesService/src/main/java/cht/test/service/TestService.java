package cht.test.service;

import cht.test.dal.dao.UserMapper;
import cht.test.dal.entity.User;
import com.weidai.wdmsg.facade.api.MsgSendFacade;
import com.weidai.wdmsg.facade.model.request.SendParamReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chenhaitao on 2017/8/21.
 */


@Service
public class TestService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MsgSendFacade msgSendFacade;

    public User test00(Integer id){
        logger.info("tutututututututututututu");
        System.out.println("凸凸凸凸凸凸凸凸凸凸");
        return userMapper.selectByPrimaryKey(id);
    }
}
