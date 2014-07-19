package com.dev.domain.model;

import org.apache.ibatis.type.Alias;

import java.util.Date;
import java.util.List;

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

    private String   estadoCivil;
    private Date fechaNacimiento;
    private String   estadoLegal;
    private String   hijoDe;
    private String   pais;
    private String   lugarNacimiento;
    private String   nacionalidad;

    private List<Documento> documentoList;
    private List<Ubigeo> ubigeoList;
    private List<Referencia> referenciaList;

    private String nombreInfo;
    private List<Datos> datosList;

    public List<Datos> getDatosList() {
        return datosList;
    }

    public void setDatosList(List<Datos> datosList) {
        this.datosList = datosList;
    }

    public List<Documento> getDocumentoList() {
        return documentoList;
    }

    public void setDocumentoList(List<Documento> documentoList) {
        this.documentoList = documentoList;
    }

    public List<Ubigeo> getUbigeoList() {
        return ubigeoList;
    }

    public void setUbigeoList(List<Ubigeo> ubigeoList) {
        this.ubigeoList = ubigeoList;
    }

    public List<Referencia> getReferenciaList() {
        return referenciaList;
    }

    public void setReferenciaList(List<Referencia> referenciaList) {
        this.referenciaList = referenciaList;
    }

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


    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstadoLegal() {
        return estadoLegal;
    }

    public void setEstadoLegal(String estadoLegal) {
        this.estadoLegal = estadoLegal;
    }

    public String getHijoDe() {
        return hijoDe;
    }

    public void setHijoDe(String hijoDe) {
        this.hijoDe = hijoDe;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombreInfo() {
        return nombreInfo;
    }

    public void setNombreInfo(String nombreInfo) {
        this.nombreInfo = apellidoPaterno +" "+apellidoMaterno+" ,"+nombres;
    }
}
