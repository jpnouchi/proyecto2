package com.dev.services.impl;

import com.dev.services.UserBo;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: ADM
 * Date: 22/03/14
 * Time: 10:21 AM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserBoImpl implements UserBo{

    @Override
    public String getMessage() {
        return "mensaje";  //To change body of implemented methods use File | Settings | File Templates.
    }
}
