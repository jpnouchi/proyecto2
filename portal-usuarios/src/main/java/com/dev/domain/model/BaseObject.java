package com.dev.domain.model;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: ADM
 * Date: 23/03/14
 * Time: 08:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class BaseObject implements Serializable{

    public String toString(){
        return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
