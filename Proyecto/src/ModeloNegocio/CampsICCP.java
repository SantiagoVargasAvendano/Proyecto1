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
    private String year;
    private String direccion;
    private String campYear;

    public CampsICCP(String year, String direccion, String ID, String nombre) {
        super(ID, nombre);
        this.year = year;
        this.direccion = direccion;
        this.campYear = nombre + "-" + year;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCampYear() {
        return campYear;
    }

    public void setCampYear(String campYear) {
        this.campYear = campYear;
    }
   
}
