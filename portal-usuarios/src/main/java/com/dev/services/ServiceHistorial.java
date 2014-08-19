package com.dev.services;

import com.dev.domain.model.Filtro;
import com.dev.domain.model.Historial;
import com.dev.domain.model.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jpnouchi
 * Date: 15/08/14
 * Time: 06:56
 * To change this template use File | Settings | File Templates.
 */
public interface ServiceHistorial extends GenericService<Historial> {
    public List<Historial> findHistorial(Filtro filtro);
    public void addHistorial(Historial historial);


}
