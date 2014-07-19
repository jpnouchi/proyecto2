package com.dev.domain.model;

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: jpnouchi
 * Date: 14/07/14
 * Time: 04:58
 * To change this template use File | Settings | File Templates.
 */
@Alias("referencia")
public class Referencia extends BaseObject{

    private int idReferencia;
    private String documento;
    private String numero;
    private Date fecha;
    private String lugarHecho;
    private String contenido;

    public int getIdReferencia() {
        return idReferencia;
    }

    public void setIdReferencia(int idReferencia) {
        this.idReferencia = idReferencia;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugarHecho() {
        return lugarHecho;
    }

    public void setLugarHecho(String lugarHecho) {
        this.lugarHecho = lugarHecho;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
