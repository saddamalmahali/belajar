/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.part2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author saddam
 */
@Entity
public class ContohMapping {
    @Id
    @GeneratedValue
    private int id;    
    private String namaUser;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaUser() {
        return namaUser;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }
    
    
    
}
