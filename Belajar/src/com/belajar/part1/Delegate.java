/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.part1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author saddam
 */
@Entity
public class Delegate{
    
    
    private int delegateId;
    private String delegateName;
    
    Collection<Event> events = new ArrayList<Event>();
    
    @Id
    @GeneratedValue
    public int getDelegateId() {
        return delegateId;
    }
    
    public void setDelegateId(int delegateId) {
        this.delegateId = delegateId;
    }

    public String getDelegateName() {
        return delegateName;
    }

    public void setDelegateName(String delegateName) {
        this.delegateName = delegateName;
    }
    
    
    @ManyToMany
            @JoinTable(name = "JOIN_DELEGATE_EVENT", joinColumns = {
        @JoinColumn(name = "delegateId")}, inverseJoinColumns = {
            @JoinColumn(name = "eventId")
        })
    public Collection<Event> getEvents() {
        return events;
    }

    public void setEvents(Collection<Event> events) {
        this.events = events;
    }
    
    
}
