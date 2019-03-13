/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloNegocio;

/**
 *
 * @author Lenovo
 */
public class Consulta {
    private String consulta;

    public Consulta(String consulta) {
        this.consulta = consulta;
    }
       
    public String getStringConsulta(String nombreTabla){
        return this.consulta="SELECT * FROM "+nombreTabla;
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
}
