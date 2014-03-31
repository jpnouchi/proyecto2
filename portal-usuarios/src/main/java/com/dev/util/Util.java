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
        if(!flag){
            input=classloader.getResourceAsStream("images/female.jpg");
        }else{
            input=classloader.getResourceAsStream("images/male.jpg");

        }

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
}
