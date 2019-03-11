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


}    
    

   