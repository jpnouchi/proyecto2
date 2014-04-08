package com.dev.util;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: jpnouchi
 * Date: 31/03/14
 * Time: 02:06
 * To change this template use File | Settings | File Templates.
 */
public class Util {


    public static InputStream getImage(boolean flag){
        byte[] imagen = null ;
        File file = null;
        ClassLoader classloader=null;
        classloader= Thread.currentThread().getContextClassLoader();
        InputStream input=null;
        int random=Util.random();
        String ruta;
        if(flag){

            //input=classloader.getResourceAsStream("images/female.jpg");
            switch (random){
                case 0:
                    ruta="images/hombre1.jpg";
                    break;
                default:
                    ruta="images/hombre2.jpg";
                    break;
            }
        }else{
            //input=classloader.getResourceAsStream("images/male.jpg");

            switch (random){
                case 0:
                    ruta="images/mujer1.jpg";
                    break;
                default:
                    ruta="images/mujer2.jpg";
                    break;
            }
        }
        input=classloader.getResourceAsStream(ruta);
        return input;
    }

    public static byte[] toByte(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            int c = 0;
            while ((c = fis.read()) != -1) {
                baos.write(c);
            }
            byte[] byteReturn = baos.toByteArray();
            return byteReturn;
        } finally {
            fis.close();
            baos.close();
        }
    }

    public static int random(){

        return ((int)(Math.random()*10)%2);
    }
}
