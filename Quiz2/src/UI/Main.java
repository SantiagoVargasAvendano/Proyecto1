/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import GestionArchivos.Gestion;
import Proceso.*;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Main {
            
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ArrayList<Farmer> granjas = new ArrayList<>();
        ArrayList<Manufacturer> manufacturas = new ArrayList<>();
        ArrayList<DistributionCenter> distribuidoras = new ArrayList<>();
        ArrayList<Retail> tiendas = new ArrayList<>();
        System.out.println("1. Agregar eslabon\n 2. Agregar producto \n 3. Comprar producto");
        int opcion = lectura.nextInt();
        switch(opcion){
            case 1:
                int opcion2;
                do{
                    System.out.println("Ingresa el tipo de eslabon que quieres agregar\n 1. Agregar granja\n 2. Agregar centro de manufactura \n3. Agregar Centro de distribucion \n 4. Agregar tienda");
                    opcion2 = lectura.nextInt();
                    switch (opcion2) {
                        case 1:
                            System.out.println("Ingrese el nombre de la granja: ");
                            String nombre = lectura.next();
                            System.out.println("Ingrese la descripcion de la granja: ");
                            String descrip = lectura.next();
                            System.out.println("Ingrese la latitud de la granja: ");
                            int latitud = lectura.nextInt();
                            System.out.println("Ingrese la longitud de la granja: ");
                            int longitud = lectura.nextInt();
                            Farmer granja = new Farmer(nombre, descrip, latitud, longitud);
                            granjas.add(granja);
                            break;
                        case 2:
                            System.out.println("Ingrese el nombre del centro de manufactura: ");
                            String nombre1 = lectura.next();
                            System.out.println("Ingrese la descripcion del centro de manufactura: ");
                            String descrip1 = lectura.next();
                            System.out.println("Ingrese la latitud del centro de manufactura: ");
                            int latitud1 = lectura.nextInt();
                            System.out.println("Ingrese la longitud del centro de manufactura: ");
                            int longitud1 = lectura.nextInt();
                            Manufacturer manufactura = new Manufacturer(nombre1, descrip1, latitud1, longitud1);
                            manufacturas.add(manufactura);
                            break;
                        case 3:
                            System.out.println("Ingrese el nombre del centro de distribucion: ");
                            String nombre2 = lectura.next();
                            System.out.println("Ingrese la descripcion del centro de distribucion: ");
                            String descrip2 = lectura.next();
                            System.out.println("Ingrese la latitud del centro de distribucion: ");
                            int latitud2 = lectura.nextInt();
                            System.out.println("Ingrese la longitud del centro de distribucion: ");
                            int longitud2 = lectura.nextInt();
                            DistributionCenter distribucion = new DistributionCenter(nombre2, descrip2, latitud2, longitud2);
                            distribuidoras.add(distribucion);
                            break;
                        case 4:
                            System.out.println("Ingrese el nombre de la tienda: ");
                            String nombre3 = lectura.next();
                            System.out.println("Ingrese la descripcion de la tienda: ");
                            String descrip3 = lectura.next();
                            System.out.println("Ingrese la latitud de la tienda: ");
                            int latitud3 = lectura.nextInt();
                            System.out.println("Ingrese la longitud de la tienda: ");
                            int longitud3 = lectura.nextInt();
                            Retail tienda = new Retail(nombre3, descrip3, latitud3, longitud3);
                            tiendas.add(tienda);
                            break;
                    }
                } while (opcion2 >0 && opcion2 < 5);
                break;
            case 2:
                int opcion3;
                do{
                    System.out.println("Ingresa el tipo de eslabon al cual quiere agregar un producto\n 1. Agregar granja\n 2. Agregar centro de manufactura \n3. Agregar Centro de distribucion \n 4. Agregar tienda");
                    opcion3 = lectura.nextInt();
                    switch (opcion3) {
                        case 1:
                            System.out.println("Ingrese el nombre de la granja a la cual desea agregarle materia prima");
                            String nombre = lectura.next();
                            System.out.println("Ingrese el nombre del producto: ");
                            String nombreProdu = lectura.next();
                            System.out.println("Ingrese el destino del producto: ");
                            String destino = lectura.next();
                            System.out.println("Ingrese el dia de llegada del producto: ");
                            int diaL = lectura.nextInt();
                            System.out.println("Ingrese el mes de llegada del producto: ");
                            int mesL = lectura.nextInt();
                            System.out.println("Ingrese el annio de llegada del producto: ");
                            int annioL = lectura.nextInt();
                            System.out.println("Ingrese el dia de salida del producto: ");
                            int diaS = lectura.nextInt();
                            System.out.println("Ingrese el mes de salida del producto: ");
                            int mesS = lectura.nextInt();
                            System.out.println("Ingrese el annio de salida del producto: ");
                            int annioS = lectura.nextInt();
                            Fecha fechallegada = new Fecha(diaL, mesL, annioL);
                            Fecha fechaSalida = new Fecha(diaS, mesS, annioS);
                            boolean t = true;
                            for(int i=0;i<granjas.size() && t;i++){
                                if(granjas.get(i).getNombre().equals(nombre)){
                                    granjas.get(i).addProduCulti(nombreProdu, destino, fechallegada, fechaSalida);
                                    t = false;
                                }
                            }
                            
                            break;
                        case 2:
                            System.out.println("Ingrese el nombre del centro de manufactura al cual desea agregarle el producto a manufacturar");
                            String nombre1 = lectura.next();
                            System.out.println("Ingrese el nombre del producto: ");
                            String nombreProdu1 = lectura.next();
                            System.out.println("Ingrese el destino del producto: ");
                            String destino1 = lectura.next();
                            System.out.println("Ingrese el dia de llegada del producto: ");
                            int diaL1 = lectura.nextInt();
                            System.out.println("Ingrese el mes de llegada del producto: ");
                            int mesL1 = lectura.nextInt();
                            System.out.println("Ingrese el annio de llegada del producto: ");
                            int annioL1 = lectura.nextInt();
                            System.out.println("Ingrese el dia de salida del producto: ");
                            int diaS1 = lectura.nextInt();
                            System.out.println("Ingrese el mes de salida del producto: ");
                            int mesS1 = lectura.nextInt();
                            System.out.println("Ingrese el annio de salida del producto: ");
                            int annioS1 = lectura.nextInt();
                            System.out.println("Ingrese el numero de lote del producto: ");
                            int numLote = lectura.nextInt();
                            ArrayList<MateriaPrima> materiasPrimas = new ArrayList<>();
                            for(int i=0;i<granjas.size();i++){
                                Farmer granjaUso = granjas.get(i);
                                for(int j=0;j<granjaUso.getProduCulti().size();i++){
                                    System.out.println("Desea agregar " + granjaUso.getProduCulti().get(i).getNombre() + " como materia prima a su producto: \n0. no\n1.si");
                                    int l = lectura.nextInt();
                                    if(l==1){
                                        materiasPrimas.add(granjaUso.getProduCulti().get(i));
                                    }
                                }
                            }                            
                            Fecha fechallegada1 = new Fecha(diaL1, mesL1, annioL1);
                            Fecha fechaSalida1 = new Fecha(diaS1, mesS1, annioS1);
                            boolean h = true;
                            for(int i=0;i<manufacturas.size() && h;i++){
                                if(manufacturas.get(i).getNombre().equals(nombre1)){
                                        manufacturas.get(i).addProduManu(materiasPrimas, nombreProdu1, destino1, fechallegada1, fechaSalida1, numLote);
                                    h = false;
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Ingrese el nombre del centro de distribucion al cual desea agregarle el producto a distribuir");
                            String nombre2 = lectura.next();
                            System.out.println("Ingrese el nombre del producto: ");
                            String nombreProdu2 = lectura.next();
                            System.out.println("Ingrese el destino del producto: ");
                            String destino2 = lectura.next();
                            System.out.println("Ingrese el dia de llegada del producto: ");
                            int diaL2 = lectura.nextInt();
                            System.out.println("Ingrese el mes de llegada del producto: ");
                            int mesL2 = lectura.nextInt();
                            System.out.println("Ingrese el annio de llegada del producto: ");
                            int annioL2 = lectura.nextInt();
                            System.out.println("Ingrese el dia de salida del producto: ");
                            int diaS2 = lectura.nextInt();
                            System.out.println("Ingrese el mes de salida del producto: ");
                            int mesS2 = lectura.nextInt();
                            System.out.println("Ingrese el annio de salida del producto: ");
                            int annioS2 = lectura.nextInt();
                            Producido productoProducido = null;
                            boolean a = true;
                            for(int i=0;i<manufacturas.size() && a;i++){
                                Manufacturer manufactura = manufacturas.get(i);
                                for(int j=0;j<manufactura.getProduManu().size() && a;i++){
                                    System.out.println("Desea tomar " + manufactura.getProduManu().get(i).getNombre() + " como producto producido: \n0. no\n1.si");
                                    int l = lectura.nextInt();
                                    if(l==1){
                                        productoProducido = manufactura.getProduManu().get(i);
                                        a = false;
                                    }
                                }
                            }                            
                            Fecha fechallegada2 = new Fecha(diaL2, mesL2, annioL2);
                            Fecha fechaSalida2 = new Fecha(diaS2, mesS2, annioS2);
                            boolean b = true;
                            for(int i=0;i<distribuidoras.size() && b;i++){
                                if(distribuidoras.get(i).getNombre().equals(nombre2)){
                                    distribuidoras.get(i).addProduDistri(productoProducido, nombreProdu2, destino2, fechallegada2, fechaSalida2);
                                    b = false;
                                }
                            }
                            break;
                        case 4:
                            System.out.println("Ingrese el nombre de la tienda a la cual desea agregarle el producto a vender");
                            String nombre3 = lectura.next();                            
                            Distribuido productoDistribuido = null;
                            boolean c = true;
                            for(int i=0;i<distribuidoras.size() && c;i++){
                                DistributionCenter distribuido = distribuidoras.get(i);
                                for(int j=0;j<distribuido.getProduDistri().size() && c;i++){
                                    System.out.println("Desea tomar " + distribuido.getProduDistri().get(i).getNombre() + " como producto distribuido: \n0. no\n1.si");
                                    int l = lectura.nextInt();
                                    if(l==1){
                                        productoDistribuido = distribuido.getProduDistri().get(i);
                                        c = false;
                                    }
                                }
                            } 
                            System.out.println("Ingrese el codigo de venta del producto: ");
                            int codVenta = lectura.nextInt();
                            System.out.println("Ingrese el valor del producto: ");
                            float precio = lectura.nextFloat();
                            boolean d = true;
                            for(int i=0;i<tiendas.size() && d;i++){
                                if(tiendas.get(i).getNombre().equals(nombre3)){
                                    tiendas.get(i).addProduVenta(precio, codVenta,productoDistribuido);
                                    d = false;
                                }
                            }
                            break;                        
                    }
                } while (opcion3 >0 && opcion3 < 5);
                break;
            case 3:
                System.out.println("Escoga en cual tienda quiere comprar: ");
                for(int z=0;z<tiendas.size();z++){
                    System.out.println(z + ". " + tiendas.get(z).getNombre());
                }
                int tienda = lectura.nextInt();
                System.out.println("Escoga el producto que quiere comprar: ");
                for(int p=0;p<tiendas.get(tienda).getProduVenta().size();p++){
                    System.out.println(p +". " + tiendas.get(tienda).getProduVenta().get(p));
                }
                int compra = lectura.nextInt();
                System.out.println("Ahora conoce la traza de tu compra: ");
                Venta producto = tiendas.get(tienda).getProduVenta().get(compra);                
                System.out.println("Nombre del producto: " + producto.getProductoDistribuido().getNombre());
                Retail tienda1 = null;
                for(int e=0;e<tiendas.size();e++){
                    if(tiendas.get(e).getNombre().equals(producto.getProductoDistribuido().getDestino()))
                        tienda1 = tiendas.get(e);
                }
                System.out.println("Nombre de la tienda: " + tienda1.getNombre());
                System.out.println("Descripcion: " + tienda1.getDescripcion() + ", longitud: " + tienda1.getDireccion().getLongitud() + ", latitud: " + tienda1.getDireccion().getLatitud());
                System.out.println("Codigo de venta" + producto.getCodVenta());
                System.out.println("Precio" + producto.getPrecio());
                DistributionCenter distribuidora1 = null;
                for(int q=0;q<distribuidoras.size();q++){
                    if(distribuidoras.get(q).equals(producto.getProductoDistribuido().getProductoProducido().getDestino()))
                        distribuidora1 = distribuidoras.get(q);
                }
                System.out.println("Nombre del centro de distribucion: " + distribuidora1.getNombre());
                System.out.println("Descripcion: " + distribuidora1.getDescripcion() + ", longitud: " + distribuidora1.getDireccion().getLongitud() + ", latitud: " + distribuidora1.getDireccion().getLatitud());
                System.out.println("Fecha de llegada del producto: " + producto.getProductoDistribuido().getFechaLlegada().getDia() + "," + producto.getProductoDistribuido().getFechaLlegada().getMes() + "," + producto.getProductoDistribuido().getFechaLlegada().getAnnio());
                System.out.println("Fecha de salida del producto: " + producto.getProductoDistribuido().getFechaSalida().getDia() + "," + producto.getProductoDistribuido().getFechaSalida().getMes() + "," + producto.getProductoDistribuido().getFechaSalida().getAnnio());
                Manufacturer manufacturer = null;
                for(int y=0;y<manufacturas.size();y++){
                    if(manufacturas.get(y).getNombre().equals(producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().get(0).getDestino()))
                        manufacturer = manufacturas.get(y);
                }
                System.out.println("Nombre del centro de manufactura: " + manufacturer.getNombre());
                System.out.println("Descripcion: " + manufacturer.getDescripcion() + ", longitud: " + manufacturer.getDireccion().getLongitud() + ", latitud: " + manufacturer.getDireccion().getLatitud());
                System.out.println("Fecha de llegada del producto: " + producto.getProductoDistribuido().getProductoProducido().getFechaLlegada().getDia() + "," + producto.getProductoDistribuido().getProductoProducido().getFechaLlegada().getMes() + "," + producto.getProductoDistribuido().getProductoProducido().getFechaLlegada().getAnnio());
                System.out.println("Fecha de salida del producto: " + producto.getProductoDistribuido().getProductoProducido().getFechaSalida().getDia() + "," + producto.getProductoDistribuido().getProductoProducido().getFechaSalida().getMes() + "," + producto.getProductoDistribuido().getProductoProducido().getFechaSalida().getAnnio());
                System.out.println("Numero de lote: " + producto.getProductoDistribuido().getProductoProducido().getNumLote());
                for (int i = 0; i < producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().size(); i++) {
                    Farmer granja = null;
                    for (int x = 0; x < granjas.size(); x++) {
                        if (granjas.get(x).getNombre().equals(producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().get(i).getGranja())){
                            granja = granjas.get(x);
                        }
                    }
                    System.out.println("Nombre de la granja: " + granja.getNombre());
                    System.out.println("Descripcion: " + granja.getDescripcion() + ", longitud: " + granja.getDireccion().getLongitud() + ", latitud: " + granja.getDireccion().getLatitud());
                    System.out.println("Nombre de la materia prima: " + producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().get(i).getNombre());
                    System.out.println("Fecha de llegada del producto: " + producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().get(i).getFechaLlegada().getDia() + "," + producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().get(i).getFechaLlegada().getMes() + "," + producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().get(i).getFechaLlegada().getAnnio());
                    System.out.println("Fecha de llegada del producto: " + producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().get(i).getFechaLlegada().getDia() + "," + producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().get(i).getFechaLlegada().getMes() + "," + producto.getProductoDistribuido().getProductoProducido().getMateriaPrima().get(i).getFechaLlegada().getAnnio());

                }                
                break;
        }
        
        
    }
}
