/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploBase;
import ch.aplu.turtle.*;
import java.awt.Color;
import static java.lang.Math.sqrt;
import static java.lang.Math.atan;

class Formas extends TurtleFrame{

Formas(){  
    Turtle a = new Turtle(this);
    Turtle b = new Turtle(this);
    Turtle c = new Turtle(this);
    Turtle d = new Turtle(this);
    a.hideTurtle();
    b.hideTurtle();
    c.hideTurtle();
    d.hideTurtle();    
    a.setPenColor(Color.red);
    b.setPenColor(Color.blue);
    c.setPenColor(Color.green);
    d.setPenColor(Color.black);
    drawRects(a);
    drawCircle(b);
    drawTriangles(c);
    drawLines(d);
}

private void drawRects(final Turtle pp){
    new Thread(){
        public void run(){
            pp.right(90);
            pp.setPos(-100, 150);
            rect(70, 40, pp);
            pp.setPos(-105, 110);
            rect(40, 40, pp);
            pp.setPos(-65, 110);
            rect(40, 40, pp);
            pp.setPos(-100, 70);
            rect(70, 40, pp);
            pp.setPos(-115, -60);
            rect(50, 25, pp);
            pp.setPos(-65, -60);
            rect(50, 25, pp);
            pp.setPos(-140, 130);
            rect(25, 25, pp);
            pp.setPos(-15, 130);
            rect(25, 25, pp);
        }
    }
    .start();
}

private void drawTriangles(final Turtle pp){
    new Thread(){
        public void run(){
            pp.right(90);
            pp.setPos(-110, 30);
            triangleISo(90, 40, pp);
            pp.right(270);
            pp.setPos(-135, 25);
            triangleRect1(15, 30, pp);
            pp.setPos(-10, 25);
            triangleRect2(15, 30, pp);
        }
    }
    .start();
}

private void drawLines(final Turtle pp){
    new Thread(){
        public void run(){
            pp.right(180);
            pp.setPos(-65, -10);
            line(50, pp);
            pp.setPos(-95, 30 - 15.22);
            line(90 - 15.22, pp);
            pp.setPos(-35, 30 - 15.22);
            line(90 - 15.22, pp);
            pp.setPos(-135, 105);
            line(80, pp);
            pp.setPos(-120, 105);
            line(80, pp);
            pp.setPos(-10, 105);
            line(80, pp);
            pp.setPos(5, 105);
            line(80, pp);
        }
    }
    .start();
}

private void drawCircle(final Turtle pp){
    new Thread(){
        public void run(){
            pp.setPos(-80, 130);
            circulo(0.25, pp);
            pp.setPos(-60, 130);
            circulo(0.25, pp);
        }
    }
    .start();
}

void rect(int x, int y,Turtle pp){
    for(int i=0;i<2;i++){
        pp.forward(x);
        pp.right(90);
        pp.forward(y);
        pp.right(90);
    }
}

void line(double x,Turtle pp){
    pp.forward(x);
}

void triangleISo(double b, double h, Turtle pp){
    pp.forward(b);
    double g = atan(h/(b/2))*(180/3.141592);
    pp.right(180-g);
    double f = sqrt(((b/2)*(b/2))+(h*h));
    pp.forward(f);
    pp.right(180-(180-(2*g)));
    pp.forward(f);
    pp.right(270-g);
}

void triangleRect1(double b, double h, Turtle pp){
    pp.forward(b);
    pp.right(90);
    pp.forward(h);
    double g = atan(b/h)*(180/3.141592);
    pp.right(180-g);
    double f = sqrt((b*b)+(h*h));
    pp.forward(f);
    pp.right(90+g);
}

void triangleRect2(double b, double h, Turtle pp){
    pp.forward(b);
    double g = atan(h/b)*(180/3.141592);
    pp.right(180-g);
    double f = sqrt((b*b)+(h*h));
    pp.forward(f);
    pp.right(90+g);
    pp.forward(h);
}

void circulo(double r, Turtle pp){
    for(int i=0;i<100;i++){
        pp.right(3.6);
        pp.forward(r);
    }
}

public static void main(String[] args){
    new Formas();    
}

