/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloNegocio;

import com.healthmarketscience.jackcess.Column;
import com.healthmarketscience.jackcess.Database;
import com.healthmarketscience.jackcess.DatabaseBuilder;
import com.healthmarketscience.jackcess.Row;
import com.healthmarketscience.jackcess.Table;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class BaseDatos {
    private Database bd;
    
    
    public BaseDatos(String url) {
        try {
            this.bd = DatabaseBuilder.open(new File(url));
        } catch (IOException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Table getTabla(String nomTabla){
        Table tabla = null;
        try {
            tabla = bd.getTable(nomTabla);
        } catch (IOException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabla;
    }
    
    /*public static void main(String[] args) {
        try {
            //Datos
            Database db = DatabaseBuilder.open(new File("Contacts_Demo_V1.01.mdb"));
            Table table = db.getTable("lst_Salutations");
             for(Row row : table) {
                System.out.println(row.getString("Salutation"));
            }
                     
            //Metadatos 
            for(Column column : table.getColumns()) {
                String columnName = column.getName();
                System.out.println("Column " + columnName + "(" + column.getType() + ")");
            }
              
              
            
        } catch (IOException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }*/
}
