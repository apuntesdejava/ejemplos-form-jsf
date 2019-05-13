/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apuntesdejava.jakarta.jsf.demo.view.converter;

import com.apuntesdejava.jakarta.jsf.demo.types.Sex;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author USER
 */
@FacesConverter("com.apuntesdejava.SexConverter")
public class SexConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
        if (arg2 == null) {
            return null;
        }
        return Sex.valueOf(arg2);
    }

    @Override
    public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
        if (arg2 == null) {
            return null;
        }
        return arg2.toString();
    }

}
