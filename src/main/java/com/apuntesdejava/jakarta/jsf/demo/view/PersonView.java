package com.apuntesdejava.jakarta.jsf.demo.view;

import com.apuntesdejava.jakarta.jsf.demo.form.Language;
import com.apuntesdejava.jakarta.jsf.demo.form.PersonForm;
import java.util.Arrays;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author USER
 */
@Named(value = "personView")
@RequestScoped
public class PersonView {

    private final static Language[] LANGUAGES = {
        new Language("ES", "Español"),
        new Language("EN", "Inglés")
    };

    private PersonForm form = new PersonForm();

    /**
     * Creates a new instance of PersonView
     */
    public PersonView() {
    }

    public PersonForm getForm() {
        return form;
    }

    public void setForm(PersonForm form) {
        this.form = form;
    }

    public String save() {
        return "/success";
    }

    public List<Language> getLanguages() {
        return Arrays.asList(LANGUAGES);
    }

}
