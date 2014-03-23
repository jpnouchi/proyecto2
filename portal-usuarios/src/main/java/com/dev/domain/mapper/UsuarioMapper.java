package com.dev.domain.mapper;

import com.dev.domain.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Yesmin
 * Date: 22/03/14
 * Time: 10:39 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface UsuarioMapper {

    public List<Usuario> getAll();
}
