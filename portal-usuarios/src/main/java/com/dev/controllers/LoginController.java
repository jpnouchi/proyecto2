package com.dev.controllers;

import com.dev.domain.model.Historial;
import com.dev.domain.model.User;
import com.dev.services.ServiceHistorial;
import com.dev.services.ServiceUser;
import com.dev.util.Util;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.Date;

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

    private boolean admin;

    private User user;
    private StreamedContent image1;
    private StreamedContent image2;

    {
        this.setImage1(new DefaultStreamedContent(Util.loadImage("resources/images/logo1.jpg")));
        this.setImage2(new DefaultStreamedContent(Util.loadImage("resources/images/logo2.jpg")));

    }

    public LoginController() {


    }

    public StreamedContent getImage2() {
        return image2;
    }

    public void setImage2(StreamedContent image2) {
        this.image2 = image2;
    }

    public StreamedContent getImage1() {
        return image1;
    }

    public void setImage1(StreamedContent image1) {
        this.image1 = image1;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Autowired
    private ServiceUser serviceUserImpl;

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

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

    public boolean validateLogin(){
        User userLogin =new User();
        userLogin.setUserName(getUsername());
        userLogin.setPassword(getPassword());

        user=serviceUserImpl.getUser(userLogin);

        return (user!=null)?true:false;

    }

    @Autowired
    private ServiceHistorial serviceHistorialImpl;

    public String login()
    {

        //if( StringUtils.isNotBlank(getUsername()) && "test".equals(getPassword()))
        if(validateLogin())
        {
            admin = (user.getRol()==1)?true:false;
            //admin=(("admin".equalsIgnoreCase(getUsername())?true:false));
            HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
            String ipAddress = request.getHeader("X-Forwarded-For");
            if (ipAddress == null) {
                ipAddress = request.getRemoteAddr();
            }
            Historial historial=new Historial();
            historial.setFecha(new Date());
            historial.setIduser(user.getIdUser());
            historial.setName(user.getUserName());
            historial.setIpAddress(ipAddress);
            serviceHistorialImpl.addHistorial(historial);
            return "home?faces-redirect=true";

        }else{

//            FacesContext context = FacesContext.getCurrentInstance();
//            context.addMessage("username", new FacesMessage("Invalid UserName and Password"));
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"", "Usuario y Contraseña invalidos"));

            return "login";

        }

    }

}
