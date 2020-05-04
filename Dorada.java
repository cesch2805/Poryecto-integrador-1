public class Dorada extends Banco
{
    
    public double RetCuenta(double c)
    {
        return (c * 0.05) + c;
        
    }
    public double CalInterest(double c)
    {
       return c * 0.05; 
    }
}
