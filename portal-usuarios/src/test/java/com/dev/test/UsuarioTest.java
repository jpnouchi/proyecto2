package com.dev.test;

import com.dev.domain.mapper.UsuarioMapper;
import com.dev.domain.model.Filtro;
import com.dev.domain.model.Usuario;
import com.dev.domain.model.UsuarioDetalle;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jpnouchi
 * Date: 27/03/14
 * Time: 05:29
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:applicationContext.xml"})
public class UsuarioTest {

    @Autowired
    private UsuarioMapper usuarioMapper;

    @Test
    public void getAll(){
        List<Usuario> controlList= usuarioMapper.getAll();
        Assert.assertNotNull(controlList);
        //Assert.assertEquals(1, controlList.size());
        System.out.println("testControl");
    }

    @Test
    public void getUsuario(){
        Filtro filtro= new Filtro();
        filtro.setNombre("%j%");

        List<Usuario> usuarioList= usuarioMapper.getUsuario(filtro);
        System.out.println(usuarioList);
        Assert.assertNotNull(usuarioList);
        //Assert.assertEquals(1, controlList.size());
    }

    @Test
    public void getUsuarioDetalle(){
        UsuarioDetalle usuarioDetalle = usuarioMapper.getUsuarioDetalle(1);
        System.out.println(usuarioDetalle);
        Assert.assertNotNull(usuarioDetalle);
        //Assert.assertEquals(1, controlList.size());
    }

    @Test
    public void loadImagen(){
        String path=System.getProperty("user.home");
        String path2=System.getProperty("java.class.path");

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream input =classloader.getResourceAsStream("images/female.jpg");
        System.out.println(input);
        System.out.println(path);
        System.out.println(path2);
        //File file = new File()

    }
}
