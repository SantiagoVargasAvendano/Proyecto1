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
    
    public ArrayList<Venta> cargar() throws FileNotFoundException{
        ArrayList<Venta> productos = new ArrayList<>();
        Scanner leer = new Scanner(new File(this.ruta));
        while(leer.hasNext()){
            String nombreProducto = leer.next();
            String retail = leer.next();
            int codVenta = leer.nextInt();
            float precio = leer.nextFloat();
            String distriCenter = leer.next();
            int diaLlegada = leer.nextInt();
            int mesLlegada = leer.nextInt();
            int annioLlegada = leer.nextInt();
            Fecha fechallegada = new Fecha(diaLlegada, mesLlegada, annioLlegada);
            int diaSalida = leer.nextInt();
            int mesSalidaa = leer.nextInt();
            int annioSalida = leer.nextInt();
            Fecha fechaSalida = new Fecha(diaSalida, mesSalidaa, annioLlegada);
            String Manufacturer = leer.next();
            int diaLlegada1 = leer.nextInt();
            int mesLlegada1 = leer.nextInt();
            int annioLlegada1 = leer.nextInt();
            Fecha fechallegada1 = new Fecha(diaLlegada1, mesLlegada1, annioLlegada1);
            int diaSalida1 = leer.nextInt();
            int mesSalidaa1 = leer.nextInt();
            int annioSalida1 = leer.nextInt();
            Fecha fechaSalida1 = new Fecha(diaSalida1, mesSalidaa1, annioLlegada1);
            int numLote = leer.nextInt();
            ArrayList<MateriaPrima> materiasPrimas = new ArrayList<>();
            while (!leer.hasNext(";")){
                String Farmer = leer.next();
                String nombreMater = leer.next();
                int diaLlegada2 = leer.nextInt();
                int mesLlegada2 = leer.nextInt();
                int annioLlegada2 = leer.nextInt();
                Fecha fechallegada2 = new Fecha(diaLlegada2, mesLlegada2, annioLlegada2);
                int diaSalida2 = leer.nextInt();
                int mesSalidaa2 = leer.nextInt();
                int annioSalida2 = leer.nextInt();
                Fecha fechaSalida2 = new Fecha(diaSalida2, mesSalidaa2, annioLlegada2);
                MateriaPrima materiaPrima = new MateriaPrima(nombreMater, Manufacturer, fechallegada2, fechaSalida2, Farmer);
                materiasPrimas.add(materiaPrima);
            }
            Producido productoProducido = new Producido(materiasPrimas, nombreProducto, Manufacturer, fechallegada1, fechaSalida1, numLote);
            Distribuido productoDistribuido = new Distribuido(productoProducido, nombreProducto, retail, fechallegada, fechaSalida);
            Venta venta = new Venta(precio, codVenta, productoDistribuido);
            productos.add(venta);
        }
        return productos;
    }
}
