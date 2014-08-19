package com.dev.domain.mapper;

import com.dev.domain.model.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Yesmin
 * Date: 22/03/14
 * Time: 10:39 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface UsuarioMapper {

    public List<Usuario> getAll();
    public List<Usuario> getUsuario(Filtro filtro);
    public UsuarioDetalle getUsuarioDetalle(int idUsuario);
    public Usuario getUsuarioInformacion(int idUsuario);
    public List<Documento> getUsuarioDocumentos(int idUsuario);
    public List<Ubigeo> getUsuarioUbigeo(int idUsuario);
    public List<Referencia> getUsuarioReferencias(int idUsuario);
    public List<Datos> getUsuarioDatos(int idUsuario);
    public User getUser(User user);
    public void updateUser(User user);
    public void deleteUser(User user);
    public void addUser(User user);
    public List<User> findUser(User user);
    public void addHistorial(Historial historial);

    public List<Historial> findHistorial(Filtro filtro);


}
