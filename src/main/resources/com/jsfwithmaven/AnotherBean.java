/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsfwithmaven;

import javax.faces.bean.ManagedBean;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

/**
 *
 * @author 39351
 */
@Component
@ManagedBean(name = "anotherBean")
@RequestScope
public class AnotherBean {

    private int numero = 12;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public AnotherBean() {
        this.numero = numero;
    }

}
