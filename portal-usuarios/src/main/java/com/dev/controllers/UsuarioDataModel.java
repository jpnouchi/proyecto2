package com.dev.controllers;

import com.dev.domain.model.Usuario;
import org.primefaces.model.SelectableDataModel;

import javax.faces.model.ListDataModel;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jpnouchi
 * Date: 27/03/14
 * Time: 23:45
 * To change this template use File | Settings | File Templates.
 */
public class UsuarioDataModel  extends ListDataModel<Usuario> implements SelectableDataModel<Usuario> {

    public UsuarioDataModel() {
    }

    public UsuarioDataModel(List<Usuario> list) {
        super(list);
    }

    @Override
    public Object getRowKey(Usuario usuario) {
        return usuario.getIdUsuario();
    }

    @Override
    public Usuario getRowData(String rowKey) {
        List<Usuario> usuarioList = (List<Usuario>) getWrappedData();

        for(Usuario usuario : usuarioList) {
            if(usuario.getIdUsuario()==(Integer.parseInt(rowKey)))
                return usuario;
        }

        return null;
    }

}
