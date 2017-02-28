import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangulo extends Figura
{
    private float base;
    private float altura;
    
    public Triangulo(float a, float b)
    {
        base = b;
        altura = a;
    }
    
    public void calculaArea()
    {
        area = base * altura / 2;
    }
    
    @Override
    public String toString()
    {
        return "Triangulo con area =" + super.toString();
    }
    
    @Override
    public void dibuja(Graphics g)
    {
    }
}
