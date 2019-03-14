/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloNegocio;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class GestorPlataforma {
    private ArrayList<PersonalInformation> personas;
    private ArrayList<ProgramsCampsColombia> programasColombia;
    private ArrayList<VolunteerPrograms> programasVoluntariado;
    private ArrayList<CampsICCP> programasICCP;
    private ArrayList<ProgramsAssignment> programasColombiaAssignment;
    private ArrayList<ICCPAssignment> ICCPAssignments;
    private ArrayList<LocalVolunteerAssignment> volunteerAssignment;

    public GestorPlataforma() {
        this.personas = new ArrayList<>();
        this.programasColombia = new ArrayList<>();
        this.programasVoluntariado = new ArrayList<>();
        this.programasICCP = new ArrayList<>();
        this.programasColombiaAssignment = new ArrayList<>();
        this.ICCPAssignments = new ArrayList<>();
        this.volunteerAssignment = new ArrayList<>();
    }

    public boolean addPersona(PersonalInformation persona){
        return this.personas.add(persona);
    }
    
    public boolean addProgramaColombia(ProgramsCampsColombia programa){
        return this.programasColombia.add(programa);
    }
    
    public boolean addVoluntariado(VolunteerPrograms voluntariado){
        return this.programasVoluntariado.add(voluntariado);
    }
    
    public boolean addProgramaICCP(CampsICCP campamento){
        return this.programasICCP.add(campamento);
    }
    
    public boolean addColombiaAssignment(ProgramsAssignment asignacion){
        return this.programasColombiaAssignment.add(asignacion);
    }
    
    public boolean addVoluntariadoAssignment(LocalVolunteerAssignment asignacion){
        return this.volunteerAssignment.add(asignacion);
    }
    
    public boolean addICCPAssignment(ICCPAssignment asignacion){
        return this.ICCPAssignments.add(asignacion);
    }
    
    public boolean borrarPersona(String id){
        for(int i=0;i<personas.size();i++){
            if(personas.get(i).getId().equals(id)){
                return this.personas.remove(personas.get(i));
            }
        }
        return false;
    }
    
    public ArrayList<PersonalInformation> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<PersonalInformation> personas) {
        this.personas = personas;
    }

    public ArrayList<ProgramsCampsColombia> getProgramasColombia() {
        return programasColombia;
    }

    public void setProgramasColombia(ArrayList<ProgramsCampsColombia> programasColombia) {
        this.programasColombia = programasColombia;
    }

    public ArrayList<VolunteerPrograms> getProgramasVoluntariado() {
        return programasVoluntariado;
    }

    public void setProgramasVoluntariado(ArrayList<VolunteerPrograms> programasVoluntariado) {
        this.programasVoluntariado = programasVoluntariado;
    }

    public ArrayList<CampsICCP> getProgramasICCP() {
        return programasICCP;
    }

    public void setProgramasICCP(ArrayList<CampsICCP> programasICCP) {
        this.programasICCP = programasICCP;
    }

    public ArrayList<ProgramsAssignment> getProgramasColombiaAssignment() {
        return programasColombiaAssignment;
    }

    public void setProgramasColombiaAssignment(ArrayList<ProgramsAssignment> programasColombiaAssignment) {
        this.programasColombiaAssignment = programasColombiaAssignment;
    }

    public ArrayList<ICCPAssignment> getICCPAssignments() {
        return ICCPAssignments;
    }

    public void setICCPAssignments(ArrayList<ICCPAssignment> ICCPAssignments) {
        this.ICCPAssignments = ICCPAssignments;
    }

    public ArrayList<LocalVolunteerAssignment> getVolunteerAssignment() {
        return volunteerAssignment;
    }

    public void setVolunteerAssignment(ArrayList<LocalVolunteerAssignment> volunteerAssignment) {
        this.volunteerAssignment = volunteerAssignment;
    }
    
    public String getStringConsulta(String nombreTabla){
        String consulta=null;
        return consulta="SELECT * FROM "+nombreTabla;
    }
    
    public String getStringConsulta(String nombreTabla, String[] nombreAtributos, String[] condiciones, String condicional){
        String valorConsulta=null;
        if (nombreAtributos.length==condiciones.length) {
            valorConsulta="SELECT * FROM "+nombreTabla+" WHERE ";
            for (int i = 0; i < nombreAtributos.length-1 ; i++){
                valorConsulta=valorConsulta+" "+nombreTabla+"."+nombreAtributos[i]+"='"+condiciones[i]+"' "+condicional;
            }
            valorConsulta=valorConsulta+" "+nombreTabla+"."+nombreAtributos[nombreAtributos.length]+"='"+condiciones[condiciones.length]+"'";
        }
        return valorConsulta;
    }

    public boolean addPersInfFormDb(ArrayList<PersonalInformation> personas){
        for(int i=0;i<personas.size();i++){
            this.personas.add(personas.get(i));
        }
        return true;
    }
    
    
}
