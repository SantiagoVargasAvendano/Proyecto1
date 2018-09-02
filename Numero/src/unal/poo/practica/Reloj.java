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
            boolean t = true;
            while(t==true){
                int[] r = puntos();
                salir();
                int o = comparar(numeros, r);
                System.out.println(o);
                t = seguir();
            }
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
            for(int i=0;i<3;i++){
                estudiante.move();
            }
            estudiante.turnLeft();           
        }
        
        public static boolean seguir(){
            estudiante.move();
            estudiante.move();
            estudiante.turnLeft();
            if(estudiante.frontIsClear()==false){
                turnRight();
                estudiante.move();
                estudiante.turnLeft();
                return true;
            }else
                return false;
        }
        
}
