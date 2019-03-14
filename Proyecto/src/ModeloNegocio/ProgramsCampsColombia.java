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

    public String getTypeProgram() {
        return typeProgram;
    }

    public void setTypeProgram(String typeProgram) {
        this.typeProgram = typeProgram;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCampDate() {
        return campDate;
    }

    public void setCampDate(String campDate) {
        this.campDate = campDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPlaceDeveloped() {
        return placeDeveloped;
    }

    public void setPlaceDeveloped(String placeDeveloped) {
        this.placeDeveloped = placeDeveloped;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
    
}
