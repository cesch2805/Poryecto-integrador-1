import java.util.Scanner;
public class ExamenTres
{

    static String entrada, letras="";
    static Scanner leer = new Scanner(System.in);
    
    public static void main()
    {
        System.out.print('\u000c');
        int n;
        n = leer.nextInt();
        entrada = leer.nextLine();
        for(int i= 0; i <n; i ++)
        {
            entrada = leer.nextLine();
            Deco();
            System.out.println("Phrase " +(i+1) + ": " +  letras); 

        }
    }

    
    
    public static void Deco()
    {
        

        letras = entrada.replace("123457","A");
        letras = letras.replace("1234567","B");
        letras = letras.replace("12456","E");
        letras = letras.replace("23456","Z");
        letras = letras.replace("456","C");
        letras = letras.replace("1580","D");

        letras = letras.replace("1249","F");
        letras = letras.replace("12569","G");
        letras = letras.replace("13457","H");
        letras = letras.replace("1379","V");
        letras = letras.replace("37","I");
        letras = letras.replace("123567","O");
        letras = letras.replace("13567","U");
        letras = letras.replace("3567","J");
        letras = letras.replace("13459","K");
        letras = letras.replace("156","L");
        letras = letras.replace("12357","M");
        letras = letras.replace("135790","W");
        letras = letras.replace("3579","N");

        letras = letras.replace("1458","P");
        letras = letras.replace("12347","Q");
        letras = letras.replace("123459","R");
        letras = letras.replace("12467","S");
        letras = letras.replace("278","T");
        letras = letras.replace("90","X");
        letras = letras.replace("1347","Y");
        letras = letras.replace("0", " ");

        //System.out.println(letras);

        //1234571234567456158012456124912569134573735671345915612357
        //35791235671458123471234591246727813567137913579090134723456

    }
}
