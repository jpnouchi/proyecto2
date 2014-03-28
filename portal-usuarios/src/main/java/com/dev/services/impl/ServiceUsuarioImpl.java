package com.dev.services.impl;

import com.dev.domain.mapper.UsuarioMapper;
import com.dev.domain.model.Filtro;
import com.dev.domain.model.Usuario;
import com.dev.domain.model.UsuarioDetalle;
import com.dev.services.ServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Yesmin
 * Date: 22/03/14
 * Time: 11:03 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class ServiceUsuarioImpl implements ServiceUsuario {
    @Autowired
    private UsuarioMapper usuarioMapper;

    @Override
    public Usuario get(int id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Usuario> getAll() {
        return usuarioMapper.getAll();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void save(Usuario usuario) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void update(Usuario usuario) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void delete(Usuario usuario) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Usuario> getUsuario(Filtro filtro) {
        return usuarioMapper.getUsuario(filtro);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public UsuarioDetalle getUsuarioDetalle(int idUsuario) {
        return usuarioMapper.getUsuarioDetalle(idUsuario);  //To change body of implemented methods use File | Settings | File Templates.
    }
}
