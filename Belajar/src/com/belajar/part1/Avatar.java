/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.part1;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author saddam
 */
@Entity
@Table(name = "avatar")
public class Avatar implements Serializable {
    private int id;
    private byte[] image;
    @Id
    @GeneratedValue
    @Column(name = "avatar_id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "image", columnDefinition = "mediumblob")
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
    
    
}
