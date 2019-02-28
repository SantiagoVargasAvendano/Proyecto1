/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import java.util.*;
import Proceso.*;
import GestionArchivos.*;
/**
 *
 * @author Asus
 */
public class Gui {
    
    public void traza1(Venta producto){
        Gestion t = new Gestion(" ");
        ArrayList<String> traza = t.trazaProducto(producto);
        for(int i=0;i<traza.size();i++){
            System.out.println(traza.get(i));
        }
    }
    
    public int menu(){
        Scanner lectura = new Scanner(System.in);
        System.out.println("1. Agregar eslabon\n 2. Manejar eslabon \n3. Comprar producto \n 4. Listar \n5. modificar");
        int opcion = lectura.nextInt();
        return opcion;
    }
}
