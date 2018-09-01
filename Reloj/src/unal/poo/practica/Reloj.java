package unal.poo.practica;

import becker.robots.*;

public class Reloj {
    public static City objetos;
    public static Robot estudiante;
        
	public static void main (String[] args){
       
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            estudiante = new Robot(objetos,6, 2, Direction.NORTH,10);
            
            int[][] numeros = {{0,1,2,3,4,5,0},{0,0,0,0,4,5,0},{0,1,0,3,4,0,6},{0,0,0,3,4,5,6},{0,0,2,0,4,5,6},{0,0,2,3,0,5,6},{0,1,2,3,0,5,6},{0,0,0,3,4,5,0},{0,1,2,3,4,5,6},{0,0,2,3,4,5,6}};
            int[] t = puntos();
            salir();
            int[] r = puntos();
            salir();
            int[] s = puntos();
            salir();
            
            int q = comparar(numeros, t); 
            int o = comparar(numeros, r); 
            int p = comparar(numeros, s); 
            System.out.println(q*100+o*10+p*1);
            
        }

    /**
     *
     * @return
     */
    public static int[] puntos(){
            int puntos[] = new int[7];
            estudiante.move();
            estudiante.turnLeft();
            int c = 0;
            for(int i=0;i<2;i++){
                puntos[c] = puedeRecoger(c); 
                c++;
                estudiante.move();
                turnRight();
                estudiante.move();
                puntos[c] = puedeRecoger(c);
                c++;
                estudiante.move();
                estudiante.move();
                puntos[c] = puedeRecoger(c);
                c++;
                estudiante.move();
                turnRight();
                estudiante.move();
            }
            turnRight();
            estudiante.move();
            estudiante.move();
            puntos[c] = puedeRecoger(c);
            return puntos;
        }
        
        public static void turnRight(){
            for(int i = 0;i<3;i++){
                estudiante.turnLeft();
            }
        }
        
        public static int puedeRecoger(int c){
            if(estudiante.canPickThing()==true)
                return c;
            else
                return 0;
        }
        
        public static int comparar(int numero[][], int puntos[]){
            int g = 0;
            boolean bandera = true;
            for(int i=0;i<10 && bandera==true;i++){
                boolean y = true;
                for(int j=0;j<7;j++){
                    if(numero[i][j]!=puntos[j])
                        y = y && false;
                }
                if(y == true){
                    bandera = false;
                }else{
                    g++;
                }
            }
            return g;
        }
        
        public static void salir(){
            estudiante.turnLeft();
            estudiante.turnLeft();
            for(int l=0;l<2;l++){
                for(int i=0;i<3;i++){
                estudiante.move();
                }
                estudiante.turnLeft();
            }
        }
        
}
