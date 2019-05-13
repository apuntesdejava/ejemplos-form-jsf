package com.apuntesdejava.jakarta.jsf.demo.form;

/**
 *
 * @author USER
 */
public class Language {
    private String code;
    private String language;

    public Language() {
    }

    public Language(String code, String language) {
        this.code = code;
        this.language = language;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
    
}
