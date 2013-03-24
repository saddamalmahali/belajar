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
public class TestOneToMany {
    public static void main(String[]args){
        AnnotationConfiguration config = new AnnotationConfiguration();
        config.addAnnotatedClass(College.class);        
        config.addAnnotatedClass(Student.class);
        
        config.configure("hibernate.cfg.xml");
        
        new SchemaExport(config).create(true, true);
        
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.getCurrentSession();
        
        session.beginTransaction();
        
        College college = new College();
        college.setCollegeName("Annajaat");
        
        Student st1 = new Student();
        st1.setStudentName("Asep");
        Student st2 = new Student();
        st2.setStudentName("Hamid");
        
        st1.setCollege(college);
        st2.setCollege(college);
        
        session.save(college);
        session.save(st1);
        session.save(st2);
        
        session.getTransaction().commit();
                
    }
}
