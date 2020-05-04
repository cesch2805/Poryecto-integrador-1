public class Regular extends Banco
{
    public double RetCuenta(double c)
    {
        return ((c * 0.06) + 100) + c;
        
    }
    
    public double CalInterest(double c)
    {
        return (c * 0.06) + 100;
    }
    
}
