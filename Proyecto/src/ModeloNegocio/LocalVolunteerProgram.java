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
public class LocalVolunteerProgram extends Assignment{
    private ArrayList<VolunteerPrograms> voluntariadoIds;
    private ArrayList<PersonalInformation> voluntariosIds;

    public LocalVolunteerProgram(ArrayList<String> voluntariadoIds, ArrayList<String> Ids, String role, String calification, String note) {
        super(role, calification, note);
        this.voluntariadoIds = new ArrayList<VolunteerPrograms>();
        this.voluntariosIds= new ArrayList<PersonalInformation>();
    }

    
}
