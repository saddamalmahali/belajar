/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.part1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author saddam
 */
public class CobaAvatar {
    
    public static void main(String[]args){
        AnnotationConfiguration config = new AnnotationConfiguration();
        config.addAnnotatedClass(Avatar.class);
        
        config.configure("hibernate.cfg.xml");
        
//        new SchemaExport(config).create(true, true);
        
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.getCurrentSession();
        
        session.beginTransaction();
        
        Avatar avatar = new Avatar();
        File fileImage = new File("/home/saddam/Downloads/Edit_32.png");
        byte[] byteImage = new byte[(int) fileImage.length()];
        
        FileInputStream fis;
        try {
            fis = new FileInputStream(fileImage);
             fis.read(byteImage);
             fis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CobaAvatar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CobaAvatar.class.getName()).log(Level.SEVERE, null, ex);
        }       
        
        avatar.setImage(byteImage);
        session.save(avatar);
        session.getTransaction().commit();
        
    }
    
}
