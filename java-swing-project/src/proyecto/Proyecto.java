package proyecto;
import java.awt.*;
import java.net.URL;
import javax.swing.*;

import proyecto.Renderers.RenderBloodType;
import proyecto.Renderers.RenderCalendar;
import proyecto.Renderers.RenderCedula;
import proyecto.Renderers.RenderEntry;
import proyecto.Renderers.RenderGender;
import proyecto.Renderers.RenderSeparator;
import proyecto.Renderers.RenderTextArea;


public class Proyecto extends JFrame{
    public Proyecto() {
     
        URL iconURL = getClass().getResource("/resources/notepad.png"); //Buscar recurso del icono
        Image icon = new javax.swing.ImageIcon(iconURL).getImage(); //Identificar una imagen con un recurso
        this.setIconImage(icon); //establecer un icono 
        this.setSize(640,512); //Tamaño de la ventana
        this.setTitle("Datos Personales"); // Titulo de la ventana
        this.setLocationRelativeTo(null); // Ubicar la ventana en el centro de la pantalla
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Terminar la ejecucion del programa cuando se cierre la ventana 
      // set min and max size
        this.setMinimumSize(new Dimension(640,512)); //Establecer el tamaño minimo de la ventana
        this.setMaximumSize(new Dimension(740,612)); //Establecer el tamaño maximo de la ventana
        this.setResizable(false); //Establecer la ventana no modificable en tamaño
        initializeComps(); // llamar componentes
    }
    
    private void initializeComps() {
        JPanel panel = new JPanel(); //Panel
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS)); //Centrar panel

        renderHeader(panel);
        RenderEntry codigo = new RenderEntry("Código:", "Ingrese su código", panel, new Verify.CodigoVerifier());
        RenderCedula cedula = new RenderCedula("Cédula:", "Ingrese su cédula", panel, new Verify.CedulaVerifier());
        RenderEntry nombre =new RenderEntry("Nombres:","Ingrese sus nombres", panel, new Verify.MaxLengthVerifier(25));
        RenderEntry apellido =new RenderEntry("Apellidos:","Ingrese sus apellidos", panel, new Verify.MaxLengthVerifier(25));
        RenderCalendar fechaNacimiento =new RenderCalendar("Fecha de nacimiento:", panel);
        RenderEntry lugarNacimiento = new RenderEntry("Lugar de nacimiento:","Ingrese su lugar de nacimiento", panel, new Verify.MaxLengthVerifier(25));
        RenderEntry direccion = new RenderEntry("Dirección de habitación:","Ingrese su dirección de habitación", panel, new Verify.MaxLengthVerifier(100));
        RenderEntry email = new RenderEntry("E-mail:","Ingrese su e-mail", panel, new Verify.EmailVerifier());
        RenderEntry telefono = new RenderEntry("Número de celular:","Ingrese su número de celular", panel, new Verify.TelefonoVerifier());
        RenderGender sexo = new RenderGender(panel);
        RenderBloodType sangre = new RenderBloodType(panel);
        RenderSeparator separator1 = new RenderSeparator("Notas Adicionales:", panel);
        RenderTextArea enfermedades = new RenderTextArea("Enfermedades:", panel, new Verify.MaxLengthAreaVerifier(500));
        RenderTextArea alergias = new RenderTextArea("Alergias:", panel, new Verify.MaxLengthAreaVerifier(500));
        RenderTextArea notas = new RenderTextArea("Otras Notas:", panel, new Verify.MaxLengthAreaVerifier(500));
        
        // add a scrollpanel
        JScrollPane scrollPane = new JScrollPane(panel); //Crear un ScrollPanel
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); //Establecer la barra de desplazamiento vertical
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); //Establecer la barra de desplazamiento horizontal
        this.getContentPane().add(scrollPane); //Agregar el ScrollPanel al content panel   
    }
    private void renderHeader(JPanel MainPanel) {
        JPanel HeaderPanel = new JPanel(); // We create a Panel for the first row
        HeaderPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10)); 
        HeaderPanel.setBackground(Colores.turquoise);
        JLabel label = new JLabel("Formulario para ingresar datos personales");
        label.setFont(new Font("Verdana", Font.PLAIN, 20));
        label.setBounds(0, 0, 640, 50);
        label.setForeground(Color.black);
        label.setBackground(Colores.turquoise);
        label.setOpaque(true);
        HeaderPanel.add(label);
        MainPanel.add(HeaderPanel);
    }
}
