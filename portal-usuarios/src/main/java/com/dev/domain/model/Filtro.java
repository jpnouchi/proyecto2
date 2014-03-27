package com.dev.domain.model;

import org.apache.ibatis.type.Alias;

/**
 * Created with IntelliJ IDEA.
 * User: jpnouchi
 * Date: 27/03/14
 * Time: 06:01
 * To change this template use File | Settings | File Templates.
 */
@Alias("filtro")
public class Filtro extends BaseObject{
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
