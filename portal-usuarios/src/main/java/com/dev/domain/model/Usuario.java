package com.dev.domain.model;

import org.apache.ibatis.type.Alias;

/**
 * Created with IntelliJ IDEA.
 * User: ADM
 * Date: 23/03/14
 * Time: 09:52 AM
 * To change this template use File | Settings | File Templates.
 */
@Alias("usuario")
public class Usuario extends BaseObject {
    private int idUsuario;
    private String nombres;
    private String apellidoMaterno;
    private String apellidoPaterno;
    private boolean sexo; // 0 F 1 M

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }


}
