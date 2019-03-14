/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloNegocio;

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
 * @author Asus
 */
public class BaseDatos {
    private Database bd;
   
    public BaseDatos(String url) {
        try {
            this.bd = DatabaseBuilder.open(new File(url));
            Table personaInformation = bd.getTable("Personal Information");
            Table campsICCP = bd.getTable("Camps ICCP");
            Table ICCPAssignment = bd.getTable("ICCP Assignment");
            Table programasColombia = bd.getTable("Programs - Camps Colombia");
            Table programsAssignment= bd.getTable("Programs Assignment");
            Table programasVoluntariado = bd.getTable("Volunteer Programs");
            Table voluntariadoAssignment = bd.getTable("Local Volunteer Programs Assignment");
            
        } catch (IOException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    
}
