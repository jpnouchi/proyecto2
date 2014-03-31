package com.dev.controllers;

import com.dev.domain.model.Filtro;
import com.dev.domain.model.Usuario;
import com.dev.domain.model.UsuarioDetalle;
import com.dev.services.ServiceUsuario;
import com.dev.services.UserBo;
import com.dev.util.Util;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import org.primefaces.model.StreamedContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ADM
 * Date: 22/03/14
 * Time: 10:20 AM
 * To change this template use File | Settings | File Templates.
 */

@Component
@Scope("session")
public class UserController  implements Serializable{

    @Autowired
    private ServiceUsuario serviceUsuarioImpl;

    private String nameUser;

    private List<Usuario> usuarioList;

    private int idUsuario;

    Usuario usuario;

    UsuarioDetalle usuarioDetalle;

    private StreamedContent image;

    private UsuarioDataModel mediumUsuariosModel;

    public StreamedContent getImage() {
        return image;
    }

    public void setImage(StreamedContent image) {
        this.image = image;
    }

    public UsuarioDataModel getMediumUsuariosModel() {
        return mediumUsuariosModel;
    }

    public void setMediumUsuariosModel(UsuarioDataModel mediumUsuariosModel) {
        this.mediumUsuariosModel = mediumUsuariosModel;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public UserController() {
        this.usuario=new Usuario();

    }

    @PostConstruct
    public void init(){
        System.out.println("init");
        this.usuarioList=serviceUsuarioImpl.getAll();
        this.mediumUsuariosModel = new UsuarioDataModel(usuarioList);

    }

    public UsuarioDetalle getUsuarioDetalle() {
        return usuarioDetalle;
    }

    public void setUsuarioDetalle(UsuarioDetalle usuarioDetalle) {
        this.usuarioDetalle = usuarioDetalle;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public void serchUser(){
        Filtro filtro = new Filtro();
        filtro.setNombre(filtro.addLike(getNameUser()));
        this.usuarioList=serviceUsuarioImpl.getUsuario(filtro);
        this.mediumUsuariosModel = new UsuarioDataModel(this.usuarioList);
    }

    public void serchUserDeatil(ActionEvent event){
        System.out.println(this.idUsuario);
        this.idUsuario = (Integer)event.getComponent().getAttributes().get("id");
        this.usuarioDetalle=serviceUsuarioImpl.getUsuarioDetalle(this.idUsuario);
    }

    public void onRowSelect(SelectEvent event) {
        FacesMessage msg = new FacesMessage("User Selected", ((Usuario) event.getObject()).getIdUsuario()+"");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        this.usuario=((Usuario) event.getObject());
        this.usuarioDetalle=serviceUsuarioImpl.getUsuarioDetalle(this.usuario.getIdUsuario());
        this.usuarioDetalle.setImagenInput(Util.getImage(this.usuario.isSexo()));
        System.out.println(this.usuarioDetalle);
    }

    public void onRowUnselect(UnselectEvent event) {
        FacesMessage msg = new FacesMessage("User Unselected", ((Usuario) event.getObject()).getIdUsuario()+"");

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }


}
