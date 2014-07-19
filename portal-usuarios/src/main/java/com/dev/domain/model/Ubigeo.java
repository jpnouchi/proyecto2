package com.dev.domain.model;

import org.apache.ibatis.type.Alias;

/**
 * Created with IntelliJ IDEA.
 * User: jpnouchi
 * Date: 14/07/14
 * Time: 04:52
 * To change this template use File | Settings | File Templates.
 */
@Alias("ubigeo")
public class Ubigeo extends BaseObject{

    private int idUbigeo ;
    private String tipoInstalacion;
    private String direccion;
    private String localidad;

    public int getIdUbigeo() {
        return idUbigeo;
    }

    public void setIdUbigeo(int idUbigeo) {
        this.idUbigeo = idUbigeo;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
}
