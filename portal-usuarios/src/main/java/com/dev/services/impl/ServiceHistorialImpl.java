package com.dev.services.impl;

import com.dev.domain.mapper.UsuarioMapper;
import com.dev.domain.model.Filtro;
import com.dev.domain.model.Historial;
import com.dev.services.ServiceHistorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jpnouchi
 * Date: 15/08/14
 * Time: 06:56
 * To change this template use File | Settings | File Templates.
 */
@Service
public class ServiceHistorialImpl implements ServiceHistorial {

    @Autowired
    private UsuarioMapper usuarioMapper;

    @Override
    public Historial get(int id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Historial> getAll() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void save(Historial historial) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void update(Historial historial) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void delete(Historial historial) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Historial> findHistorial(Filtro filtro) {
        return usuarioMapper.findHistorial(filtro);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addHistorial(Historial historial) {
        //To change body of implemented methods use File | Settings | File Templates.
        usuarioMapper.addHistorial(historial);
    }
}
