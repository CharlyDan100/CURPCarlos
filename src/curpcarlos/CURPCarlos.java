
package curpcarlos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.applet.AudioClip;
public class CURPCarlos extends JFrame{

    String nombre, paterno, materno, anio, mess, diaa, gen, est;
    char abc[]={'a','b','c','d','e','f','g','h','i','j',
                          'k','l','m','n','ñ','o','p','q','r','s',
                          't','u','v','w','x','y','z',' '};
    char ABC[]={'A','B','C','D','E','F','G','H','I','J',
                          'K','L','M','N','Ñ','O','P','Q','R','S',
                          'T','U','V','W','X','Y','Z',' '};
    char vocal[]={'A','E','I','O','U'};
    char consonante[]={'B','C','D','F','G','H','J','K',
                       'L','M','N','Ñ','P','Q','R','S',
                       'T','V','W','X','Y','Z'};
    char CURP[]=new char[16];
    
    JLabel DatoNombre, DatoNacimiento, DatoGenero, DatoEstado;
    JLabel nom, pat, mat, year, mes, dia, genero, estado;
    JTextField NOM, PAT, MAT, mostrar;
    JComboBox Year, Mes, Dia, Genero, Estado;
    JButton Generar, Refrescar, Salir;
    
  
    
    public CURPCarlos(){
        
        super ("Ventana principal");
        
           
       
        
            setSize(400, 600); 
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            getContentPane().setLayout(null); 
            setLocationRelativeTo(null);
            
            DatoNombre =new JLabel("[DATOS DE NOMBRE]");
            DatoNombre.setBounds(60, 10, 150, 25);
            
            nom =new JLabel("Nombre(s):");
            nom.setBounds(20, 40, 80, 25);
            NOM =new JTextField("");
            NOM.setBounds(100, 40, 100, 25);
            
            pat =new JLabel("Paterno:");
            pat.setBounds(20, 80, 50, 25);
            PAT =new JTextField("");
            PAT.setBounds(100, 80, 100, 25);
            
            mat =new JLabel("Materno:");
            mat.setBounds(20, 120, 50, 25);
            MAT =new JTextField("");
            MAT.setBounds(100, 120, 100, 25);
            
            DatoNacimiento =new JLabel("[DATOS DE NACIMIENTO]");
            DatoNacimiento.setBounds(60, 170, 150, 25);
            
            year =new JLabel("Año:");
            year.setBounds(20, 200, 50, 25);
            
            Year = new JComboBox();
            Year.addItem("1960");
            Year.addItem("1961");
            Year.addItem("1962");
            Year.addItem("1963");
            Year.addItem("1964");
            Year.addItem("1965");
            Year.addItem("1966");
            Year.addItem("1967");
            Year.addItem("1968");
            Year.addItem("1969");
            Year.addItem("1970");
            Year.addItem("1971");
            Year.addItem("1972");
            Year.addItem("1973");
            Year.addItem("1974");
            Year.addItem("1975");
            Year.addItem("1976");
            Year.addItem("1977");
            Year.addItem("1978");
            Year.addItem("1979");
            Year.addItem("1980");
            Year.addItem("1981");
            Year.addItem("1982");
            Year.addItem("1983");
            Year.addItem("1984");
            Year.addItem("1985");
            Year.addItem("1986");
            Year.addItem("1987");
            Year.addItem("1988");
            Year.addItem("1989");
            Year.addItem("1990");
            Year.addItem("1991");
            Year.addItem("1992");
            Year.addItem("1993");
            Year.addItem("1994");
            Year.addItem("1995");
            Year.addItem("1996");
            Year.addItem("1997");
            Year.addItem("1998");
            Year.addItem("1999");
            Year.addItem("2000");
            Year.addItem("2001");
            Year.addItem("2002");
            Year.addItem("2003");
            Year.addItem("2004");
            Year.addItem("2005");
            Year.addItem("2006");
            Year.addItem("2007");
            Year.addItem("2008");
            Year.addItem("2009");
            Year.addItem("2010");
            Year.addItem("2011");
            Year.addItem("2012");
            Year.addItem("2013");
            Year.addItem("2014");
            Year.addItem("2015");
            Year.addItem("2016");
            Year.addItem("2017");
            Year.setBounds(70, 200, 100, 25);
            
            mes =new JLabel("Mes:");
            mes.setBounds(20, 240, 50, 25);
           
            
            Mes =new JComboBox();
            Mes.addItem("Enero");
            Mes.addItem("Febrero");
            Mes.addItem("Marzo");
            Mes.addItem("Abril");
            Mes.addItem("Mayo");
            Mes.addItem("Junio");
            Mes.addItem("Julio");
            Mes.addItem("Agosto");
            Mes.addItem("Septiembre");
            Mes.addItem("Octubre");
            Mes.addItem("Noviembre");
            Mes.addItem("Diciembre");
            Mes.setBounds(70, 240, 100, 25);
            
            dia =new JLabel("Dia:");
            dia.setBounds(20, 280, 50, 25);
           
            
            Dia =new JComboBox();
            Dia.addItem("01");
            Dia.addItem("02");
            Dia.addItem("03");
            Dia.addItem("04");
            Dia.addItem("05");
            Dia.addItem("06");
            Dia.addItem("07");
            Dia.addItem("08");
            Dia.addItem("09");
            Dia.addItem("10");
            Dia.addItem("11");
            Dia.addItem("12");
            Dia.addItem("13");
            Dia.addItem("14");
            Dia.addItem("15");
            Dia.addItem("16");
            Dia.addItem("17");
            Dia.addItem("18");
            Dia.addItem("19");
            Dia.addItem("20");
            Dia.addItem("21");
            Dia.addItem("22");
            Dia.addItem("23");
            Dia.addItem("24");
            Dia.addItem("25");
            Dia.addItem("26");
            Dia.addItem("27");
            Dia.addItem("28");
            Dia.addItem("29");
            Dia.addItem("30");
            Dia.addItem("31");
            Dia.setBounds(70, 280, 50, 25);
            
            DatoGenero =new JLabel("[DATO DE GENERO]");
            DatoGenero.setBounds(60, 330, 150, 25);
            
            genero =new JLabel("Genero:");
            genero.setBounds(20, 360, 50, 25);
            
            Genero =new JComboBox();
            Genero.addItem("Hombre");
            Genero.addItem("Mujer");
            Genero.setBounds(70, 360, 70, 25);
            
            DatoEstado =new JLabel("[DATO DE ESTADO]");
            DatoEstado.setBounds(60, 410, 150, 25);
            
            estado =new JLabel("Estado:");
            estado.setBounds(20, 440, 50, 25);
            
            Estado =new JComboBox();
            Estado.addItem("Aguascalientes");
            Estado.addItem("Baja california");
            Estado.addItem("Baja California Sur");
            Estado.addItem("Campeche");
            Estado.addItem("Coahuila");
            Estado.addItem("Colima");
            Estado.addItem("Chiapas");
            Estado.addItem("Chihuahua");
            Estado.addItem("Distrito Federal");
            Estado.addItem("Durango");
            Estado.addItem("Guanajuato");
            Estado.addItem("Guerrero");
            Estado.addItem("Hidalgo");
            Estado.addItem("Jalisco");
            Estado.addItem("México");
            Estado.addItem("Michoacán");
            Estado.addItem("Morelos");
            Estado.addItem("Nayarit");
            Estado.addItem("Nuevo León");
            Estado.addItem("Oaxaca");
            Estado.addItem("Puebla");
            Estado.addItem("Querétaro");
            Estado.addItem("Quintana Roo");
            Estado.addItem("San Luis Potosí");
            Estado.addItem("Sinaloa");
            Estado.addItem("Sonora");
            Estado.addItem("Tabasco");
            Estado.addItem("Tamaulipas");
            Estado.addItem("Tlaxcala");
            Estado.addItem("Veracruz");
            Estado.addItem("Yucatán");
            Estado.addItem("Zacatecas");
            Estado.addItem("Nacido en el extranjero");
            Estado.setBounds(70, 440, 140, 25);
            
            //JCheckBox parametros=new JCheckBox();
            
            Generar=new JButton ("Generar Curp");
            Generar.setBounds(200, 500, 150, 30);
            
            Refrescar=new JButton("Refrescar");
            Refrescar.setBounds(225, 450, 100, 30);
            
            Salir=new JButton();
            Salir.setBounds(320, 10, 50, 40);
            Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Salir.jpg"))); 
            Salir.setBorder(null);
            Salir.setBorderPainted(false);
            Salir.setContentAreaFilled(false);
            Salir.setFocusable(false);
            
            mostrar= new JTextField("");
            mostrar.setBounds(20, 500, 130, 30);
            mostrar.setEnabled(false);
            
            add(DatoNombre);     
            add(nom);
            add(NOM);
            add(pat);
            add(PAT);
            add(mat);
            add(MAT);
            add(DatoNacimiento);
            add(year);
            add(Year);
            add(mes);
            add(Mes);
            add(dia);
            add(Dia);
            add(DatoGenero);
            add(genero);
            add(Genero);
            add(DatoEstado);
            add(estado);
            add(Estado);
            add(Generar);
            add(Refrescar);
            add(Salir);
            //add(parametros);
            getContentPane().setLayout(null);
            ((JPanel)getContentPane()).setOpaque(false);
            ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagen/VortexCarlos2.jpg"));
            JLabel fondo=new JLabel();
            fondo.setIcon(uno);
            getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
            fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
            
            Generar.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 
             AudioClip sonido;
             sonido=java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/bleep.wav"));
             sonido.play();
             
             String n=NOM.getText(),p=PAT.getText(),m=NOM.getText();
             if(n.isEmpty() || p.isEmpty() || m.isEmpty()){
              JOptionPane.showMessageDialog(rootPane, "¡Hay uno o varios campos vacíos!", "Error", JOptionPane.WARNING_MESSAGE);
             }else{
                 Nombre();
             }
             }
         });
            
            Salir.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
             JOptionPane.showMessageDialog(null, "Vuelva cuando guste... :)");
             System.exit(0);
             }
         });
            
             Refrescar.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
             NOM.setText("");
             PAT.setText("");
             MAT.setText("");
             mostrar.setText("");
             mostrar.setVisible(false);
             Year.setSelectedItem("1980");
             Mes.setSelectedItem("Enero");
             Dia.setSelectedItem("01");
             Genero.setSelectedItem("Hombre");
             Estado.setSelectedItem("Aguascalientes");
             }
         });
            
            setVisible(true); 
            
    }
    
    public void Nombre(){
        nombre = NOM.getText();
        
       
     
 
   
    char particion[]=nombre.toCharArray();
    
    //Convertir a mayusculas todas las letras de tu nombre
    for(int x=0; x<particion.length; x++){
        for(int y=0; y<abc.length; y++){
            if(particion[x]==abc[y] || particion[x]==ABC[y]){
               
                particion[x]=ABC[y];        
        }
    }
     //Asignación a las casillas correspondientes
        CURP[3]=particion[0];
        for(int z=1; z<particion.length; z++){
            for(int v=0; v<consonante.length; v++){
                if(particion[z]==consonante[v]){
                 CURP[15]=particion[z];
                 v=consonante.length;
                 z=particion.length;
                }
            }
        }
    
      
    }
    Paterno();
    }
    public void Paterno(){
        paterno = PAT.getText();
        
       
     
 
   
    char particion2[]=paterno.toCharArray();
    
    //Convertir a mayusculas todas las letras de tu apellido paterno
    for(int x=0; x<particion2.length; x++){
        for(int y=0; y<abc.length; y++){
            if(particion2[x]==abc[y] || particion2[x]==ABC[y]){
               
                particion2[x]=ABC[y];        
        }
    }
     //Asignación a las casillas correspondientes
        CURP[0]=particion2[0];
        for(int z=1; z<particion2.length; z++){
            for(int v=0; v<vocal.length; v++){
                if(particion2[z]==vocal[v]){
                 CURP[1]=particion2[z];
                 v=vocal.length;
                 z=particion2.length;
                }
            }
        }
        
        for(int w=1; w<particion2.length; w++){
            for(int b=0; b<consonante.length; b++){
                if(particion2[w]==consonante[b]){
                 CURP[13]=particion2[w];
                 b=consonante.length;
                 w=particion2.length;
                }
            }
        }
    }
    Materno();
    }
    
    public void Materno(){
         materno = MAT.getText();
        
       
     
 
   
    char particion3[]=materno.toCharArray();
    
    //Convertir a mayusculas todas las letras de tu apellido materno
    for(int x=0; x<particion3.length; x++){
        for(int y=0; y<abc.length; y++){
            if(particion3[x]==abc[y] || particion3[x]==ABC[y]){
               
                particion3[x]=ABC[y];        
        }
    }
     //Asignación a las casillas correspondientes
        CURP[2]=particion3[0];
        
        
        for(int w=1; w<particion3.length; w++){
            for(int b=0; b<consonante.length; b++){
                if(particion3[w]==consonante[b]){
                 CURP[14]=particion3[w];
                 b=consonante.length;
                 w=particion3.length;
                }
            }
        }
    }
    Year();
    }
    
    public void Year(){
        anio = Year.getSelectedItem().toString();
        char particion4[]=anio.toCharArray();
        CURP[4]=particion4[2];
        CURP[5]=particion4[3];
        Mes();
    }
    
    public void Mes(){
        mess= Mes.getSelectedItem().toString();
        char partmes[]=new char[2];
        if(mess=="Enero"){
            partmes[0]='0';
            partmes[1]='1';
            CURP[6]=partmes[0];
            CURP[7]=partmes[1];
        }else if(mess=="Febrero"){
            partmes[0]='0';
            partmes[1]='2';
            CURP[6]=partmes[0];
            CURP[7]=partmes[1];
        }else if(mess=="Marzo"){
            partmes[0]='0';
            partmes[1]='3';
            CURP[6]=partmes[0];
            CURP[7]=partmes[1];
        }else if(mess=="Abril"){
            partmes[0]='0';
            partmes[1]='4';
            CURP[6]=partmes[0];
            CURP[7]=partmes[1];
        }else if(mess=="Mayo"){
            partmes[0]='0';
            partmes[1]='5';
            CURP[6]=partmes[0];
            CURP[7]=partmes[1];
        }else if(mess=="Junio"){
            partmes[0]='0';
            partmes[1]='6';
            CURP[6]=partmes[0];
            CURP[7]=partmes[1];
        }else if(mess=="Julio"){
            partmes[0]='0';
            partmes[1]='7';
            CURP[6]=partmes[0];
            CURP[7]=partmes[1];
        }else if(mess=="Agosto"){
            partmes[0]='0';
            partmes[1]='8';
            CURP[6]=partmes[0];
            CURP[7]=partmes[1];
        }else if(mess=="Septiembre"){
            partmes[0]='0';
            partmes[1]='9';
            CURP[6]=partmes[0];
            CURP[7]=partmes[1];
        }else if(mess=="Octubre"){
            partmes[0]='1';
            partmes[1]='0';
            CURP[6]=partmes[0];
            CURP[7]=partmes[1];
        }else if(mess=="Noviembre"){
            partmes[0]='1';
            partmes[1]='1';
            CURP[6]=partmes[0];
            CURP[7]=partmes[1];
        }else if(mess=="Diciembre"){
            partmes[0]='1';
            partmes[1]='2';
            CURP[6]=partmes[0];
            CURP[7]=partmes[1];
        }
        Dia();
    }
    
    public void Dia(){
        diaa= Dia.getSelectedItem().toString();
        char particion5[]=diaa.toCharArray();
        CURP[8]=particion5[0];
        CURP[9]=particion5[1];
        Genero();
    }
    
    public void Genero(){
        gen=Genero.getSelectedItem().toString();
        if(gen=="Hombre"){
            CURP[10]='H';
        }else{
            CURP[10]='M';
        }
        Estado();
    }
    
    public void Estado(){
        est= Estado.getSelectedItem().toString();
        
        if(est=="Aguascalientes"){
            CURP[11]='A';
            CURP[12]='S';
        }else if(est=="Baja California"){
            CURP[11]='B';
            CURP[12]='C';
        }else if(est=="Baja California Sur"){
            CURP[11]='B';
            CURP[12]='S';
        }else if(est=="Campeche"){
            CURP[11]='C';
            CURP[12]='C';
        }else if(est=="Coahuila"){
            CURP[11]='C';
            CURP[12]='L';
        }else if(est=="Colima"){
            CURP[11]='C';
            CURP[12]='M';
        }else if(est=="Chiapas"){
            CURP[11]='C';
            CURP[12]='S';
        }else if(est=="Chihuahua"){
            CURP[11]='C';
            CURP[12]='H';
        }else if(est=="Distrito Federal"){
            CURP[11]='D';
            CURP[12]='F';
        }else if(est=="Durango"){
            CURP[11]='D';
            CURP[12]='G';
        }else if(est=="Guanajuato"){
            CURP[11]='G';
            CURP[12]='T';
        }else if(est=="Guerrero"){
            CURP[11]='G';
            CURP[12]='R';
        }else if(est=="Hidalgo"){
            CURP[11]='H';
            CURP[12]='G';
        }else if(est=="Jalisco"){
            CURP[11]='J';
            CURP[12]='C';
        }else if(est=="México"){
            CURP[11]='M';
            CURP[12]='C';
        }else if(est=="Michoacán"){
            CURP[11]='M';
            CURP[12]='N';
        }else if(est=="Morelos"){
            CURP[11]='M';
            CURP[12]='S';
        }else if(est=="Nayarit"){
            CURP[11]='N';
            CURP[12]='T';
        }else if(est=="Nuevo León"){
            CURP[11]='N';
            CURP[12]='L';
        }else if(est=="Oaxaca"){
            CURP[11]='O';
            CURP[12]='C';
        }else if(est=="Puebla"){
            CURP[11]='P';
            CURP[12]='L';
        }else if(est=="Querétaro"){
            CURP[11]='Q';
            CURP[12]='T';
        }else if(est=="Quinrana Roo"){
            CURP[11]='Q';
            CURP[12]='R';
        }else if(est=="San Luis Potosí"){
            CURP[11]='S';
            CURP[12]='P';
        }else if(est=="Sinaloa"){
            CURP[11]='S';
            CURP[12]='L';
        }else if(est=="Sonora"){
            CURP[11]='S';
            CURP[12]='R';
        }else if(est=="Tabasco"){
            CURP[11]='T';
            CURP[12]='C';
        }else if(est=="Tamaulipas"){
            CURP[11]='T';
            CURP[12]='S';
        }else if(est=="Tlaxcala"){
            CURP[11]='T';
            CURP[12]='L';
        }else if(est=="Veracruz"){
            CURP[11]='V';
            CURP[12]='Z';
        }else if(est=="Yucatán"){
            CURP[11]='Y';
            CURP[12]='N';
        }else if(est=="Zacatecas"){
            CURP[11]='Z';
            CURP[12]='S';
        }else if(est=="Nacido en el extranjero"){
            CURP[11]='N';
            CURP[12]='E';
        }
        imprimir();
    }
    
    public void imprimir(){
        
        String acumular="";
    for(int z=0;z<CURP.length;z++){
        
       
        mostrar.setText(acumular+CURP[z]);
        acumular=mostrar.getText();
    }
        
        for(int i=0; i<CURP.length; i++){
            System.out.print("["+CURP[i]+"]");
        }
        System.out.println("...Esta fue tu CURP generada.");
        add(mostrar);
        JOptionPane.showMessageDialog(null, "CURP generada!!!");
    }
    
    public static void main(String[] args) {
        CURPCarlos obj=new CURPCarlos();
    }
    
}
