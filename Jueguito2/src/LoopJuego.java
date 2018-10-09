
import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;
import modelo.Carro;

/**
 *
 * @author Estudiante
 */
public class LoopJuego extends AnimationTimer{
    private Scene escena;
    private GraphicsContext lapiz;
    private Carro carro;
    private Image fondo;
    private Image cat;
    private Image nene;
    private int posFondo = 1024;
    private int secuencia = 0;
    private int contador = 0;
    private int moverse = 994;
    private int moverse2 = 473;
    
    private ArrayList<String> pulsacionTeclado = null;

    public LoopJuego(Scene escena, GraphicsContext lapiz) {
        this.lapiz = lapiz;
        this.escena = escena;
        this.carro = new Carro(0, 0, 110, 60);
        this.fondo = new Image("image/fondo.png");
        this.cat = new Image("image/cats.gif");
        this.nene = new Image("image/down1.png");
          
        pulsacionTeclado = new ArrayList<>();
                
        
        
        escena.setOnKeyPressed(
            new EventHandler<KeyEvent>()
            {
                public void handle(KeyEvent e)
                {
                    String code = e.getCode().toString();
                    if ( !pulsacionTeclado.contains(code) )
                        pulsacionTeclado.add( code );
                }
            });

        escena.setOnKeyReleased(
            new EventHandler<KeyEvent>()
            {
                public void handle(KeyEvent e)
                {
                    String code = e.getCode().toString();
                    pulsacionTeclado.remove( code );
                }
            });
        
    }
    
    
    @Override
    public void handle(long now) {
         //Carro
        lapiz.clearRect(0, 0, 1024, 512);
        lapiz.drawImage(this.fondo, this.posFondo-1024, 0);
        lapiz.drawImage(this.fondo, this.posFondo, 0);
        if (this.posFondo<=0) {
            this.posFondo=1024;
        }else{
            this.posFondo--;
        }
        lapiz.drawImage(cat, this.secuencia*132, 0, 132, 80, this.carro.getXref(), this.carro.getYref(), 132, 80);
        lapiz.strokeRect(this.carro.getXref(), this.carro.getYref(), this.carro.getAncho(), this.carro.getAlto());
        if (pulsacionTeclado.contains("LEFT"))
                   carro.moverIzquierda();
                if (pulsacionTeclado.contains("RIGHT"))
                    carro.moverDerecha();
                if (pulsacionTeclado.contains("UP"))
                    carro.moverArriba();
                if (pulsacionTeclado.contains("DOWN"))
                    carro.moverAbajo();
        
        lapiz.drawImage(nene, moverse, moverse2);
        lapiz.strokeRect(moverse, moverse2, 30, 39);
        if(this.contador%4==0){
            if(this.secuencia<5)
                this.secuencia++;
            else
                this.secuencia = 0;
        }
        this.contador++;
        
        if(this.carro.getXref()>1024-this.carro.getAncho())
            this.carro.setXref(1024-this.carro.getAncho());
        if(this.carro.getXref()<0)
            this.carro.setXref(0);
        if(this.carro.getYref()>512-this.carro.getAlto())
            this.carro.setYref(512-this.carro.getAlto());
        if(this.carro.getYref()<0)
            this.carro.setYref(0);
        
        Shape sChasis = new Rectangle(carro.getXref(), carro.getYref(), carro.getAncho(), carro.getAlto());
        Shape sObstaculo = new Rectangle(moverse, moverse2, 30, 39);
        Shape intersection = SVGPath.intersect(sChasis, sObstaculo);
        
         if (intersection.getBoundsInLocal().getWidth() != -1) {
            stop();
            lapiz.clearRect(0, 0, 1024, 512);
            lapiz.fillText("Ganaste", 512, 264);
         }
         if(contador%100==0){
            this.moverse = (int) (Math.random() * 1024);
            this.moverse2 = (int) (Math.random() * 512);
         }
    }
}
