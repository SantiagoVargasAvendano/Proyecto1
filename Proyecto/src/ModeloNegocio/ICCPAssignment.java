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
    private static int count = 1; 
    private int numRegistro;
    private String nombreParticipante;
    private String IdParticipante;
    private String codigoCampamento;
    private String fechaInicio;
    private String fechaFin;

    public ICCPAssignment(String nombreParticipante, String IdParticipante, String codigoCampamento, String fechaInicio, String fechaFin, String role, String calification, String note) {
        super(role, calification, note);
        this.numRegistro = count;
        this.nombreParticipante = nombreParticipante;
        this.IdParticipante = IdParticipante;
        this.codigoCampamento = codigoCampamento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        count++;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getNombreParticipante() {
        return nombreParticipante;
    }

    public void setNombreParticipante(String nombreParticipante) {
        this.nombreParticipante = nombreParticipante;
    }

    public String getIdParticipante() {
        return IdParticipante;
    }

    public void setIdParticipante(String IdParticipante) {
        this.IdParticipante = IdParticipante;
    }

    public String getCodigoCampamento() {
        return codigoCampamento;
    }

    public void setCodigoCampamento(String codigoCampamento) {
        this.codigoCampamento = codigoCampamento;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    
}
