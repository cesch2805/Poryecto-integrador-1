import java.util.Scanner;
public abstract class Banco
{

    public abstract double RetCuenta(double c);

    public double DepCuenta(double c)
    {
        return c; 
    }

    public abstract double CalInterest(double c);

    public void GetSal(double c)
    {
        System.out.println(c);
    }
}
