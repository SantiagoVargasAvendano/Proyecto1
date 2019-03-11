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
public class ProgramsCampsColombia extends Programas{
    private String typeProgram;
    private String company;
    private String campDate;
    private String duration;
    private String placeDeveloped;
    private String population;

    public ProgramsCampsColombia(String typeProgram, String company, String campDate, 
            String duration, String placeDeveloped, String population, String ID) {
        super(ID, typeProgram + "-" + campDate + "-" + company + "-" + placeDeveloped + "-" + population + "-" + duration);
        this.typeProgram = typeProgram;
        this.company = company;
        this.campDate = campDate;
        this.duration = duration;
        this.placeDeveloped = placeDeveloped;
        this.population = population;
    }



   

    
}
