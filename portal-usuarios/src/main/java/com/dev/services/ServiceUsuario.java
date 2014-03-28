package com.dev.services;

import com.dev.domain.model.Filtro;
import com.dev.domain.model.Usuario;
import com.dev.domain.model.UsuarioDetalle;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Yesmin
 * Date: 22/03/14
 * Time: 11:02 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ServiceUsuario extends GenericService<Usuario> {
    public List<Usuario> getUsuario(Filtro filtro);
    public UsuarioDetalle getUsuarioDetalle(int idUsuario);

}
