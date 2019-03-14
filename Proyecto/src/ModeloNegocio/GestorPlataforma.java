/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloNegocio;

import java.util.ArrayList;
import com.healthmarketscience.jackcess.Column;
import com.healthmarketscience.jackcess.Database;
import com.healthmarketscience.jackcess.DatabaseBuilder;
import com.healthmarketscience.jackcess.Row;
import com.healthmarketscience.jackcess.Table;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Lenovo
 */
public class GestorPlataforma {
    private Database bd;
    private ArrayList<PersonalInformation> personas;
    private ArrayList<ProgramsCampsColombia> programasColombia;
    private ArrayList<VolunteerPrograms> programasVoluntariado;
    private ArrayList<CampsICCP> programasICCP;
    private ArrayList<ProgramsAssignment> programasColombiaAssignment;
    private ArrayList<ICCPAssignment> ICCPAssignments;
    private ArrayList<LocalVolunteerAssignment> volunteerAssignment;
    private Table personaInformation;
    private Table campsICCP;
    private Table ICCPAssignment;
    private Table programasBDColombia;
    private Table programsAssignment;
    private Table programasBDVoluntariado;
    private Table voluntariadoAssignment;
    private Scanner lectura;
        // variables
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public GestorPlataforma() {
        this.personas = new ArrayList<>();
        this.programasColombia = new ArrayList<>();
        this.programasVoluntariado = new ArrayList<>();
        this.programasICCP = new ArrayList<>();
        this.programasColombiaAssignment = new ArrayList<>();
        this.ICCPAssignments = new ArrayList<>();
        this.volunteerAssignment = new ArrayList<>();
        this. lectura = new Scanner(System.in);
        // variables
        this. connection = null;
        this.statement = null;
        this.resultSet = null;
        try {
            this.bd = DatabaseBuilder.open(new File("bd proyecto final.accdb"));
            Table personaInformation = bd.getTable("Personal Information");
            Table campsICCP = bd.getTable("Camps ICCP");
            Table ICCPAssignment = bd.getTable("ICCP Assignment");
            Table programasBDColombia = bd.getTable("Programs - Camps Colombia");
            Table programsAssignment= bd.getTable("Programs Assignment");
            Table programasBDVoluntariado = bd.getTable("Volunteer Programs");
            Table voluntariadoAssignment = bd.getTable("Local Volunteer Programs Assignment");  
        } catch (IOException ex) {
            Logger.getLogger(GestorPlataforma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean addPersona(PersonalInformation persona){
        String fullName=persona.getFullName();
        String typeDocument=persona.getTypeDocument();
        String Id=persona.getId();
        String gender=persona.getGender();
        String dateBirth=persona.getDateBirth();
        String mobile=persona.getMobile();
        String phone=persona.getPhone(); 
        String citizen=persona.getCitizen();    
        String email=persona.getEmail();
        String passport=persona.getPassport();
        String sizeShirt=persona.getSizeShirt();
        String currentOcupation=persona.getCurrentOcupation();
        String fieldsStudy=persona.getFieldsStudy();
        String university=persona.getUniversity();
        boolean graduate=persona.isGraduate();
        String currentAdress=persona.getCurrentAdress();
        String currentCity=persona.getCurrentCity();
        String fullNameEmergencyContact=persona.getFullNameEmergencyContact();
        String numberEmergencyContact=persona.getNumberEmergencyContact();
        String emailEmergencyContact=persona.getEmailEmergencyContact();
        String relationship=persona.getRelationship();
        
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

    public boolean addPersInfFromDb(ArrayList<PersonalInformation> personasBd){
        for(int i=0;i<personasBd.size();i++){
            this.personas.add(personasBd.get(i));
        }
        return true;
    }
    
    public boolean addCampsICCPFromDb(ArrayList<CampsICCP> campsICCPBd){
        for(int i=0;i<campsICCPBd.size();i++){
            this.programasICCP.add(campsICCPBd.get(i));
        }
        return true;
    }
    
    public boolean addICCPAssignFromDb(ArrayList<ICCPAssignment> ICCPAssignBd){
        for(int i=0;i<ICCPAssignBd.size();i++){
            this.ICCPAssignments.add(ICCPAssignBd.get(i));
        }
        return true;
    }
    
    public boolean addLocVolunAssignFromDb(ArrayList<LocalVolunteerAssignment> LocalVolunAssignBd){
        for(int i=0;i<LocalVolunAssignBd.size();i++){
            this.volunteerAssignment.add(LocalVolunAssignBd.get(i));
        }
        return true;
    }
    
    public boolean addVolunteerProgFromDb(ArrayList<VolunteerPrograms> VolunteerProgBd){
        for(int i=0;i<VolunteerProgBd.size();i++){
            this.programasVoluntariado.add(VolunteerProgBd.get(i));
        }
        return true;
    }
    
    public boolean addProgCampsColomFromDb(ArrayList<ProgramsCampsColombia> ProgCampsColomBd){
        for(int i=0;i<ProgCampsColomBd.size();i++){
            this.programasColombia.add(ProgCampsColomBd.get(i));
        }
        return true;
    }
    
    public boolean addProgramsAssignFromDb(ArrayList<ProgramsAssignment> ProgramsAssignBd){
        for(int i=0;i<ProgramsAssignBd.size();i++){
            this.programasColombiaAssignment.add(ProgramsAssignBd.get(i));
        }
        return true;
    }
    
    public ArrayList<PersonalInformation> getPersona() throws IOException{
        ArrayList<PersonalInformation> persona=new ArrayList<>();
        Table personaInformation = bd.getTable("Personal Information");
        String fullName;
        String typeDocument;
        String Id;
        String gender;
        String dateBirth;
        String mobile;
        String phone; 
        String citizen;    
        String email;
        String passport;
        String sizeShirt;
        String currentOcupation;
        String fieldsStudy;
        String university;
        boolean graduate;
        String currentAdress;
        String currentCity;
        String fullNameEmergencyContact;
        String numberEmergencyContact;
        String emailEmergencyContact;
        String relationship;
        for(Row row : personaInformation) {
            fullName =row.getString("Full Name");
            typeDocument=row.getString("Type of Document");
            Id=row.getString("ID");
            gender=row.getString("Gender");
            dateBirth=row.getString("Date of Birth");
            mobile=row.getString("Mobile");
            phone=row.getString("Phone");
            citizen=row.getString("Citizen");
            email=row.getString("E-Mail");
            sizeShirt=row.getString("Size of Shirt");
            currentOcupation=row.getString("Current Ocupation");
            fieldsStudy=row.getString("Field of Study");
            university=row.getString("University");
            graduate=row.getBoolean("Graduate");
            currentAdress=row.getString("Current Adress");
            currentCity=row.getString("Current City");
            fullNameEmergencyContact=row.getString("Full Name Emergency Contact");
            numberEmergencyContact=row.getString("Number Emergency Contact");
            emailEmergencyContact=row.getString("Email Emergency Contact");
            relationship=row.getString("Relationship");
            passport=row.getString("Passport");
            PersonalInformation personaAgregar=new PersonalInformation(fullName, typeDocument, Id, gender, dateBirth, mobile, email, sizeShirt, currentOcupation, fieldsStudy, university, graduate, currentAdress, currentCity, fullNameEmergencyContact, numberEmergencyContact, emailEmergencyContact, relationship);
            personaAgregar.setPassport(passport);
            persona.add(personaAgregar);
        }
        return persona;
    }
    
    public ArrayList<CampsICCP> getCampamentosICCP() throws IOException{
        ArrayList<CampsICCP> iccp=new ArrayList<>();
        String nombre;
        String codigo;
        String year;
        String direccion;
        String campyear;
        Table campsICCP = bd.getTable("Camps ICCP");
        for(Row row : campsICCP) {
            nombre=row.getString("Nombre");
            codigo=row.getString("Codigo/ Camp ICCP ID");
            year=row.getString("Año");
            direccion=row.getString("Direccion");
            campyear=row.getString("Camp year");
            CampsICCP Agregar=new CampsICCP(year, direccion,codigo,nombre);
            Agregar.setCampYear(campyear);
            iccp.add(Agregar);
        }
        return iccp;
    }
    
    public ArrayList<ICCPAssignment> getAssignmentICCP() throws IOException{
        ArrayList<ICCPAssignment> iccp=new ArrayList<>();
        String nombreParticipante;
        String codigoParticipante;
        String codigoCampamento;
        String fechaInicio;
        String fechaFin;
        String role;
        String calificacion;
        String note;
        Table ICCPAssignment = bd.getTable("ICCP Assignment");
        for(Row row : ICCPAssignment) {
            nombreParticipante=row.getString("Nombre Participante/ ID Participant");
            codigoParticipante=row.getString("ID");
            codigoCampamento=row.getString("Codigo/ Camp ICCP ID");
            fechaInicio=row.getString("Fecha inicio");
            fechaFin=row.getString("Fecha fin");
            role=row.getString("Role");
            calificacion=row.getString("Calification");
            note=row.getString("Note");
            ICCPAssignment Agregar=new ICCPAssignment(nombreParticipante, codigoParticipante, codigoCampamento, fechaInicio, fechaFin, role, calificacion, note);
            iccp.add(Agregar);
        }
        return iccp;
    }
    
    public ArrayList<ProgramsAssignment> getAssignmentColombia() throws IOException{
        ArrayList<ProgramsAssignment> asignacionProgramas=new ArrayList<>();
        String nombreParticipante;
        String codigoParticipante;
        String codigoCampamento;
        String role;
        String calificacion;
        String note;
        Table programsAssignment= bd.getTable("Programs Assignment");
        for(Row row : programsAssignment) {
            nombreParticipante=row.getString("Personal ID");
            codigoParticipante=row.getString("ID");
            codigoCampamento=row.getString("Camp ID");
            role=row.getString("Role");
            calificacion=row.getString("Calification");
            note=row.getString("Note");
            ProgramsAssignment Agregar=new ProgramsAssignment(codigoParticipante,nombreParticipante, codigoCampamento, role, calificacion, note);
            asignacionProgramas.add(Agregar);
        }
        return asignacionProgramas;
    }
    
    public ArrayList<ProgramsCampsColombia> getCampsColombia() throws IOException{
        ArrayList<ProgramsCampsColombia> campamentosColombia=new ArrayList<>();
        String campID;
        String nameCamp;
        String tipoPrograma;
        String company;
        String campDate;
        String duration;
        String placeDeveloped;
        String population;
        Table programasColombia = bd.getTable("Programs - Camps Colombia");
        for(Row row : programasColombia) {
            campID=row.getString("Camp ID");
            nameCamp=row.getString("Name Camp");
            tipoPrograma=row.getString("Type of Program");
            company=row.getString("Company");
            campDate=row.getString("Camp Date");
            duration=row.getString("Duration");
            placeDeveloped=row.getString("Place developed");
            population=row.getString("Population");
            ProgramsCampsColombia Agregar=new ProgramsCampsColombia(tipoPrograma, company, campDate, duration, placeDeveloped, population, campID);
            Agregar.setNombre(nameCamp);
            campamentosColombia.add(Agregar);
        }
        return campamentosColombia;
    }
    
    public ArrayList<VolunteerPrograms> getVoluntariado() throws IOException{
        ArrayList<VolunteerPrograms> voluntariado=new ArrayList<>();
        String voluntariadoID;
        String nameProgram;
        String tipoVoluntariado;
        String company;
        String fechaGrado;
        String duration;
        Table programasVoluntariado = bd.getTable("Volunteer Programs");
        for(Row row : programasVoluntariado) {
            voluntariadoID=row.getString("Voluntariado ID");
            nameProgram=row.getString("Name of Program");
            company=row.getString("Company");
            fechaGrado=row.getString("Fecha Grado");
            duration=row.getString("Duration");
            tipoVoluntariado=row.getString("Tipo Voluntariado");
            VolunteerPrograms Agregar=new VolunteerPrograms(company, fechaGrado, duration, tipoVoluntariado, voluntariadoID);
            Agregar.setNombre(nameProgram);
            voluntariado.add(Agregar);
        }
        return voluntariado;
    }
    
    public ArrayList<LocalVolunteerAssignment> getAssignmentVoluntariado() throws IOException{
        ArrayList<LocalVolunteerAssignment> asignacionVoluntariado=new ArrayList<>();
        String nombreVoluntario;
        String codigoVoluntario;
        String codigoVoluntariado;
        String role;
        String calificacion;
        String note;
        Table voluntariadoAssignment = bd.getTable("Local Volunteer Programs Assignment");
        for(Row row : voluntariadoAssignment) {
            nombreVoluntario=row.getString("Volunteer ID");
            codigoVoluntario=row.getString("Volunteer Name");
            codigoVoluntariado=row.getString("Voluntariado ID");
            role=row.getString("Role");
            calificacion=row.getString("Calification");
            note=row.getString("Note");
            LocalVolunteerAssignment Agregar=new LocalVolunteerAssignment(codigoVoluntario, nombreVoluntario, codigoVoluntariado, role, calificacion, note);
            asignacionVoluntariado.add(Agregar);
        }
        return asignacionVoluntariado;
    }
    
    private ResultSet generarConsulta(String consulta) throws SQLException{
            String msAccDB = "Contacts_Demo_V1.01.mdb";
            String dbURL = "jdbc:ucanaccess://"+ msAccDB; 
            // Step 2.A: Create and 
            // get connection using DriverManager class
            connection = DriverManager.getConnection(dbURL); 
            // Step 2.B: Creating JDBC Statement 
            statement = connection.createStatement();
            // Step 2.C: Executing SQL and 
            // retrieve data into ResultSet
            System.out.println("Ingrese el apellido");
            String apellido = lectura.next();
            resultSet = statement.executeQuery(consulta);
            return resultSet;
    }    
}
