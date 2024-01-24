package proyecto;
import java.awt.*;
import java.net.URL;
import javax.swing.*;
import javax.swing.BoxLayout;

public class Proyecto extends JFrame{
    public Proyecto() {
     
      URL iconURL = getClass().getResource("/resources/notepad.png"); //Buscar recurso del icono
      Image icon = new javax.swing.ImageIcon(iconURL).getImage(); //Identificar una imagen con un recurso
      this.setIconImage(icon); //establecer un icono 
      this.setSize(640,512); //Tamaño de la ventana
      this.setTitle("Datos Personales"); // Titulo de la ventana
      this.setLocationRelativeTo(null); // Ubicar la ventana en el centro de la pantalla
      this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Terminar la ejecucion del programa cuando se cierre la ventana 
      this.setResizable(true); //Establecer la ventana no modificable en tamaño
      initializeComps(); // llamar componentes
    }
    
    private void initializeComps() {
        JPanel panel = new JPanel(); //Panel
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));     //Centrar panel
        panel.setPreferredSize(new Dimension(600,10)); // Modificar preferred size para las posiciones de los elementos
        
        renderHeader(panel);
        renderCode(panel);
        renderID(panel);
        renderNames(panel);
        renderBirthdate(panel);
        renderBirthdatePlace(panel);
        renderRoomAddress(panel);
        renderEmail(panel);
        renderPhone(panel);
        
        this.getContentPane().add(panel); //Agregar el ScrollPanel al content panel     
         
    }
    private void renderHeader(JPanel MainPanel) {
        JPanel HeaderPanel = new JPanel(); // We create a Panel for the first row
        HeaderPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10)); 
        JLabel etiqueta = new JLabel("Formulario para ingresar datos personales");
        etiqueta.setFont(new Font("Verdana", Font.PLAIN, 20));
        etiqueta.setBounds(0, 0, 640, 50);
        etiqueta.setForeground(Color.white);
        etiqueta.setBackground(Colores.darkBlue);
        etiqueta.setOpaque(true);
        HeaderPanel.add(etiqueta);
        MainPanel.add(HeaderPanel);
    }
    
    private void renderCode(JPanel MainPanel) {
        JPanel firstRowPanel = new JPanel(); // We create a Panel for the first row
        firstRowPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10)); // Set it to FlowLayout so it can be aligned horizontally
        firstRowPanel.setBackground(Color.yellow);
        JLabel codeLabel = new JLabel("Ingrese su código: ");
        codeLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
        //codeLabel.setBounds(0, 55, 640, 50);
        codeLabel.setOpaque(true);
        JTextField codeField = new JTextField();
        codeField.setPreferredSize(new Dimension(150, 30));
        
        // Add the components to the panel
        firstRowPanel.add(codeLabel);
        firstRowPanel.add(codeField);
        // Render it to the main frame (panel being rendered)
        MainPanel.add(firstRowPanel);
    }
    
    private void renderNames(JPanel MainPanel) {
        JPanel SecondRowPanel = new JPanel(); // We create a Panel for the first row
        SecondRowPanel.setLayout( new FlowLayout(FlowLayout.LEFT, 5, 10)); // Set it to FlowLayout so it can be aligned horizontally
        SecondRowPanel.setBackground(Color.RED);
        JLabel NamesLabel = new JLabel("Ingrese su nombre y apellido: ");
        NamesLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
       // NamesLabel.setBounds(0, 100, 640, 50);
        NamesLabel.setOpaque(true);
        JTextField NamesField = new JTextField();
        NamesField.setPreferredSize(new Dimension(150, 30));
        // Add the components to the panel
        SecondRowPanel.add(NamesLabel);
        SecondRowPanel.add(NamesField);
        // Render it to the main frame (panel being rendered)
        MainPanel.add(SecondRowPanel);
    }
    
     private void renderBirthdate(JPanel MainPanel) {
        JPanel ThirdRowPanel = new JPanel(); // We create a Panel for the first row
        ThirdRowPanel.setLayout( new FlowLayout(FlowLayout.LEFT, 5, 10)); // Set it to FlowLayout so it can be aligned horizontally
        ThirdRowPanel.setBackground(Color.MAGENTA);
        JLabel BirthdateLabel = new JLabel("Ingrese su fecha de nacimiento: ");
        BirthdateLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
       // NamesLabel.setBounds(0, 100, 640, 50);
        BirthdateLabel.setOpaque(true);
        JTextField BirthdateField = new JTextField();
        BirthdateField.setPreferredSize(new Dimension(150, 30));
        // Add the components to the panel
        ThirdRowPanel.add(BirthdateLabel);
        ThirdRowPanel.add(BirthdateField);
        // Render it to the main frame (panel being rendered)
        MainPanel.add(ThirdRowPanel);
    }
     
     private void renderBirthdatePlace(JPanel MainPanel) {
        JPanel FourthdRowPanel = new JPanel(); // We create a Panel for the first row
        FourthdRowPanel.setLayout( new FlowLayout(FlowLayout.LEFT, 5, 10)); // Set it to FlowLayout so it can be aligned horizontally
        FourthdRowPanel.setBackground(Color.PINK);
        JLabel BirthdatePlaceLabel = new JLabel("Ingrese su lugar de nacimiento: ");
        BirthdatePlaceLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
       // NamesLabel.setBounds(0, 100, 640, 50);
        BirthdatePlaceLabel.setOpaque(true);
        JTextField BirthdatePlaceField = new JTextField();
        BirthdatePlaceField.setPreferredSize(new Dimension(150, 30));
        // Add the components to the panel
        FourthdRowPanel.add(BirthdatePlaceLabel);
        FourthdRowPanel.add(BirthdatePlaceField);
        // Render it to the main frame (panel being rendered)
        MainPanel.add(FourthdRowPanel);
    }
     private void renderRoomAddress(JPanel MainPanel) {
        JPanel FifthdRowPanel = new JPanel(); // We create a Panel for the first row
        FifthdRowPanel.setLayout( new FlowLayout(FlowLayout.LEFT, 5, 10)); // Set it to FlowLayout so it can be aligned horizontally
        FifthdRowPanel.setBackground(Color.cyan);
        JLabel RoomAddressLabel = new JLabel("Ingrese su número de habitación ");
        RoomAddressLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
       // NamesLabel.setBounds(0, 100, 640, 50);
        RoomAddressLabel.setOpaque(true);
        JTextField RoomAddressField = new JTextField();
        RoomAddressField.setPreferredSize(new Dimension(150, 30));
        // Add the components to the panel
        FifthdRowPanel.add(RoomAddressLabel);
        FifthdRowPanel.add(RoomAddressField);
        // Render it to the main frame (panel being rendered)
        MainPanel.add(FifthdRowPanel);
    }
     private void renderEmail(JPanel MainPanel) {
        JPanel SixthdRowPanel = new JPanel(); // We create a Panel for the first row
        SixthdRowPanel.setLayout( new FlowLayout(FlowLayout.LEFT, 5, 10)); // Set it to FlowLayout so it can be aligned horizontally
        SixthdRowPanel.setBackground(Color.cyan);
        JLabel EmailLabel = new JLabel("Ingrese su Email ");
        EmailLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
       // NamesLabel.setBounds(0, 100, 640, 50);
        EmailLabel.setOpaque(true);
        JTextField EmailField = new JTextField();
        EmailField.setPreferredSize(new Dimension(150, 30));
        // Add the components to the panel
        SixthdRowPanel.add(EmailLabel);
        SixthdRowPanel.add(EmailField);
        // Render it to the main frame (panel being rendered)
        MainPanel.add(SixthdRowPanel);
    }
     private void renderPhone(JPanel MainPanel) {
        JPanel SeventhRowPanel = new JPanel(); // We create a Panel for the first row
        SeventhRowPanel.setLayout( new FlowLayout(FlowLayout.LEFT, 5, 10)); // Set it to FlowLayout so it can be aligned horizontally
        SeventhRowPanel.setBackground(Color.GREEN);
        JLabel PhoneLabel = new JLabel("Ingrese su número telefónico ");
        PhoneLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
       // NamesLabel.setBounds(0, 100, 640, 50);
        PhoneLabel.setOpaque(true);
        JTextField PhoneField = new JTextField();
        PhoneField.setPreferredSize(new Dimension(150, 30));
        // Add the components to the panel
        SeventhRowPanel.add(PhoneLabel);
        SeventhRowPanel.add(PhoneField);
        // Render it to the main frame (panel being rendered)
        MainPanel.add(SeventhRowPanel);
    }
     
     private void renderID(JPanel MainPanel) {
        JPanel EighthRowPanel = new JPanel(); // We create a Panel for the first row
        EighthRowPanel.setLayout( new FlowLayout(FlowLayout.LEFT, 5, 10)); // Set it to FlowLayout so it can be aligned horizontally
        EighthRowPanel.setBackground(Color.GREEN);
        JLabel IDLabel = new JLabel("Ingrese su número de cédula ");
        IDLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
       // NamesLabel.setBounds(0, 100, 640, 50);
        IDLabel.setOpaque(true);
        JTextField IDField = new JTextField();
        IDField.setPreferredSize(new Dimension(150, 30));
        // Add the components to the panel
        EighthRowPanel.add(IDLabel);
        EighthRowPanel.add(IDField);
        // Render it to the main frame (panel being rendered)
        MainPanel.add(EighthRowPanel); 
     }
}
