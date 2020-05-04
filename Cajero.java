import java.util.Scanner;
public  class Cajero extends Banco
{
    static double saldoI,saldo = 0, depositar;
    static String nombre, tarjeta;
    Dorada d = new Dorada();
    Regular r = new Regular();
    public static void main() 
    {
        System.out.print('\u000c');
        int i;
        boolean salir = false;

        saldo = 0;
        Cajero funciones = new Cajero();
        Scanner leer = new Scanner(System.in);

        System.out.println("Introduzca su nombre");
        nombre = leer.next();

        System.out.println("Introduzca su saldo Inicial");
        saldoI = leer.nextDouble();
        saldo += saldoI;

        System.out.print("Elija su tarjeta (Dorada o Regular)");
        tarjeta = leer.next();

        //while(!salir)
        //{
        /*System.out.println("1. Opcion 1");
        System.out.println("2. Opcion 2");
        System.out.println("3. Opcion 3");
        System.out.println("4. Opcion 4");
        System.out.println("5. Salir");*/

        System.out.println("¿Que desea realizar?");
        i = leer.nextInt();

        switch (i)
        {
            case 1: System.out.println("Retirar de Cuenta");
            depositar = leer.nextDouble();
            if(tarjeta.equals("Regular") && (saldo<(((depositar * 0.06) + 100) + depositar)))
            {
                System.out.println("Operacion no valida. Su tarjeta no tiene el capital necesario");
            } else 
            {
                saldo -= funciones.RetCuenta(depositar);
            }
            break;

            case 2: System.out.println("Depositar en Cuenta");
            System.out.println("Cuanto desea ingresar a su cuenta");
            depositar = leer.nextDouble();
            saldo += funciones.DepCuenta(depositar);
            break;

            case 3: System.out.println("CalcularInteres");
            break;

            case 4: System.out.println("Obtener Saldo");
                    funciones.GetSal(saldo);
            break;

            case 5: salir = true;
            break;

            default: System.out.println("Seleccione una de las cuatro opciones");

        }
        //}
    }

    public double RetCuenta(double c)
    {
        double retirar;
        if(tarjeta.equals("Dorada"))
        {
            retirar = d.CalInterest(depositar);
        }else 
        {
            retirar = r.CalInterest(depositar);

        }
        return retirar;
    }

    public double CalInterest(double c)
    {
        double interes;
        if(tarjeta.equals("Dorada"))
        {
            interes = d.CalInterest(depositar);  
        }else 
        {
            interes = r.CalInterest(depositar); 
        }
        return interes;
    }
}
