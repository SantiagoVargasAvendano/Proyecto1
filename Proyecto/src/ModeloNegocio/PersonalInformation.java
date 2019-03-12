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
public class PersonalInformation {
    private String fullName;
    private String typeDocument;
    private String Id;
    private String gender;
    private String dateBirth;
    private String mobile;
    private String phone; 
    private String citizen;    
    private String email;
    private String passport;
    private String sizeShirt;
    private String currentOcupation;
    private String fieldsStudy;
    private String university;
    private boolean graduate;
    private String currentAdress;
    private String currentCity;
    private String fullNameEmergencyContact;
    private String numberEmergencyContact;
    private String emailEmergencyContact;
    private String relationship;
    private String photo;


    public PersonalInformation(String fullName, String typeDocument, String Id, String gender, 
            String dateBirth, String mobile, String email, String sizeShirt, 
            String currentOcupation, String fieldsStudy, String university, boolean graduate, 
            String currentAdress, String currentCity, String fullNameEmergencyContact, 
            String numberEmergencyContact, String emailEmergencyContact, String relationship) {
        this.fullName = fullName;
        this.typeDocument = typeDocument;
        this.Id = Id;
        this.gender = gender;
        this.dateBirth = dateBirth;
        this.mobile = mobile;
        this.email = email;
        this.sizeShirt = sizeShirt;
        this.currentOcupation = currentOcupation;
        this.fieldsStudy = fieldsStudy;
        this.university = university;
        this.graduate = graduate;
        this.currentAdress = currentAdress;
        this.currentCity = currentCity;
        this.fullNameEmergencyContact = fullNameEmergencyContact;
        this.numberEmergencyContact = numberEmergencyContact;
        this.emailEmergencyContact = emailEmergencyContact;
        this.relationship = relationship;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCitizen(String citizen) {
        this.citizen = citizen;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
    
    
    
    
}
