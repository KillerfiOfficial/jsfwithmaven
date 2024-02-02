/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsfwithmaven;

import java.util.Date;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.springframework.beans.factory.annotation.Autowired;

@ManagedBean(name = "user")
@RequestScoped
public class User {

    private static final Logger LOG = Logger.getLogger(User.class.getName());

    private String nome;
    private String nome2;
    private Date dataDiNascita;

    public SomeOtherSpringBean getSomeOtherBean() {
        return someOtherBean;
    }

    public void setSomeOtherBean(SomeOtherSpringBean someOtherBean) {
        this.someOtherBean = someOtherBean;
    }
    @Autowired
    private SomeOtherSpringBean someOtherBean;

    public User() {
        this.someOtherBean = new SomeOtherSpringBean();
    }

    public Date getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(Date dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void doSomething() {
        if (someOtherBean != null) {
            someOtherBean.doSomethingElse();
        } else {
            LOG.info("someOtherBean è nullo!");
        }
    }

}
