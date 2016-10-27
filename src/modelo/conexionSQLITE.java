/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;



/**
 *
 * @author fer
 */
public class conexionSQLITE {
  
  Connection cn;
  String db="C:\\bar.db"; //ruta donde se crea la bd
 
  //http://www.jc-mouse.net/base-de-datos/sqlitejava-conexion salen consultas sqlite
  
  
  public conexionSQLITE() {
   
    try {
     Class.forName("org.sqlite.JDBC");
     cn = DriverManager.getConnection("jdbc:sqlite" + this.db);
       System.out.println("conectado a la bd sqlite" + this.db);
       
       
    }catch(Exception e) {
       System.out.println(e);
    }   
      
  }
  
}
