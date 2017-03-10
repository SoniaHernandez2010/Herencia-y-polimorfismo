import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

public class Ventana extends JFrame
{
   private Lienzo dibujo;
   private Timer tiempo;
   
    public Ventana(int ancho, int alto)
   {
       this.setSize(ancho, alto);
       dibujo = new Lienzo();
       this.add(dibujo);
       EscuchadorTeclado escuchaTeclado = new EscuchadorTeclado();
       this.addKeyListener(escuchaTeclado);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       EscuchadorTiempo escuchaTiempo = new EscuchadorTiempo();
       tiempo = new Timer(1000, escuchaTiempo);
       tiempo.start();
   }
   
   class EscuchadorTiempo implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            //System.out.println("Hola pelota");
            // pelota.muevete(); // cambia de posicion
            // this.repaint();
        }
    }
    
    class EscuchadorTeclado implements KeyListener
    {
        @Override
        public void keyPressed(KeyEvent e)
        {
            //System.out.println("keyPressed: " + e.getKeyChar());
            if(e.getKeyChar() == 'd')
            {
                tiempo.stop();
            }
            
            else if(e.getKeyChar() == 'i')
            {
                tiempo.start();
            }
        }
        
        @Override
        public void keyReleased(KeyEvent e)
        {
            System.out.println("keyReleased: " + e.getKeyChar());
        }
        
        @Override
        public void keyTyped(KeyEvent e)
        {
            System.out.println("keyTyped: " + e.getKeyChar());
        }
    }
}
