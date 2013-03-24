/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.part2;


import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author saddam
 */
public class CobaMapping {
    
    public static void main(String[]args){
        //membuat object AnnotationConfiguration
        AnnotationConfiguration config = new AnnotationConfiguration();
        //Mapping class kedalam hibernate
        config.addAnnotatedClass(ContohMappingObject.class);
        //konfigurasi melalui file hibernate.cfg.xml
        config.configure();
        //Expor class kedalam database schema
        new SchemaExport(config).create(true, true);
        
    }
    
}
