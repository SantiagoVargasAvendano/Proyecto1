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
public class VolunteerPrograms extends Programas{
    private String company;
    private String fechaGrado;
    private String duration;
    private String tipoVoluntariado;

    public VolunteerPrograms(String company, String fechaGrado, String duration, 
                    String tipoVoluntariado, String ID) {
        super(ID, tipoVoluntariado + "-" + company + "-" + fechaGrado);
        this.company = company;
        this.fechaGrado = fechaGrado;
        this.duration = duration;
        this.tipoVoluntariado = tipoVoluntariado;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFechaGrado() {
        return fechaGrado;
    }

    public void setFechaGrado(String fechaGrado) {
        this.fechaGrado = fechaGrado;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTipoVoluntariado() {
        return tipoVoluntariado;
    }

    public void setTipoVoluntariado(String tipoVoluntariado) {
        this.tipoVoluntariado = tipoVoluntariado;
    }    

}    
    

   