/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.part1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author saddam
 */
public class TestSantri {
    public static void main(String[]args){
        AnnotationConfiguration config = new AnnotationConfiguration();
        
        config.configure("hibernate.cfg.xml");
        
        //new SchemaExport(config).create(true, true);
        
        SessionFactory factory = config.buildSessionFactory();
        
        Session session = factory.openSession();
        
        Santri santri = new Santri();
        
        santri.setIdSantri(1);
        santri.setNamaSantri("Adam almahali");
        
        session.beginTransaction();       
        
        session.save(santri);
        
        session.getTransaction().commit();
    }
}
