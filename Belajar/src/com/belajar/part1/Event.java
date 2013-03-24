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
public class Event{
    private int eventId;
    private String eventName;    
    private Collection<Delegate> delegates = new ArrayList<>();
    
    
    @Id
    @GeneratedValue
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }   
    
    @ManyToMany
    @JoinTable(name = "JOIN_DELEGATE_EVENT", joinColumns = {
        @JoinColumn(name = "eventId")}, inverseJoinColumns = {
            @JoinColumn(name = "delegateId")
        })
    public Collection<Delegate> getDelegates() {
        return delegates;
    }

    public void setDelegates(Collection<Delegate> delegates) {
        this.delegates = delegates;
    }
    
    
}
