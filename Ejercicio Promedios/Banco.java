import java.util.ArrayList;

public class Banco
{
    private ArrayList<CuentaBancaria> cuentas;
    
    public Banco()
    {
        cuentas = new ArrayList<CuentaBancaria> ();
    }
    
    public void agregaCuenta(CuentaBancaria c)
    {
        cuentas.add(c);
    }
    
    public float calculaPromedio()
    {
        CuentaBancaria [] arrCuentas;
        
        arrCuentas = new CuentaBancaria[cuentas.size()];
        for(int i = 0; i < cuentas.size(); i++)
        {
            arrCuentas[i] = cuentas.get(i);
        }
        
        return Utileria.calculaPromedio(arrCuentas[]);
    }
    
}
