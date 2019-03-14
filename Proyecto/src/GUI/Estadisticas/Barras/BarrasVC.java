/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Estadisticas.Barras;

import GUI.Singleton;
import ModeloNegocio.GestorPlataforma;
import java.io.FileNotFoundException;

/**
 *
 * @author Asus
 */
public class BarrasVC {
    private Barras vista;
    private GestorPlataforma gestor;

    public BarrasVC(GestorPlataforma gestor, int h, int m) throws FileNotFoundException {
        this.gestor = gestor;
        this.vista = new Barras(h,m);
    }
    
    
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        vista.mostrar(singleton.getStage());
    }
}
