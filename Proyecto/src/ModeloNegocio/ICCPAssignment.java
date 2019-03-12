package ModeloNegocio;

import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class ICCPAssignment extends Assignment {
    private int count = 1; 
    private int numRegistro;
    private String nombreParticipante;
    private String IdParticipante;
    private String codigoCampamento;
    private String fechaInicio;
    private String fechaFin;

    public ICCPAssignment(int numRegistro, String nombreParticipante, String IdParticipante, String codigoCampamento, String fechaInicio, String fechaFin, String role, String calification, String note) {
        super(role, calification, note);
        this.numRegistro =  numRegistro+count;
        this.nombreParticipante = nombreParticipante;
        this.IdParticipante = IdParticipante;
        this.codigoCampamento = codigoCampamento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public void addPersona(String nombre, int ID){
        
    }

    
}
