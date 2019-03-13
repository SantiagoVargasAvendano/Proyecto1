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
public class LocalVolunteerAssignment extends Assignment{
    private int 
    private int numRegistro;
    private String IdPersona;
    private String nombrePersona;
    private String nombreCampamento;

    public LocalVolunteerAssignment(int numRegistro, String IdPersona, String nombrePersona, String nombreCampamento, String role, String calification, String note) {
        super(role, calification, note);
        this.numRegistro = numRegistro;
        this.IdPersona = IdPersona;
        this.nombrePersona = nombrePersona;
        this.nombreCampamento = nombreCampamento;
    }

    

    
}
