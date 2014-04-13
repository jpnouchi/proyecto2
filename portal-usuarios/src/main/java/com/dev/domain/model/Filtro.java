package com.dev.domain.model;

import org.apache.commons.lang.StringUtils;
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
    private String apellidoPaterno;
    private String apellidoMaterno;

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String addLike(String str){
        if(StringUtils.isNotBlank(str)){
               return "%"+str+"%";
        }else{
            return "";
        }
    }
}
