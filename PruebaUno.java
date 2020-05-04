import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import java.util.*;
public class PruebaUno extends JFrame implements ActionListener
{
    private  JButton btnArea, btnTiempo, btnLongitud, btnMasa, btnVel, btnTemp;
    private  JLabel lblTitulo, lblSub;
    
    
     public PruebaUno()
    {
        setLayout(null);
        this.setTitle("Conversor de unidades");
        setBounds(320, 190, 740, 400);
        //BOTONES MENU
        btnArea = new JButton("Area");
        btnArea.setBounds(10,90,100,30);
        add(btnArea);
        
        btnTiempo = new JButton("Tiempo");
        btnTiempo.setBounds(120,90,100,30);
        add(btnTiempo);
        
        btnLongitud = new JButton("Longitud");
        btnLongitud.setBounds(230,90,100,30);
        add(btnLongitud);
        
        btnMasa = new JButton("Masa");
        btnMasa.setBounds(340,90,100,30);
        add(btnMasa);
        
        btnVel = new JButton("Velocidad");
        btnVel.setBounds(450,90,100,30);
        add(btnVel);
        
        btnTemp = new JButton("Temperatura");
        btnTemp.setBounds(560,90,150,30);
        add(btnTemp);
        
        JLabel lblTitulo = new JLabel();
        lblTitulo.setText("Conversor de Unidades");
        lblTitulo.setBounds(210,20,350,30);
        lblTitulo.setFont(new Font ("TimesRoman", Font.BOLD, 25));
        lblTitulo.setForeground(Color.blue);
        add(lblTitulo);
        
        lblSub = new JLabel();
        lblSub.setText("Selecciona la unidad que deseas convertir");
        lblSub.setBounds(210,50,350,30);
        lblSub.setFont(new Font ("Tahoma", Font.ITALIC, 15));
        lblSub.setForeground(Color.black);
        add(lblSub);
        
        btnArea.addActionListener(this);
        btnTiempo.addActionListener(this);
        btnLongitud.addActionListener(this);
        btnMasa.addActionListener(this);
        btnVel.addActionListener(this);
        btnTemp.addActionListener(this);
        
        setResizable(false);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btnArea)
        {
            this.dispose();
            Area a = new Area();
            a.setVisible(true);
        }
        else if(e.getSource() == btnTiempo)
        {
           this.dispose();
           Tiempo v = new Tiempo();
           v.setVisible(true);
        }
        else if (e.getSource() == btnLongitud)
        {
            this.dispose();
            Longitud l = new Longitud();
            l.setVisible(true);
        }
        else if (e.getSource() == btnMasa)
        {
            this.dispose();
            Masa m = new Masa();
            m.setVisible(true);
        }
        else if (e.getSource() == btnVel)
        {
          this.dispose();
            Velocidad ve = new Velocidad();
            ve.setVisible(true);  
        }
        else if (e.getSource() == btnTemp)
        {
          this.dispose();
          Temperatura t = new Temperatura();
          t.setVisible(true);
        }
        
    }
}
 class Area extends JFrame implements ActionListener
{
    private  JButton btnConvert, btnBack;
    private JTextField txtValor1;
    private JLabel lblR, lblS, lbl3, lbl4;
    private JComboBox c1, c2;
    private PruebaUno p = new PruebaUno();
    
    public Area()
    {
        
        setBounds(320, 190, 740, 400);
        setLayout(null);
        
        lblS = new JLabel();
        lblS.setText("Ingresa Unidad");
        lblS.setBounds(60,20,350,30);
        lblS.setFont(new Font ("Tahoma", Font.CENTER_BASELINE, 15));
        lblS.setForeground(Color.black);
        add(lblS);
        
        lbl3 = new JLabel();
        lbl3.setText("Selecciona la unidad que tienes ");
        lbl3.setBounds(40,95,350,30);
        lbl3.setFont(new Font ("Tahoma", Font.ITALIC, 15));
        lbl3.setForeground(Color.red);
        add(lbl3);
        
        lbl4 = new JLabel();
        lbl4.setText("Selecciona la unidad que quieres obtener ");
        lbl4.setBounds(420,95,350,30);
        lbl4.setFont(new Font ("Tahoma", Font.ITALIC, 15));
        lbl4.setForeground(Color.red);
        add(lbl4);
        
        lblR = new JLabel();
        lblR.setBounds(325, 230, 145, 30);
        lblR.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 15));
        lblR.setForeground(Color.black);
        add(lblR);
        
        txtValor1 = new JTextField();
        txtValor1.setBounds(60, 50,100,30);
        add(txtValor1);
        
        btnConvert = new JButton("Convertir");
        btnConvert.setBounds(280,190,145,30);
        add(btnConvert);
        
        btnBack = new JButton("Regresar");
        btnBack.setBounds(15,320,100,30);
        add(btnBack);
        
        btnBack.addActionListener(this);
        
        String s [] = {"Kilometros cuadrados", "Metros cuadrados", "Millas cuadradas", "Yardas cuadradas", "Pies cuadrados", "Pulgadas cuadradas"};
        c1 = new JComboBox();
        c1.setFont(new Font("Tahoma", Font.BOLD, 13));
        c1.setBounds(60, 125, 170, 40);
        c1.setModel(new DefaultComboBoxModel(s));
        add(c1);
        
        c2 = new JComboBox();
        c2.setFont(new Font("Tahoma", Font.BOLD, 13));
        c2.setBounds(475, 125, 170, 40); 
        c2.setModel(new DefaultComboBoxModel(s));
        add(c2); 
        
        c1.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                
            }
         }
         );
        c2.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                
            }
         }
         );
        btnConvert.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
            String lista1 = (String) c1.getSelectedItem();
            String lista2 = (String) c2.getSelectedItem();
            String valC = txtValor1.getText();
            String resultado = formula(lista1, lista2, valC);
            lblR.setText(resultado);
          }
        }
        );
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btnBack)
        {
            this.dispose();
            PruebaUno p = new PruebaUno();
            p.setVisible(true);
            
        }
        
    }
    
     public String formula(String a, String b, String v1)
    {
        
        double num = Double.parseDouble(v1);
        double form;
        String res = "0";
        switch (a)
        {
        case "Kilometros cuadrados":   switch (b)
                       {
                           case "Kilometros cuadrados": res = String.valueOf(num);break;
                           case "Metros cuadrados": form = (num * 1e+6);                    
                                      res = String.valueOf(form);break;
                           case "Millas cuadradas": form = (num / 2.59);                    
                                      res = String.valueOf(form); break;
                           case "Yardas cuadradas":form = (num * 1.196e+6);                    
                                      res = String.valueOf(form);break;
                           case "Pies cuadrados":  form = (num * 1.076e+7);                    
                                      res = String.valueOf(form); break;
                           case "Pulgadas cuadradas": form = (num * 1.55e+9);                    
                                      res = String.valueOf(form); break;                      
                       }
                       break;
           case "Metros cuadrados":   switch (b)
                       {
                           case "Kilometros cuadrados": form = (num / 1e+6);
                                     res = String.valueOf(form);  break;
                           case "Metros cuadrados": res = String.valueOf(num);  break;
                           case "Millas cuadradas": form = (num / 2.59e+6);                    
                                      res = String.valueOf(form); break;
                           case "Yardas cuadradas":form = (num * 1.196);                    
                                      res = String.valueOf(form); break;
                           case "Pies cuadrados": form = (num * 10.764);                    
                                      res = String.valueOf(form); break;
                           case "Pulgadas cuadradas": form = (num * 1550.003);                    
                                      res = String.valueOf(form); break;         
                       }
                       break;
            case "Millas cuadradas":  switch (b)
                       {
                           case "Kilometros cuadrados": form = (num * 2.59);
                                     res = String.valueOf(form); break;
                           case "Metros cuadrados": form = (num * 2.59e+6);
                                      res = String.valueOf(form); break;
                           case "Millas cuadradas": res = String.valueOf(num); break;
                           case "Yardas cuadradas":form = (num *  3.098e+6);                    
                                      res = String.valueOf(form); break;
                           case "Pies cuadrados": form = (num *  2.788e+7);                    
                                      res = String.valueOf(form); break;
                           case "Pulgadas cuadradas": form = (num * 4.014e+9);                    
                                      res = String.valueOf(form); break;            
                       }
                       break;
        case "Yardas cuadradas":  switch (b)
                      {
                          case "Kilometros cuadrados": form = (num / 1.196e+6);
                                    res = String.valueOf(form); break;
                          case "Metros cuadrados":form = (num / 1.196);
                                    res = String.valueOf(form); break;
                          case "Millas cuadradas":form = (num / 3.098e+6);
                                    res = String.valueOf(form); break;
                          case "Yardas cuadradas":res = String.valueOf(num); break;
                          case "Pies cuadrados":form = (num * 9);                    
                                    res = String.valueOf(form); break;
                          case "Pulgadas cuadradas":form = (num * 1296);                    
                                    res = String.valueOf(form);   break;   
             
            }
            break;
        case "Pies cuadrados":   switch (b)
            {
                          case "Kilometros cuadrados":form = (num/ 1.076e+7);
                                   res = String.valueOf(form);break;
                          case "Metros cuadrados":form = (num / 10.764);
                                    res = String.valueOf(form);break;
                          case "Millas cuadradas":form = (num /  2.788e+7);                    
                                    res = String.valueOf(form);break;
                          case "Yardas cuadradas":form = (num  / 9);                    
                                     res = String.valueOf(form);break;
                          case "Pies cuadrados":res = String.valueOf(num);break;
                          case "Pulgadas cuadradas":form = (num * 144);                    
                                    res = String.valueOf(form);break;            
            }
            break;
        case "Pulgadas cuadradas": switch(b)
                {
                    case "Kilometros cuadrados": form =(num / 1.55e+9);
                                                 res = String.valueOf(form);break;
                    case "Metros cuadrados":form = (num / 1550.003);
                                 res = String.valueOf(form);break;
                case "Millas cuadradas":form = (num / 4.014e+9);
                                  res = String.valueOf(form);break;
                case "Yardas cuadradas":form = (num / 1296);                    
                                  res = String.valueOf(form);break;
                case "Pies cuadrados":form = (num *144);                    
                                   res = String.valueOf(form);break;
                case "Pulgadas cuadradas":res = String.valueOf(num);break;                              
                }
                break;
                
                default: res = "ERROR";
            
        }        
        return res;
    }
}
class Tiempo extends JFrame implements ActionListener
{
    private  JButton  btnConvert, btnBack;
    private JTextField txtValor1;
    private JLabel lblR, lblS, lbl3, lbl4;
    private JComboBox c1, c2;
    private PruebaUno p = new PruebaUno();
       
    public Tiempo()
    {
        
        setBounds(320, 190, 740, 400);
        setLayout(null);
        setResizable(false);
        lblS = new JLabel();
        lblS.setText("Ingresa unidad");
        lblS.setBounds(60,20,350,30);
        lblS.setFont(new Font ("Tahoma", Font.CENTER_BASELINE, 15));
        lblS.setForeground(Color.black);
        add(lblS);
        
        lbl3 = new JLabel();
        lbl3.setText("Selecciona la unidad que tienes ");
        lbl3.setBounds(40,95,350,30);
        lbl3.setFont(new Font ("Tahoma", Font.ITALIC, 15));
        lbl3.setForeground(Color.red);
        add(lbl3);
        
        lbl4 = new JLabel();
        lbl4.setText("Selecciona la unidad que quieres obtener ");
        lbl4.setBounds(420,95,350,30);
        lbl4.setFont(new Font ("Tahoma", Font.ITALIC, 15));
        lbl4.setForeground(Color.red);
        add(lbl4);
        
        lblR = new JLabel();
        lblR.setBounds(325, 230, 145,30);
        lblR.setFont(new Font ("Tahoma", Font.CENTER_BASELINE, 15));
        lblR.setForeground(Color.black);
        add(lblR);
        
        
        txtValor1 = new JTextField();
        txtValor1.setBounds(60, 50,100,30);
        add(txtValor1);
        
        
        btnConvert = new JButton("Convertir");
        btnConvert.setBounds(280,190,145,30);
        add(btnConvert);
        
         
        btnBack = new JButton("Regresar");
        btnBack.setBounds(15,320,100,30);
        add(btnBack);
        
        btnBack.addActionListener(this);
        
        String s [] = {"Hora", "Minutos", "Segundos","Milisegundos" };
        c1 = new JComboBox();
        c1.setFont(new Font("Tahoma", Font.BOLD, 13));
        c1.setBounds(60, 125, 170, 40);
        c1.setModel(new DefaultComboBoxModel(s));
        add(c1);
        
        c2 = new JComboBox();
        c2.setFont(new Font("Tahoma", Font.BOLD, 13));
        c2.setBounds(475, 125, 170, 40); 
        c2.setModel(new DefaultComboBoxModel(s));
        add(c2); 
        
         c1.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                
            }
         }
         );
         c2.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                
            }
         }
         );
         btnConvert.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent e)
             {
                 
        
            String lista1 = (String) c1.getSelectedItem();
            String lista2 = (String) c2.getSelectedItem();
            String valC = txtValor1.getText();
            String resultado = formula(lista1, lista2, valC);
            lblR.setText(resultado);
            
        
             }
         }
         );
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btnBack)
        {
            this.dispose();
            PruebaUno p = new PruebaUno();
            p.setVisible(true);
            
        }
        
    }
    
    public String formula(String a, String b, String v1)
    {
        
        double num = Double.parseDouble(v1);
        double form;
        String res = "0";
        switch (a)
        {
        case "Hora":   switch (b)
                       {
                           case "Hora": res = String.valueOf(num);break;
                           case "Minutos": form = (num * 60);                    
                                      res = String.valueOf(form);break;
                           case "Segundos": form = (num * 3600);                    
                                      res = String.valueOf(form); break;
                           case "Milisegundos":form = (num * 3.6e+6);                    
                                      res = String.valueOf(form);break;
                                                 
                       }
                       break;
           case "Minutos":   switch (b)
                       {
                           case "Hora": form = (num / 60);
                                     res = String.valueOf(form);  break;
                           case "Minutos": res = String.valueOf(num);  break;
                           case "Segundos": form = (num * 60);                    
                                      res = String.valueOf(form); break;
                           case "Milisegundos":form = (num * 60000);                    
                                      res = String.valueOf(form); break;
                         
                       }
                       break;
            case "Segundos": switch (b)
                       {
                           case "Hora": form = (num / 3600);
                                     res = String.valueOf(form); break;
                           case "Minutos": form = (num / 60);
                                      res = String.valueOf(form); break;
                           case "Segundos": res = String.valueOf(num); break;
                           case "Milisegundos":form = (num *  1000);                    
                                      res = String.valueOf(form); break;
                                       
                       }
                       break;
        case "Milisegundos":  switch (b)
                      {
                          case "Hora": form = (num / 3.6e+6);
                                    res = String.valueOf(form); break;
                          case "Minutos":form = (num / 6000);
                                    res = String.valueOf(form); break;
                          case "Segundos":form = (num / 1000);
                                    res = String.valueOf(form); break;
                          case "Milisegundos":res = String.valueOf(num); break;  
             
            }
            break;
            
            default: res = "ERROR";
        }        
        return res;
    }
}
class Longitud extends JFrame implements ActionListener
{
    private  JButton btnConvert, btnBack;
    private JTextField txtValor1;
    private JLabel lblR, lblS, lbl3, lbl4;
    private JComboBox c1, c2;
    private PruebaUno p = new PruebaUno(); 
    public Longitud()
    {
        
        setBounds(320, 190, 740, 400);
        setLayout(null);
        setResizable(false);
        
        lblS = new JLabel();
        lblS.setText("Ingresa unidad");
        lblS.setBounds(60,20,350,30);
        lblS.setFont(new Font ("Tahoma", Font.CENTER_BASELINE, 15));
        lblS.setForeground(Color.black);
        add(lblS);
        
        lbl3 = new JLabel();
        lbl3.setText("Selecciona la unidad que tienes ");
        lbl3.setBounds(40,95,350,30);
        lbl3.setFont(new Font ("Tahoma", Font.ITALIC, 15));
        lbl3.setForeground(Color.red);
        add(lbl3);
        
        lbl4 = new JLabel();
        lbl4.setText("Selecciona la unidad que quieres obtener ");
        lbl4.setBounds(420,95,350,30);
        lbl4.setFont(new Font ("Tahoma", Font.ITALIC, 15));
        lbl4.setForeground(Color.red);
        add(lbl4);
        
        lblR = new JLabel();
        lblR.setBounds( 325, 230, 145, 30);
        lblR.setFont(new Font ("Tahoma", Font.CENTER_BASELINE,15));
        lblR.setForeground(Color.black);
        add(lblR);
        
        txtValor1 = new JTextField();
        txtValor1.setBounds(60, 50,100,30);
        add(txtValor1);
        
        
        btnConvert = new JButton("Convertir");
        btnConvert.setBounds(280,190,145,30);
        add(btnConvert);
        
        btnBack = new JButton("Regresar");
        btnBack.setBounds(15,320,100,30);
        add(btnBack);
        
        btnBack.addActionListener(this);
        
        String s [] = {"Kilometros", "Metros", "Millas", "Yardas", "Pies", "Pulgadas"};
        c1 = new JComboBox();
        c1.setFont(new Font("Tahoma", Font.BOLD, 13));
        c1.setBounds(60, 125, 170, 40);
        c1.setModel(new DefaultComboBoxModel(s));
        add(c1);
        
        c2 = new JComboBox();
        c2.setFont(new Font("Tahoma", Font.BOLD, 13));
        c2.setBounds(475, 125, 170, 40); 
        c2.setModel(new DefaultComboBoxModel(s));
        add(c2); 
        
        c1.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                
            }
         }
         );
        c2.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                
            }
         }
         );
        btnConvert.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
             String lista1 = (String) c1.getSelectedItem();
             String lista2 = (String) c2.getSelectedItem();
             String valC = txtValor1.getText();
             String resultado = formula(lista1, lista2, valC);
             lblR.setText(resultado);
          }
        }
        );
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btnBack)
        {
            this.dispose();
            PruebaUno p = new PruebaUno();
            p.setVisible(true);
            
        }
        
    }
    
    public String formula(String a, String b, String v1)
    {
        
        double num = Double.parseDouble(v1);
        double form;
        String res = "0";
        switch (a)
        {
            case "Kilometros":   switch (b)
            {
                           case "Kilometros ": res = String.valueOf(num);break;
                           case "Metros": form = (num * 1000);                    
                                      res = String.valueOf(form);break;
                           case "Millas": form = (num / 1.609);                    
                                      res = String.valueOf(form); break;
                           case "Yardas":form = (num * 1093.613);                    
                                      res = String.valueOf(form);break;
                           case "Pies":  form = (num * 3280.84);                    
                                      res = String.valueOf(form); break;
                           case "Pulgadas": form = (num * 39370.079);                    
                                      res = String.valueOf(form); break;                      
            }
                       break;
            case "Metros":   switch (b)
            {
                           case "Kilometros ": form = (num / 1000);
                                     res = String.valueOf(form);  break;
                           case "Metros": res = String.valueOf(num);  break;
                           case "Millas": form = (num / 1609.344);                    
                                      res = String.valueOf(form); break;
                           case "Yardas":form = (num * 1.094);                    
                                      res = String.valueOf(form); break;
                           case "Pies": form = (num * 3.281);                    
                                      res = String.valueOf(form); break;
                           case "Pulgadas": form = (num * 39.37);                    
                                      res = String.valueOf(form); break;         
            }
                       break;
            case "Millas":  switch (b)
            {
                           case "Kilometros": form = (num * 1.609);
                                     res = String.valueOf(form); break;
                           case "Metros": form = (num * 1609.344);
                                      res = String.valueOf(form); break;
                           case "Millas": res = String.valueOf(num); break;
                           case "Yardas":form = (num * 1760);                    
                                      res = String.valueOf(form); break;
                           case "Pies": form = (num * 5280);                    
                                      res = String.valueOf(form); break;
                           case "Pulgadas": form = (num *  63360);                    
                                      res = String.valueOf(form); break;            
            }
                       break;
            case "Yardas":  switch (b)
            {
                          case "Kilometros": form = (num / 1093.613);
                                    res = String.valueOf(form); break;
                          case "Metros":form = (num / 1.094);
                                    res = String.valueOf(form); break;
                          case "Millas":form = (num / 1760);
                                    res = String.valueOf(form); break;
                          case "Yardas":res = String.valueOf(num); break;
                          case "Pies":form = (num * 3);                    
                                    res = String.valueOf(form); break;
                          case "Pulgadas":form = (num * 36);                    
                                    res = String.valueOf(form);   break;   
             
            }
                         break;
            case "Pies":   switch (b)
            {
                          case "Kilometros":form = (num / 3280.84);
                                   res = String.valueOf(form);break;
                          case "Metros":form = (num / 3.281);
                                    res = String.valueOf(form);break;
                          case "Millas":form = (num / 5280);                    
                                    res = String.valueOf(form);break;
                          case "Yardas":form = (num  / 3);                    
                                     res = String.valueOf(form);break;
                          case "Pies":res = String.valueOf(num);break;
                          case "Pulgadas":form = (num * 12);                    
                                    res = String.valueOf(form);break;            
            }
                          break;
            case "Pulgadas": switch(b)
                {
                    case "Kilometros": form =(num / 39370.079);
                                      res = String.valueOf(form);break;
                    case "Metros":form = (num / 39.37);
                                 res = String.valueOf(form);break;
                case "Millas":form = (num / 63360);
                                  res = String.valueOf(form);break;
                case "Yardas":form = (num / 36);                    
                                  res = String.valueOf(form);break;
                case "Pies":form = (num / 12);                    
                                   res = String.valueOf(form);break;
                case "Pulgadas":res = String.valueOf(num);break;                              
                }
                break;
            default: res = "ERROR";
        }        
        return res;
    }
}
class Masa extends JFrame implements ActionListener
{
   private  JButton btnConvert, btnBack;
    private JTextField txtValor1;
    private JLabel lblR, lblS, lbl3, lbl4;
    private JComboBox c1, c2;
   public Masa()
    {
        
        setBounds(320, 190, 740, 400);
        setLayout(null);
        setResizable(false);
        
        lblS = new JLabel();
        lblS.setText("Ingresa unidad");
        lblS.setBounds(60,20,350,30);
        lblS.setFont(new Font ("Tahoma", Font.CENTER_BASELINE, 15));
        lblS.setForeground(Color.black);
        add(lblS);
        
        lbl3 = new JLabel();
        lbl3.setText("Selecciona la unidad que tienes ");
        lbl3.setBounds(40,95,350,30);
        lbl3.setFont(new Font ("Tahoma", Font.ITALIC, 15));
        lbl3.setForeground(Color.red);
        add(lbl3);
        
        lbl4 = new JLabel();
        lbl4.setText("Selecciona la unidad que quieres obtener ");
        lbl4.setBounds(420,95,350,30);
        lbl4.setFont(new Font ("Tahoma", Font.ITALIC, 15));
        lbl4.setForeground(Color.red);
        add(lbl4);
        
        btnBack = new JButton("Regresar");
        btnBack.setBounds(15,320,100,30);
        add(btnBack);
        btnBack.addActionListener(this);
        
        lblR = new JLabel();
        lblR.setBounds(325, 230, 145, 30);
        lblR.setFont(new Font ("Tahoma", Font.CENTER_BASELINE, 15));
        lblR.setForeground(Color.black);
        add(lblR);
        
        txtValor1 = new JTextField();
        txtValor1.setBounds(60, 50,100,30);
        add(txtValor1);
        
        
        btnConvert = new JButton("Convertir");
        btnConvert.setBounds(280,190,145,30);
        add(btnConvert);
        
        
        
        String s [] = {"Kilogramo", "Gramos", "Miligramos", "Libra", "Onza"};
        c1 = new JComboBox();
        c1.setFont(new Font("Tahoma", Font.BOLD, 13));
        c1.setBounds(60, 125, 170, 40);
        c1.setModel(new DefaultComboBoxModel(s));
        add(c1);
        
        c2 = new JComboBox();
        c2.setFont(new Font("Tahoma", Font.BOLD, 13));
        c2.setBounds(475, 125, 170, 40); 
        c2.setModel(new DefaultComboBoxModel(s));
        add(c2); 
        
        c1.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                
            }
         }
         );
        c2.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                
            }
         }
         );
        btnConvert.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
            String lista1 = (String) c1.getSelectedItem();
            String lista2 = (String) c2.getSelectedItem();
            String valC = txtValor1.getText();
            String resultado = formula(lista1, lista2, valC);
            lblR.setText(resultado);
          }
        }
        );
    }
    
   public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btnBack)
        {
            this.dispose();
            PruebaUno p = new PruebaUno();
            p.setVisible(true);
            
        }
    }
    
   public String formula(String a, String b, String v1)
    {
        
        double num = Double.parseDouble(v1);
        double form;
        String res = "0";
        switch (a)
        {
            case "Kilogramo":   switch (b)
                       {
                           case "Kilogramo": res = String.valueOf(num);break;
                           case "Gramos": form = (num * 1000);                    
                                      res = String.valueOf(form);break;
                           case "Miligramos": form = (num * 1e+6);                    
                                      res = String.valueOf(form); break;
                           case "Libra":form = (num * 2.205);                    
                                      res = String.valueOf(form);break;
                           case "Onza":  form = (num * 35.274);                    
                                      res = String.valueOf(form); break;
                                               
                       }
                       break;
           case "Gramos":   switch (b)
                       {
                           case "Kilogramo": form = (num / 1000);
                                     res = String.valueOf(form);  break;
                           case "Gramos": res = String.valueOf(num);  break;
                           case "Miligramos": form = (num * 1000);                    
                                      res = String.valueOf(form); break;
                           case "Libra":form = (num / 453.592);                    
                                      res = String.valueOf(form); break;
                           case "Onza": form = (num * 28.35);                    
                                      res = String.valueOf(form); break;
                                   
                       }
                       break;
            case "Miligramos":  switch (b)
                       {
                           case "Kilogramo": form = (num / 1e+6);
                                     res = String.valueOf(form); break;
                           case "Gramos": form = (num / 1000);
                                      res = String.valueOf(form); break;
                           case "Miligramos": res = String.valueOf(num); break;
                           case "Libra":form = (num / 453592.37);                    
                                      res = String.valueOf(form); break;
                           case "Onza": form = (num / 28349.523);                    
                                      res = String.valueOf(form); break;
                                       
                       }
                       break;
        case "Libra":  switch (b)
                      {
                          case "Kilogramo": form = (num / 2.205);
                                    res = String.valueOf(form); break;
                          case "Gramos":form = (num * 453.592);
                                    res = String.valueOf(form); break;
                          case "Miligramos":form = (num *  453592.37);
                                    res = String.valueOf(form); break;
                          case "Libra":res = String.valueOf(num); break;
                          case "Onza":form = (num * 16);                    
                                    res = String.valueOf(form); break;
         
            }
                        break;
        case "Onza":   switch (b)
            {
                          case "Kilogramo":form = (num/ 35.274);
                                   res = String.valueOf(form);break;
                          case "Gramos":form = (num *  28.35);
                                    res = String.valueOf(form);break;
                          case "Miligramos":form = (num * 28349.523);                    
                                    res = String.valueOf(form);break;
                          case "Libra":form = (num  / 16);                    
                                     res = String.valueOf(form);break;
                          case "Onza":res = String.valueOf(num);break;
                                    
            }
                         break;
        
            default: res = "ERROR";
        }        
        return res;   
    }
}
class Velocidad extends JFrame implements ActionListener
{
   private  JButton btnConvert, btnBack;
   private JTextField txtValor1;
   private JLabel lblR, lblS, lbl3, lbl4;
   private JComboBox c1, c2;
   private PruebaUno p = new PruebaUno();
   public Velocidad()
    {
        setBounds(320, 190, 740, 400);
        setLayout(null);
        setResizable(false);
        
        lblS = new JLabel();
        lblS.setText("Ingresa Unidad");
        lblS.setBounds(60,20,350,30);
        lblS.setFont(new Font ("Tahoma", Font.ITALIC, 15));
        lblS.setForeground(Color.black);
        add(lblS);
        
        lbl3 = new JLabel();
        lbl3.setText("Selecciona la unidad que tienes ");
        lbl3.setBounds(40,95,350,30);
        lbl3.setFont(new Font ("Tahoma", Font.ITALIC, 15));
        lbl3.setForeground(Color.red);
        add(lbl3);
        
        lbl4 = new JLabel();
        lbl4.setText("Selecciona la unidad que quieres obtener ");
        lbl4.setBounds(420,95,350,30);
        lbl4.setFont(new Font ("Tahoma", Font.ITALIC, 15));
        lbl4.setForeground(Color.red);
        add(lbl4);
        
        lblR = new JLabel();
        lblR.setBounds(325, 230, 145, 30);
        lblR.setFont(new Font ("Tahoma", Font.CENTER_BASELINE, 15));
        lblR.setForeground(Color.black);
        add(lblR);
        
        txtValor1 = new JTextField();
        txtValor1.setBounds(60, 50,100,30);
        add(txtValor1);
        
        btnBack = new JButton("Regresar");
        btnBack.setBounds(15,320,100,30);
        add(btnBack);
        btnBack.addActionListener(this); 
        
        btnConvert = new JButton("Convertir");
        btnConvert.setBounds(280,190,145,30);
        add(btnConvert);
        
        String s [] = {"Kilometros por hora", "Metros por segundo", "Pies por segundo", "Millas por hora", "Knot"};
        c1 = new JComboBox();
        c1.setFont(new Font("Tahoma", Font.BOLD, 13));
        c1.setBounds(60, 125, 170, 40);
        c1.setModel(new DefaultComboBoxModel(s));
        add(c1);
        
        c2 = new JComboBox();
        c2.setFont(new Font("Tahoma", Font.BOLD, 13));
        c2.setBounds(475, 125, 170, 40); 
        c2.setModel(new DefaultComboBoxModel(s));
        add(c2); 
        
        c1.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                
            }
         }
         );
        c2.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                
            }
         }
         );
        btnConvert.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
             String lista1 = (String) c1.getSelectedItem();
             String lista2 = (String) c2.getSelectedItem();
             String valC = txtValor1.getText();
             String resultado = formula(lista1, lista2,valC);
             lblR.setText(resultado);
           }   
        }
        );
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btnBack)
        {
            this.dispose();
            PruebaUno p = new PruebaUno();
            p.setVisible(true);
            
        }
    }
    
     public String formula(String a, String b, String v1)
    {
        
        double num = Double.parseDouble(v1);
        double form;
        String res = "0";
        switch (a)
        {
        case "Kilometros por hora":   switch (b)
                       {
                           case "Kilometros por hora": res = String.valueOf(num);break;
                           case "Metros por segundo": form = (num /3.6);                    
                                      res = String.valueOf(form);break;
                           case "Pies por segundo": form = (num / 1.097);                    
                                      res = String.valueOf(form); break;
                           case "Millas por hora":form = (num / 1.609);                    
                                      res = String.valueOf(form);break;
                           case "Knot":  form = (num / 1.852);                    
                                      res = String.valueOf(form); break;
                                                
                       }
                       break;
        case "Metros por segundo":   switch (b)
                       {
                           case "Kilometros por hora": form = (num * 3.6);
                                     res = String.valueOf(form);  break;
                           case "Metros por segundo": res = String.valueOf(num);  break;
                           case "Pies por segundo": form = (num * 3.281);                    
                                      res = String.valueOf(form); break;
                           case "Millas por hora":form = (num * 2.237);                    
                                      res = String.valueOf(form); break;
                           case "Knot": form = (num * 1.944);                    
                                      res = String.valueOf(form); break;
                                    
                       }
                       break;
        case "Pies por segundo":  switch (b)
                       {
                           case "Kilometros por hora": form = (num / 1.467);
                                     res = String.valueOf(form); break;
                           case "Metros por segundo": form = (num / 3.281);
                                      res = String.valueOf(form); break;
                           case "Pies por segundo": res = String.valueOf(num); break;
                           case "Millas por hora":form = (num * 1.097);                    
                                      res = String.valueOf(form); break;
                           case "Knot": form = (num / 1.688);                    
                                      res = String.valueOf(form); break;
                                       
                       }
                       break;
        case "Millas por hora":  switch (b)
                      {
                          case "Kilometros por hora": form = (num * 1.609);
                                    res = String.valueOf(form); break;
                          case "Metros por segundo":form = (num / 2.237);
                                    res = String.valueOf(form); break;
                          case "Pies por segundo":form = (num * 1.467);
                                    res = String.valueOf(form); break;
                          case "Millas por hora":res = String.valueOf(num); break;
                          case "Knot":form = (num / 1.151);                    
                                    res = String.valueOf(form); break;  
             
                      }
                        break;
        case "Knot":   switch (b)
                        {
                          case "Kilometros por hora":form = (num * 1.852);
                                   res = String.valueOf(form);break;
                          case "Metros por segundo":form = (num / 1.944);
                                    res = String.valueOf(form);break;
                          case "Pies por segundo":form = (num * 1.688);                    
                                    res = String.valueOf(form);break;
                          case "Millas por hora":form = (num * 1.151);                    
                                     res = String.valueOf(form);break;
                          case "Knot":res = String.valueOf(num);break;
                                     
                        }
                        break;
       
            default: res = "ERROR";
        }        
        return res;
    }
    
}
class Temperatura extends JFrame implements ActionListener
{
    private  JButton btnConvert, btnBack;
    private JTextField txtValor1;
    private JLabel lblR, lblS, lbl3, lbl4;
    private JComboBox c1, c2;
    private PruebaUno p = new PruebaUno();
    public Temperatura()
    {
      setBounds(320, 190, 740, 400);
      setLayout(null);
      setResizable(false);
      
        lblS = new JLabel();
        lblS.setText("Ingresa unidad");
        lblS.setBounds(60,20,350,30);
        lblS.setFont(new Font ("Tahoma", Font.CENTER_BASELINE, 15));
        lblS.setForeground(Color.black);
        add(lblS);
        
        lbl3 = new JLabel();
        lbl3.setText("Selecciona la unidad que tienes ");
        lbl3.setBounds(40,95,350,30);
        lbl3.setFont(new Font ("Tahoma", Font.ITALIC, 15));
        lbl3.setForeground(Color.red);
        add(lbl3);
        
        lbl4 = new JLabel();
        lbl4.setText("Selecciona la unidad que quieres obtener ");
        lbl4.setBounds(420,95,350,30);
        lbl4.setFont(new Font ("Tahoma", Font.ITALIC, 15));
        lbl4.setForeground(Color.red);
        add(lbl4);
        
        lblR = new JLabel();
        lblR.setBounds(325, 230, 145,30);
        lblR.setFont(new Font ("Tahoma", Font.CENTER_BASELINE, 15));
        lblR.setForeground(Color.black);
        add(lblR);
        
        btnBack = new JButton("Regresar");
        btnBack.setBounds(15,320,100,30);
        add(btnBack);
        btnBack.addActionListener(this);
        
        btnConvert = new JButton("Convertir");
        btnConvert.setBounds(280,190,145,30);
        add(btnConvert);
        
        txtValor1 = new JTextField();
        txtValor1.setBounds(65, 50,100,30);
        add(txtValor1);
        
        
        String s [] = {"Celsius","Fahrenheit", "Kelvin"};
        c1 = new JComboBox();
        c1.setFont(new Font("Tahoma", Font.BOLD, 13));
        c1.setBounds(60, 125, 170, 40);
        c1.setModel(new DefaultComboBoxModel(s));
        add(c1);
        
        c2 = new JComboBox();
        c2.setFont(new Font("Tahoma", Font.BOLD, 13));
        c2.setBounds(475, 125, 170, 40); 
        c2.setModel(new DefaultComboBoxModel(s));
        add(c2); 
        
       c1.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                
            }
         }
         );
       c2.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                
            }
         }
         );
       btnConvert.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent e)
             {
                 
        
                 String lista1 = (String) c1.getSelectedItem();
                 String lista2 = (String) c2.getSelectedItem();
                 String valC = txtValor1.getText();
                 String resultado = formula(lista1, lista2, valC);
                 lblR.setText(resultado);
            
        
             }
         }
         );  
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btnBack)
        {
            
        
            this.dispose();
            PruebaUno p = new PruebaUno();
            p.setVisible(true);
           
        }
    }
    
    public String formula(String a, String b, String v1)
    {
        
        double num = Double.parseDouble(v1);
        double form;
        String res = "0";
        switch (a)
        {
            case "Celsius": switch (b)
                       {
                            case "Celsius": res = String.valueOf(num);break;
                           case "Fahrenheit": form = ((num * 9/5) + 32);                    
                                      res = String.valueOf(form);break;
                           case "Kelvin": form = (num + 273.15);                    
                                      res = String.valueOf(form); break;
                                                 
                       }
                       break;
            case "Fahrenheit": switch (b)
                       {
                           case "Celsius": form = ((num - 32) * 5/9);
                                     res = String.valueOf(form);  break;
                           case "Fahrenheit": res = String.valueOf(num);  break;
                           case "Kelvin": form = ((num - 32) * 5/9 + 273.15);                    
                                      res = String.valueOf(form); break;
                                    
                       }
                       break;
            case "Kelvin": switch (b)
                       {
                           case "Celsius": form = (num -273.15);
                                     res = String.valueOf(form); break;
                           case "Fahrenheit": form = ((num - 273.15) * 9/5 + 32);
                                      res = String.valueOf(form); break;
                           case "Kelvin": res = String.valueOf(num); break;
                                       
                       }
                       break;
        
            default: res = "ERROR";
        }        
        return res;   
    }
}
