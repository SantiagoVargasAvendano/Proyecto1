package ModeloNegocio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class CampsICCP extends Programas{
    private String annio;
    private String direccion;
    private String campYear;

    public CampsICCP(String annio, String direccion, String ID, String nombre) {
        super(ID, nombre);
        this.annio = annio;
        this.direccion = direccion;
        this.campYear = nombre + "-" + annio;
    }



    
}
