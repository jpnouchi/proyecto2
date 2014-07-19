package com.dev.domain.model;

import org.apache.ibatis.type.Alias;

/**
 * Created with IntelliJ IDEA.
 * User: jpnouchi
 * Date: 14/07/14
 * Time: 06:55
 * To change this template use File | Settings | File Templates.
 */
@Alias("datos")
public class Datos extends BaseObject{

    private String  tipoDato;
    private int idDatosUsuario;
    private String apellidos ;
    private String nombres   ;

    public String getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(String tipoDato) {
        this.tipoDato = tipoDato;
    }

    public int getIdDatosUsuario() {
        return idDatosUsuario;
    }

    public void setIdDatosUsuario(int idDatosUsuario) {
        this.idDatosUsuario = idDatosUsuario;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
}
