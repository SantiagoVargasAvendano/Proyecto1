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
    private String IdPersona;
    private String nombrePersona;
    private String nombreCampamento;

    public ProgramsAssignment(String IdPersona, String nombrePersona,String nombreCampamento, String role, String calification, String note) {
        super(role, calification, note);
        this.IdPersona = IdPersona;
        this.nombrePersona = nombrePersona;
        this.nombreCampamento = nombreCampamento;
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
