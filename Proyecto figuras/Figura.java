import java.awt.Graphics;

/**
 * Write a description of class Figura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Figura
{
    /* protected float area;
    
    public Figura()
    {
        area = 0;
    }
    
    public float accedeArea()
    {
        return area;
    }
    
    void calculaArea()
    {
        System.out.println("Ups!");
    }
    
    public String dimeInfo()
    {
        return "" + area;
    }
    
    @Override
    public String toString()
    {
        return "" + area;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        return this.area == ((Figura)obj).area;
    } */
    
    private int posx;
    private int posy;
    
    public Figura(int x, int y)
    {
        posx = x;
        posy = y;
    }
    
    protected int dimeX()
    {
        return posx;
    }
    
    protected int dimeY()
    {
        return posy;
    }
    
    public abstract void dibuja(Graphics g);
    
}
