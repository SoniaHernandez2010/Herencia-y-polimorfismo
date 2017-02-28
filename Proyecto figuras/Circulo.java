import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo extends Figura
{
    private float radio;
    
    /* public void calculaArea()
    {
        area = 3.1416f * (radio * radio);
    }
    
    public String dimeInfo()
    {
        return "Circulo" + super.dimeInfo();
    }
    
    @Override
    public String toString()
    {
        return "Circulo con area =" + super.toString();
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Circulo)
        {
            return this.radio == ((Circulo)obj).radio;
        }
        else
        {
            return false;
        }
    } */
    
    public Circulo(int x, int y, float r)
    {
        super(x, y);
        radio = r;
    }
    
    @Override
    public void dibuja(Graphics g)
    {
    }
}

