package ModeloNegocio;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class ProgramsAssignment extends Assignment{
    private static int count = 1;
    private int numRegistro;
    private String IdPersona;
    private String nombrePersona;
    private String nombreCampamento;

    public ProgramsAssignment(String IdPersona, String nombrePersona, 
            String nombreCampamento, String role, String calification, String note) {
        super(role, calification, note);
        this.numRegistro = count;
        this.IdPersona = IdPersona;
        this.nombrePersona = nombrePersona;
        this.nombreCampamento = nombreCampamento;
        count++;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(String IdPersona) {
        this.IdPersona = IdPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getNombreCampamento() {
        return nombreCampamento;
    }

    public void setNombreCampamento(String nombreCampamento) {
        this.nombreCampamento = nombreCampamento;
    }
    
    
}
