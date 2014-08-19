package com.dev.domain.model;

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: jpnouchi
 * Date: 15/08/14
 * Time: 06:25
 * To change this template use File | Settings | File Templates.
 */
@Alias("historial")
public class Historial extends BaseObject{

    private int idHistorial;
    private int iduser;
    private String name;
    private Date fecha;
    private String ipAddress;


    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
