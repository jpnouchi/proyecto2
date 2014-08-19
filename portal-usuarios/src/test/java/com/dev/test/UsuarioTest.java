package com.dev.test;

import com.dev.domain.mapper.UsuarioMapper;
import com.dev.domain.model.Filtro;
import com.dev.domain.model.Historial;
import com.dev.domain.model.Usuario;
import com.dev.domain.model.UsuarioDetalle;
import com.dev.services.ServiceHistorial;
import com.dev.services.ServiceUsuario;
import com.dev.util.Util;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.InputStream;
import java.util.Date;
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

    @Autowired
    private ServiceUsuario serviceUsuarioImpl;

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
        InputStream input =classloader.getResourceAsStream("portal/female.jpg");
        System.out.println(input);
        System.out.println(path);
        System.out.println(path2);

        int asd = (int)(Math.random()*10);
        int aaa= asd%2;
        System.out.println("asd "+asd);
        System.out.println("aaa "+aaa);

        //File file = new File()

    }

    @Test
    public void getUsuarioInformacion(){

        Usuario usuario=serviceUsuarioImpl.getUsuarioInformacion(1);
        System.out.println(usuario);

    }

    @Autowired
    private ServiceHistorial serviceHistorialImpl;
    @Test
    public void getListHistorial(){
        List<Historial>  historialList=null;
        Filtro filtrohis=new Filtro();
        Date init=Util.parseDate("2014-08-03 00:00:00");
        Date end=Util.parseDate("2014-08-15 23:59:59");
        filtrohis.setFechaInicio(init);
        //filtrohis.setFechaFin(end);
        filtrohis.setFechaFin(end);
        historialList=serviceHistorialImpl.findHistorial(filtrohis);
        if(historialList!=null){
            System.out.println(historialList.size());
        }
    }
}
