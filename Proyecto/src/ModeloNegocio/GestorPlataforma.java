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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 *
 * @author Lenovo
 */
public class GestorPlataforma {
    private String excelFilePath = "JavaBooks.xls";
    private static Database bd;
    private ArrayList<PersonalInformation> personas;
    private ArrayList<ProgramsCampsColombia> programasColombia;
    private ArrayList<VolunteerPrograms> programasVoluntariado;
    private ArrayList<CampsICCP> programasICCP;
    private ArrayList<ProgramsAssignment> programasColombiaAssignment;
    private ArrayList<ICCPAssignment> ICCPAssignments;
    private ArrayList<LocalVolunteerAssignment> volunteerAssignment;
    private ArrayList<PersonalInformation> nuevaspersonas;
    private ArrayList<ProgramsCampsColombia> nuevosprogramasColombia;
    private ArrayList<VolunteerPrograms> nuevosprogramasVoluntariado;
    private ArrayList<CampsICCP> nuevosprogramasICCP;
    private ArrayList<ProgramsAssignment> nuevosprogramasColombiaAssignment;
    private ArrayList<ICCPAssignment> nuevosICCPAssignments;
    private ArrayList<LocalVolunteerAssignment> nuevosvolunteerAssignment;
    private Table personaInformation;
    private Table campsICCP;
    private Table ICCPAssignment;
    private Table programasBDColombia;
    private Table programsAssignment;
    private Table programasBDVoluntariado;
    private Table voluntariadoAssignment;
    
        // variables
    private  Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public GestorPlataforma() {
        this.nuevaspersonas = new ArrayList<>();
        this.nuevosprogramasColombia = new ArrayList<>();
        this.nuevosprogramasVoluntariado = new ArrayList<>();
        this.nuevosprogramasICCP = new ArrayList<>();
        this.nuevosprogramasColombiaAssignment=new ArrayList<>();
        this.nuevosICCPAssignments=new ArrayList<>();
        this.nuevosvolunteerAssignment=new ArrayList<>();
        this.personas = new ArrayList<>();
        this.programasColombia = new ArrayList<>();
        this.programasVoluntariado = new ArrayList<>();
        this.programasICCP = new ArrayList<>();
        this.programasColombiaAssignment = new ArrayList<>();
        this.ICCPAssignments = new ArrayList<>();
        this.volunteerAssignment = new ArrayList<>();
        
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
    
    public boolean addPersona(PersonalInformation persona) throws IOException{
        nuevaspersonas.add(persona);
        return personas.add(persona);
    }
    
    public boolean addProgramaColombia(ProgramsCampsColombia programa) throws IOException{
        nuevosprogramasColombia.add(programa);
        return programasColombia.add(programa);
    }
    
    public boolean addVoluntariado(VolunteerPrograms voluntariado) throws IOException{
        nuevosprogramasVoluntariado.add(voluntariado);
        return programasVoluntariado.add(voluntariado);
    }
    
    public boolean addProgramaICCP(CampsICCP campamento) throws IOException{
        nuevosprogramasICCP.add(campamento);
        return programasICCP.add(campamento);
    }
    
    public boolean addColombiaAssignment(ProgramsAssignment asignacion) throws IOException{
        nuevosprogramasColombiaAssignment.add(asignacion);
        return addColombiaAssignment(asignacion);
    }
    
    public boolean addVoluntariadoAssignment(LocalVolunteerAssignment asignacion) throws IOException{
        nuevosvolunteerAssignment.add(asignacion);
        return volunteerAssignment.add(asignacion);
    }
    
    public boolean addICCPAssignment(ICCPAssignment asignacion) throws IOException{
        nuevosICCPAssignments.add(asignacion);
        return ICCPAssignments.add(asignacion);
    }
    
    public void addPersonaDb(ArrayList<PersonalInformation> persona) throws IOException{
        for (int i = 0; i < persona.size(); i++) {
            String fullName=persona.get(i).getFullName();
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
            personaInformation.addRow(fullName,);
        }
    }
    
    public void addProgramaColombiaDb(ArrayList<ProgramsCampsColombia> programa) throws IOException{
        for (int i = 0; i < programa.size(); i++) {
            programasBDColombia.addRow(programa.get(i));
        }
    }
    
    public void addVoluntariadoDb(ArrayList<VolunteerPrograms> voluntariado) throws IOException{
        for (int i = 0; i < voluntariado.size(); i++) {
            programasBDVoluntariado.addRow(voluntariado.get(i));
        }
    }
    
    public void addProgramaICCPDb(ArrayList<CampsICCP> campamento) throws IOException{
        for (int i = 0; i < campamento.size(); i++) {
            campsICCP.addRow(campamento.get(i));
        }
    }
    
    public void addColombiaAssignmentDb(ArrayList<ProgramsAssignment> asignacion) throws IOException{
        for (int i = 0; i < asignacion.size(); i++) {
            programsAssignment.addRow(asignacion.get(i));
        }
    }
    
    public void addVoluntariadoAssignmentDb(ArrayList<LocalVolunteerAssignment> asignacion) throws IOException{
        for (int i = 0; i < asignacion.size(); i++) {
            voluntariadoAssignment.addRow(asignacion.get(i));
        }
    }
    
    public void addICCPAssignmentDb(ArrayList<ICCPAssignment> asignacion) throws IOException{
        for (int i = 0; i < asignacion.size(); i++) {
            ICCPAssignment.addRow(asignacion.get(i));
        }
    }
    
    public boolean borrarPersona(String id){
        for(int i=0;i<personas.size();i++){
            if(personas.get(i).getId().equals(id)){
                return this.personas.remove(personas.get(i));
            }
        }
        return false;
    }

    public ArrayList<PersonalInformation> getNuevaspersonas() {
        return nuevaspersonas;
    }

    public ArrayList<ProgramsCampsColombia> getNuevosprogramasColombia() {
        return nuevosprogramasColombia;
    }

    public ArrayList<VolunteerPrograms> getNuevosprogramasVoluntariado() {
        return nuevosprogramasVoluntariado;
    }

    public ArrayList<CampsICCP> getNuevosprogramasICCP() {
        return nuevosprogramasICCP;
    }

    public ArrayList<ProgramsAssignment> getNuevosprogramasColombiaAssignment() {
        return nuevosprogramasColombiaAssignment;
    }

    public ArrayList<ICCPAssignment> getNuevosICCPAssignments() {
        return nuevosICCPAssignments;
    }

    public ArrayList<LocalVolunteerAssignment> getNuevosvolunteerAssignment() {
        return nuevosvolunteerAssignment;
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
        String condicion=null;
        if (nombreAtributos.length==condiciones.length) {
            valorConsulta="SELECT * FROM "+nombreTabla+" WHERE";
            for (int i = 0; i < (nombreAtributos.length)-1 ; i++){
                condicion= condicion+" "+nombreTabla+"."+nombreAtributos[i]+" = '"+condiciones[i]+"' ";
            }
            condicion=condicion+" "+nombreTabla+"."+nombreAtributos[nombreAtributos.length-1]+"="+condiciones[condiciones.length-1]+"";
        }
        valorConsulta=valorConsulta+condicion;
        return valorConsulta;
    }
    
    public void getPersona() throws IOException{
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
            this.personas.add(personaAgregar);
        }
    }
    
    public void getCampamentosICCP() throws IOException{
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
            this.programasICCP.add(Agregar);
        }
    }
    
    public void getAssignmentICCP() throws IOException{
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
            this.ICCPAssignments.add(Agregar);
        }
    }
    
    public void getAssignmentColombia() throws IOException{
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
            this.programasColombiaAssignment.add(Agregar);
        }
    }
    
    public void getCampsColombia() throws IOException{
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
            this.programasColombia.add(Agregar);
        }
    }
    
    public void getVoluntariado() throws IOException{
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
            this.programasVoluntariado.add(Agregar);
        }
    }
    
    public void getAssignmentVoluntariado() throws IOException{
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
            this.volunteerAssignment.add(Agregar);
        }
    }
    
    public  void generarConsulta(String consulta){
            try{
                String msAccDB = "bd proyecto final.accdb";
                 String dbURL = "jdbc:ucanaccess://"+ msAccDB; 
            // Step 2.A: Create and 
            // get connection using DriverManager class
            connection = DriverManager.getConnection(dbURL); 
            // Step 2.B: Creating JDBC Statement 
            statement = connection.createStatement();
            // Step 2.C: Executing SQL and 
            // retrieve data into ResultSet
            resultSet = statement.executeQuery(consulta);
            while(resultSet.next()) {
                
                 //Escribe en EXCEL    
                
                
                System.out.println(resultSet.getString(1));
            }
            }catch(SQLException sqlex){
                sqlex.printStackTrace();
            }
    }    
    
    public void ejecutarConexion(String consulta) throws SQLException{
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException cnfex) {
 

            System.out.println("Problem in loading or "
                    + "registering MS Access JDBC driver");
            cnfex.printStackTrace();
        }
        String msAccDB = "bd proyecto final.accdb";
        String dbURL = "jdbc:ucanaccess://" + msAccDB;
        // Step 2.A: Create and 
        // get connection using DriverManager class
        connection = DriverManager.getConnection(dbURL);
        // Step 2.B: Creating JDBC Statement 
        statement = connection.createStatement();
        // Step 2.C: Executing SQL and 
        // retrieve data into ResultSet
        resultSet = statement.executeQuery(consulta);
         System.out.println("ID\tName");
            System.out.println("==\t================\t===\t=======");
 
            // processing returned data and printing into console
            while(resultSet.next()) {
                
                 //Escribe en EXCEL    
                
                
                System.out.println(resultSet.getString(1));
            
            }
    }
    
    public  void cerrarConexion(){
        try {
                if(null != connection) {
                    // cleanup resources, once after processing
                    resultSet.close();
                    statement.close();
 
                    // and then finally close connection
                    connection.close();
                }
            }
            catch (SQLException sqlex) {
                sqlex.printStackTrace();
            }

    }
    
    public void crearEscrituraExcel() throws FileNotFoundException, IOException{
        FileInputStream inputStream = new FileInputStream(new File(this.excelFilePath));
            //Referencia al libro
            Workbook workbook = WorkbookFactory.create(inputStream);
            //Referencia a la primera hoja
            Sheet sheet = workbook.getSheetAt(1);

            //Capturar los datos que le ingresan de la interfaz.
            //Armar el Vector y listo.
            Object[] bookData = {"Fabian", "Giraldo.", 16};
          
            //Ir a la ultima final
            int rowCount = sheet.getLastRowNum();
            //Crear una nueva fila
            org.apache.poi.ss.usermodel.Row row = sheet.createRow(++rowCount);

            int columnCount = 0;
            Cell cell = row.createCell(columnCount);
            cell.setCellValue(rowCount);

            //Almacenar los datos existentes
            for (Object field : bookData) {
                cell = row.createCell(++columnCount);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
            inputStream.close();
            FileOutputStream outputStream = new FileOutputStream("Fabian.xls");
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
    }
    
    public void crearEscrituraExcelPI(ArrayList<PersonalInformation> personas) throws FileNotFoundException, IOException{
        FileInputStream inputStream = new FileInputStream(new File(this.excelFilePath));
            //Referencia al libro
            Workbook workbook = WorkbookFactory.create(inputStream);
            //Referencia a la primera hoja
            Sheet sheet = workbook.getSheetAt(1);

            //Capturar los datos que le ingresan de la interfaz.
            //Armar el Vector y listo.
            Object[] bookData = new Object[personas.size()];
            for(int i=0;i<personas.size();i++){
                bookData[i] = personas.get(i);
            }
          
            //Ir a la ultima final
            int rowCount = sheet.getLastRowNum();
            //Crear una nueva fila
            org.apache.poi.ss.usermodel.Row row = sheet.createRow(++rowCount);

            int columnCount = 0;
            Cell cell = row.createCell(columnCount);
            cell.setCellValue(rowCount);

            //Almacenar los datos existentes
            for (Object field : bookData) {
                cell = row.createCell(++columnCount);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
            inputStream.close();
            FileOutputStream outputStream = new FileOutputStream("Fabian.xls");
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();


    }
}
