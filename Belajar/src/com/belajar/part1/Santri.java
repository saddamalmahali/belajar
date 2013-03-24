/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.part1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



/**
 *
 * @author saddam
 */
@Entity
@Table(name = "santri")
public class Santri {
    
    @Id
    private int idSantri;
    private String namaSantri;

    public int getIdSantri() {
        return idSantri;
    }

    public void setIdSantri(int idSantri) {
        this.idSantri = idSantri;
    }

    public String getNamaSantri() {
        return namaSantri;
    }

    public void setNamaSantri(String namaSantri) {
        this.namaSantri = namaSantri;
    }    
}
