package com.dev.domain.model;

import org.apache.ibatis.type.Alias;

/**
 * Created with IntelliJ IDEA.
 * User: jpnouchi
 * Date: 14/07/14
 * Time: 04:41
 * To change this template use File | Settings | File Templates.
 */
@Alias("documento")
public class Documento extends BaseObject{
    private int idUsuarioDocumento;
    private String tipo;
    private String numero;

    public int getIdUsuarioDocumento() {
        return idUsuarioDocumento;
    }

    public void setIdUsuarioDocumento(int idUsuarioDocumento) {
        this.idUsuarioDocumento = idUsuarioDocumento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
