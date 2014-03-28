package com.dev.controllers;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: jpnouchi
 * Date: 27/03/14
 * Time: 13:57
 * To change this template use File | Settings | File Templates.
 */
@Component
@Scope("session")
public class LoginController  implements Serializable{

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login()
    {

        if( ("test".equalsIgnoreCase(getUsername()) && "test".equals(getPassword())))
        {
            return "home?faces-redirect=true";

        }else{

//            FacesContext context = FacesContext.getCurrentInstance();
//            context.addMessage("username", new FacesMessage("Invalid UserName and Password"));
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"", "Usuario y Contraseña invalidos"));

            return "login";

        }

    }

}
