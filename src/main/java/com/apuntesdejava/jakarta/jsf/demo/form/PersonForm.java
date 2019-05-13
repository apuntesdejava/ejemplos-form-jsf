package com.apuntesdejava.jakarta.jsf.demo.form;

import com.apuntesdejava.jakarta.jsf.demo.types.Sex;
import java.time.LocalDate;
import java.util.Arrays;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

/**
 *
 * @author USER
 */
public class PersonForm {

    @NotBlank(message = "El campo nombre no puede estar en blanco")
    @NotNull
    private String name;

    @NotNull
    private Sex sex;

    @Email
    private String email;

    @PastOrPresent
    @NotNull
    private LocalDate birth;

    private boolean enabled;

    private String[] interests;
    private String[] aptitudes;
    private String language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    public String[] getAptitudes() {
        return aptitudes;
    }

    public void setAptitudes(String[] aptitudes) {
        this.aptitudes = aptitudes;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "PersonForm{" + "name=" + name + ", sex=" + sex + ", email=" + email + ", birth=" + birth + ", enabled=" + enabled + ", interests=" + Arrays.toString(interests) + ", aptitudes=" + Arrays.toString(aptitudes) + ", language=" + language + '}';
    }

    

   
 
    

}
