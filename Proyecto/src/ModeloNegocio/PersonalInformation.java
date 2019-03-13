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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCitizen() {
        return citizen;
    }

    public void setCitizen(String citizen) {
        this.citizen = citizen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getSizeShirt() {
        return sizeShirt;
    }

    public void setSizeShirt(String sizeShirt) {
        this.sizeShirt = sizeShirt;
    }

    public String getCurrentOcupation() {
        return currentOcupation;
    }

    public void setCurrentOcupation(String currentOcupation) {
        this.currentOcupation = currentOcupation;
    }

    public String getFieldsStudy() {
        return fieldsStudy;
    }

    public void setFieldsStudy(String fieldsStudy) {
        this.fieldsStudy = fieldsStudy;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public boolean isGraduate() {
        return graduate;
    }

    public void setGraduate(boolean graduate) {
        this.graduate = graduate;
    }

    public String getCurrentAdress() {
        return currentAdress;
    }

    public void setCurrentAdress(String currentAdress) {
        this.currentAdress = currentAdress;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public String getFullNameEmergencyContact() {
        return fullNameEmergencyContact;
    }

    public void setFullNameEmergencyContact(String fullNameEmergencyContact) {
        this.fullNameEmergencyContact = fullNameEmergencyContact;
    }

    public String getNumberEmergencyContact() {
        return numberEmergencyContact;
    }

    public void setNumberEmergencyContact(String numberEmergencyContact) {
        this.numberEmergencyContact = numberEmergencyContact;
    }

    public String getEmailEmergencyContact() {
        return emailEmergencyContact;
    }

    public void setEmailEmergencyContact(String emailEmergencyContact) {
        this.emailEmergencyContact = emailEmergencyContact;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    
    
    
}
