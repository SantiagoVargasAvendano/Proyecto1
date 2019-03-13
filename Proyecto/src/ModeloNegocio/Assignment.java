package ModeloNegocio;

import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public abstract class Assignment {
    protected String role;
    protected String calification;
    protected String note;
    
    public Assignment(String role, String calification, String note) {
        this.role = role;
        this.calification = calification;
        this.note = note;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCalification() {
        return calification;
    }

    public void setCalification(String calification) {
        this.calification = calification;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
}
