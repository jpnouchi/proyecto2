package com.dev.util;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    public static InputStream loadImage(String ruta){

        ClassLoader classloader=null;
        classloader= Thread.currentThread().getContextClassLoader();
        InputStream input=null;
        input=classloader.getResourceAsStream(ruta);
        return input;
    }

    private static SimpleDateFormat formatDateTime =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static SimpleDateFormat formatDateInit =new SimpleDateFormat("yyyy-MM-dd 00:00:00");
    private static SimpleDateFormat formatDateEnd =new SimpleDateFormat("yyyy-MM-dd 23:59:59");
    private static SimpleDateFormat formatDate =new SimpleDateFormat("yyyy-MM-dd");


    public static Date formatDateTimeInit(Date date){
        Date dateInit=null;
        try {
            dateInit = formatDate.parse(formatDate.format(date)+" 00:00:00");
        } catch (ParseException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return dateInit;
    }

    public static Date formatDateTimeEnd(Date date  ){
        Date dateEnd=null;
        try {
            String fecha=formatDate.format(date);
            dateEnd = formatDateTime.parse(fecha+" 23:59:59");
        } catch (ParseException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return dateEnd;
    }

    public static String formatDate(Date date ){
        return formatDateTime.format(date);
    }

    public static Date parseDate(String source ){
           Date date=null;
        try {
            date=formatDateTime.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return date;
    }


}
