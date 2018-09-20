import java.util.Scanner;
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
public class Main {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese un tipo de transaccion: ");
        String code = lectura.next();
        Type tipo = new Type(code);
        System.out.println("Ingrese un segundo tipo de transaccion: ");
        String code2 = lectura.next();
        Type tipo2 = new Type(code2);
        ArrayList<Type> tipos = new ArrayList<Type>();
        tipos.add(0, tipo);
        tipos.add(1, tipo2);
  
        
        System.out.println("Ingrese el dia del movimiento: ");
        int diamov = lectura.nextInt();
        System.out.println("Ingrese el mes del movimiento: ");
        int mesmov = lectura.nextInt();
        System.out.println("Ingrese el año del movimiento: ");
        int anniomov = lectura.nextInt();
        Fecha fechamov = new Fecha(diamov,mesmov,anniomov);
        System.out.println("Ingrese el saldo deque tenia: ");
        double saldomov = lectura.nextDouble();
        System.out.println("Ingrese el saldo a consignar: ");
        double consignar = lectura.nextDouble();
        Movimiento movimiento = new Movimiento(fechamov, saldomov, consignar, tipo);
        
        System.out.println("Ingrese el dia del movimiento: ");
        int diamov2 = lectura.nextInt();
        System.out.println("Ingrese el mes del movimiento: ");
        int mesmov2 = lectura.nextInt();
        System.out.println("Ingrese el año del movimiento: ");
        int anniomov2 = lectura.nextInt();
        Fecha fechamov2 = new Fecha(diamov2,mesmov2,anniomov2);
        System.out.println("Ingrese el saldo deque tenia: ");
        double saldomov2 = lectura.nextDouble();
        System.out.println("Ingrese el saldo a consignar: ");
        double consignar2 = lectura.nextDouble();
        Movimiento movimiento2 = new Movimiento(fechamov2, saldomov2, consignar2, tipo2);
        
        ArrayList<Movimiento> movimientos = new ArrayList<Movimiento>();
        movimientos.add(0, movimiento);
        movimientos.add(1, movimiento);
        
        System.out.println("Ingrese el numero de la primera cuenta: ");
        int numcuenta = lectura.nextInt();
        System.out.println("Ingrese el saldo de la primera cuenta: ");
        double saldo = lectura.nextDouble();
        System.out.println("Ingrese el dia de creacion de la primera cuenta: ");
        int dia = lectura.nextInt();
        System.out.println("Ingrese el mes de creacion de la primera cuenta: ");
        int mes = lectura.nextInt();
        System.out.println("Ingrese el año de creacion de la primera cuenta: ");
        int annio = lectura.nextInt();
        Fecha fechacreacion = new Fecha(dia,mes,annio);
        System.out.println("Ingrese el nombre del cliente de la primera cuenta: ");
        String nomcliente = lectura.next();
        Cuenta cuenta = new Cuenta(numcuenta, saldo, fechacreacion, nomcliente, movimientos);
        
        System.out.println("Ingrese el dia del movimiento: ");
        int diamov3 = lectura.nextInt();
        System.out.println("Ingrese el mes del movimiento: ");
        int mesmov3 = lectura.nextInt();
        System.out.println("Ingrese el año del movimiento: ");
        int anniomov3 = lectura.nextInt();
        Fecha fechamov3 = new Fecha(diamov3,mesmov3,anniomov3);
        System.out.println("Ingrese el saldo que tenia: ");
        double saldomov3 = lectura.nextDouble();
        System.out.println("Ingrese el saldo a consignar: ");
        double consignar3 = lectura.nextDouble();
        Movimiento movimiento3 = new Movimiento(fechamov3, saldomov3, consignar3, tipo);
        
        System.out.println("Ingrese el dia del movimiento: ");
        int diamov4 = lectura.nextInt();
        System.out.println("Ingrese el mes del movimiento: ");
        int mesmov4 = lectura.nextInt();
        System.out.println("Ingrese el año del movimiento: ");
        int anniomov4 = lectura.nextInt();
        Fecha fechamov4 = new Fecha(diamov4,mesmov4,anniomov4);
        System.out.println("Ingrese el saldo que tenia: ");
        double saldomov4 = lectura.nextDouble();
        System.out.println("Ingrese el saldo a consignar: ");
        double consignar4 = lectura.nextDouble();
        Movimiento movimiento4 = new Movimiento(fechamov4, saldomov4, consignar4, tipo2);
        
        ArrayList<Movimiento> movimientos2 = new ArrayList<Movimiento>();
        movimientos.add(0, movimiento3);
        movimientos.add(1, movimiento4);

        System.out.println("Ingrese el numero de la segunda cuenta: ");
        int numcuenta2 = lectura.nextInt();
        System.out.println("Ingrese el saldo de la segunda cuenta: ");
        double saldo2 = lectura.nextDouble();
        System.out.println("Ingrese el dia de creacion de la segunda cuenta: ");
        int dia2 = lectura.nextInt();
        System.out.println("Ingrese el mes de creacion de la segunda cuenta: ");
        int mes2 = lectura.nextInt();
        System.out.println("Ingrese el año de creacion de la segunda cuenta: ");
        int annio2 = lectura.nextInt();
        Fecha fechacreacion2 = new Fecha(dia2,mes2,annio2);
        System.out.println("Ingrese el nombre del cliente de la segunda cuenta: ");
        String nomcliente2 = lectura.next();
        Cuenta cuenta2 = new Cuenta(numcuenta2, saldo2, fechacreacion2, nomcliente2, movimientos2);
        
        ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
        cuentas.add(0, cuenta);
        cuentas.add(1, cuenta2);
    
        Banco banco = new Banco("Bancounal",tipos,cuentas);
        
        
    }
}
