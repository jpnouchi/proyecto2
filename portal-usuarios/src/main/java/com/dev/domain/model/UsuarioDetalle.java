package com.dev.domain.model;

import com.mysql.jdbc.Blob;
import org.apache.ibatis.type.Alias;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: jpnouchi
 * Date: 27/03/14
 * Time: 06:08
 * To change this template use File | Settings | File Templates.
 */
@Alias("usuarioDetalle")
public class UsuarioDetalle extends BaseObject {

    private int idUsuarioDetalle;
    private int idUsuario;
    private String correo;
    private byte[] imagen;
    private Blob imagenBlob;

    public int getIdUsuarioDetalle() {
        return idUsuarioDetalle;
    }

    public void setIdUsuarioDetalle(int idUsuarioDetalle) {
        this.idUsuarioDetalle = idUsuarioDetalle;
    }

    public Blob getImagenBlob() {
        return imagenBlob;
    }

    public void setImagenBlob(Blob imagenBlob) {
        this.imagenBlob = imagenBlob;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
}
