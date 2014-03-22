package com.dev.controllers;

import com.dev.services.UserBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created with IntelliJ IDEA.
 * User: ADM
 * Date: 22/03/14
 * Time: 10:20 AM
 * To change this template use File | Settings | File Templates.
 */

@Component
@ManagedBean
@SessionScoped
public class UserController {

    @Autowired
    UserBo userBo;

    private String input;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public void setUserBo(UserBo userBo) {
        this.userBo = userBo;
    }

    public String printMsgFromSpring() {
        return userBo.getMessage();
    }

    public void procesarMensaje(){
        System.out.println("mi nombre es "+this.input);
    }
}
