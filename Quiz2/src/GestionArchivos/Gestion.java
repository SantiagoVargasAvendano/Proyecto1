/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionArchivos;
import Proceso.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Gestion {
    private String ruta;

    public Gestion(String ruta) {
        this.ruta = ruta;
    }
       
    public String fechaToString(Fecha fecha){
        String Fecha1 = (fecha.getDia()+" "+fecha.getMes()+" "+fecha.getAnnio());
        return Fecha1;
    }
    
    public ArrayList<String> trazaProducto(Venta producto){
        ArrayList<String> traza = new ArrayList<>();
        String nomProdu = producto.getProductoDistribuido().getNombre();
        traza.add(nomProdu);
        String retail = producto.getProductoDistribuido().getDestino();
        traza.add(retail);
        String codVenta = String.valueOf(producto.getCodVenta());
        traza.add(codVenta);
        String precio = String.valueOf(producto.getPrecio());
        traza.add(precio);
        String DistributionCen = producto.getProductoDistribuido().getProductoProducido().getDestino();
        traza.add(DistributionCen);
        String fechaLLega = fechaToString(producto.getProductoDistribuido().getFechaLlegada());
        traza.add(fechaLLega);
        String fechaSali = fechaToString(producto.getProductoDistribuido().getFechaSalida());
        traza.add(fechaSali);
        String Manufacturer = producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().get(0).getDestino();
        traza.add(Manufacturer);
        String fechaLLega1 = fechaToString(producto.getProductoDistribuido().getProductoProducido().getFechaLlegada());
        traza.add(fechaLLega1);
        String fechaSali1 = fechaToString(producto.getProductoDistribuido().getProductoProducido().getFechaSalida());
        traza.add(fechaSali1);
        String numLote = String.valueOf(producto.getProductoDistribuido().getProductoProducido().getNumLote());
        traza.add(numLote);
        for(int i=0;i<producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().size();i++){
            String Farmer = producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().get(i).getGranja();
            traza.add(Farmer);
            String nombre1 = producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().get(i).getNombre();
            traza.add(nombre1);
            String destino1 = producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().get(i).getDestino();
            traza.add(destino1);
            String fechaLLega2 = fechaToString(producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().get(i).getFechaLlegada());
            traza.add(fechaLLega2);
            String fechaSali2 = fechaToString(producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().get(i).getFechaSalida());
            traza.add(fechaSali2);
        }
        traza.add(";");
        return traza;
    }
    
    public boolean guardar(ArrayList<Venta> productos) throws IOException{
        File archivo = new File(this.ruta);
        if(!archivo.exists())
            archivo.createNewFile();
        PrintStream salida = new PrintStream(archivo);
        for(Venta producto: productos){
            ArrayList<String> traza = trazaProducto(producto);
            for(int i=0;i<traza.size();i++){
                salida.println(traza.get(i));
                salida.print(" ");
            }
            salida.print("\n");
        }
        salida.flush();
        salida.close();
        return true;
    }
}
