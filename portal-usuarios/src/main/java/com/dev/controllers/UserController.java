package com.dev.controllers;

import com.dev.domain.model.Filtro;
import com.dev.domain.model.User;
import com.dev.domain.model.Usuario;
import com.dev.domain.model.UsuarioDetalle;
import com.dev.services.ServiceUser;
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
import javax.faces.bean.ManagedProperty;
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

    @Autowired
    private ServiceUser serviceUserImpl;

    private String nameUser;

    private String paternoUser;

    private String maternoUser;

    private List<Usuario> usuarioList;

    private int idUsuario;

    private  List<User> userList;

    @ManagedProperty(value="#{userLogin}")
    private User userLogin;

    private String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public User getUserAdd() {
        return userAdd;
    }

    public void setUserAdd(User userAdd) {
        this.userAdd = userAdd;
    }

    private User userAdd;

    private int idUser;

    private String username;

    Usuario usuario;

    Usuario usuarioInformacion;

    public User getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(User userLogin) {
        this.userLogin = userLogin;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }



    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Usuario getUsuarioInformacion() {
        return usuarioInformacion;
    }

    public void setUsuarioInformacion(Usuario usuarioInformacion) {
        this.usuarioInformacion = usuarioInformacion;
    }

    UsuarioDetalle usuarioDetalle;

    private StreamedContent image;

    private UsuarioDataModel mediumUsuariosModel;

    @ManagedProperty(value="#{selectedUser}")
    private Usuario selectedUser;


    public String getPaternoUser() {
        return paternoUser;
    }

    public void setPaternoUser(String paternoUser) {
        this.paternoUser = paternoUser;
    }

    public String getMaternoUser() {
        return maternoUser;
    }

    public void setMaternoUser(String maternoUser) {
        this.maternoUser = maternoUser;
    }

    public Usuario getSelectedUser() {
        return selectedUser;
    }

    public void setSelectedUser(Usuario selectedUser) {
        this.selectedUser = selectedUser;
        this.setUsuario(this.selectedUser);
        this.usuarioDetalle=serviceUsuarioImpl.getUsuarioDetalle(this.getUsuario().getIdUsuario());
        this.usuarioDetalle.setImagenInput(Util.getImage(this.getUsuario().isSexo()));
        System.out.println(this.usuarioDetalle);

    }

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
        this.usuarioList=new ArrayList<Usuario>();
        this.userAdd=new User();
        this.userLogin=new User();
        this.userList=new ArrayList<User>();
        mensaje="";

    }

    @PostConstruct
    public void init(){
        System.out.println("init");
        //this.usuarioList=serviceUsuarioImpl.getAll();
        //this.mediumUsuariosModel = new UsuarioDataModel(usuarioList);

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
        filtro.setApellidoPaterno(filtro.addLike(getPaternoUser()));
        filtro.setApellidoMaterno(filtro.addLike(getMaternoUser()));
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

    public void onListenerUserDetalle(ActionEvent event){
        System.out.println("event "+event);
    }

    public void onRowUnselect(UnselectEvent event) {
        FacesMessage msg = new FacesMessage("User Unselected", ((Usuario) event.getObject()).getIdUsuario()+"");

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    private int idUsuarioInfo;

    public int getIdUsuarioInfo() {
        return idUsuarioInfo;
    }

    public void setIdUsuarioInfo(int idUsuarioInfo) {
        this.idUsuarioInfo = idUsuarioInfo;
    }

    public String  viewDetail(){
        System.out.println(idUsuarioInfo);
        usuarioInformacion=serviceUsuarioImpl.getUsuarioInformacion(idUsuarioInfo);
        usuarioInformacion.setNombreInfo("");
        this.usuarioDetalle=serviceUsuarioImpl.getUsuarioDetalle(idUsuarioInfo);
        this.usuarioDetalle.setImagenInput(Util.getImage(usuarioInformacion.isSexo()));
        return "detail";
    }


    public void findUserLogin(){
        User userFind=new User();
        userFind.setUserName(getUsername());
        this.userList=serviceUserImpl.findUser(userFind);
    }
    public void addUserLogin(){

        serviceUserImpl.addUser(this.userAdd);

        clearAddUser();
        this.setMensaje("Usuario agregado");
    }

    public void clearAddUser(){
        this.userAdd.setUserName("");
        this.userAdd.setPassword("");
        this.userAdd.setRol(0);
    }

    public void updateUserLogin(){
        serviceUserImpl.updateUSer(this.userLogin);

    }


}
