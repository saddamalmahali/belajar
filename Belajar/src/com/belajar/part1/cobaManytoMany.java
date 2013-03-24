/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.part1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


/**
 *
 * @author saddam
 */
import org.hibernate.tool.hbm2ddl.SchemaExport;
public class cobaManytoMany {
    public static void main(String[]args){
        AnnotationConfiguration config = new AnnotationConfiguration();
        
        config.addAnnotatedClass(Delegate.class);        
        config.addAnnotatedClass(Event.class);
        
        config.configure("hibernate.cfg.xml");
        
        new SchemaExport(config).create(true, true);
        
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        
        session.beginTransaction();
        
        Delegate delegate1 = new Delegate();
        delegate1.setDelegateName("Saddam Almahali");
        Delegate delegate2 = new Delegate();
        delegate2.setDelegateName("Yuda Eka");
        Delegate delegate3 = new Delegate();
        delegate3.setDelegateName("Iqbal M Hikmat");
        Delegate delegate4 = new Delegate();
        delegate4.setDelegateName("M Rikza Nasrulloh");
        
        Event belajarJava = new Event();
        belajarJava.setEventName("Java - 101");
        Event belajarPHP = new Event();
        belajarPHP.setEventName("PHP - 101");
        Event belajarJavaScript = new Event();
        belajarJavaScript.setEventName("JavaScript - 101");
        Event belajarPhotoshop = new Event();
        belajarPhotoshop.setEventName("Photoshop - 101");
        
        delegate1.getEvents().add(belajarPHP);
        delegate2.getEvents().add(belajarJava);
        delegate3.getEvents().add(belajarPHP);
        delegate2.getEvents().add(belajarJavaScript);
        
        session.save(delegate1);
        session.save(delegate2);
        session.save(delegate3);
        session.save(delegate4);
        session.save(belajarJava);
        session.save(belajarJavaScript);
        session.save(belajarPHP);
        session.save(belajarPhotoshop);
        
        
        session.getTransaction().commit();                
        
    }
}
