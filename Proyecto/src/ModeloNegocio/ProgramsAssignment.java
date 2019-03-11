package ModeloNegocio;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class ProgramsAssignment extends Assignment{
    private String numRegistro;
    private String ID;
    private ArrayList<String> campsIds;
    private ArrayList<String> Ids;

    public ProgramsAssignment(String role, String calification, String note) {
        super(role, calification, note);
    }
}
