package proyecto;
import java.awt.*;

import java.net.URL;


import javax.swing.*;

import proyecto.Renderers.RenderBloodType;
import proyecto.Renderers.RenderCalendar;
import proyecto.Renderers.RenderID;
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
        this.setMinimumSize(new Dimension(1000,800)); //Establecer el tamaño minimo de la ventana
        this.setMaximumSize(new Dimension(740,612)); //Establecer el tamaño maximo de la ventana
        this.setResizable(false); //Establecer la ventana no modificable en tamaño
        initializeComps(); // llamar componentes
    }
   
    private void initializeComps() {
        FondoPanel panel = new FondoPanel("/resources/bg.png"); //Panel

        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS)); //Centrar panel

        renderHeader(panel);
        // Estudiante
        
        new RenderSeparator("Datos del estudiante:", panel, "/resources/separatorbg.png");

        new RenderEntry("Código:", "Ingrese el código de estudiante", panel, new Verify.CodigoVerifier());
        new RenderID("Cédula:", "Ingrese la cédula del estudiante", panel, new Verify.CedulaVerifier());
        new RenderEntry("Nombres:","Ingrese los nombres del estudiante", panel, new Verify.MaxLengthVerifier(25));
        new RenderEntry("Apellidos:","Ingrese los apellidos del estudiante", panel, new Verify.MaxLengthVerifier(25));

        new RenderCalendar("Fecha de nacimiento:", panel, new Verify.CalendarVerifier());
        new RenderEntry("Lugar de nacimiento:","Ingrese el lugar de nacimiento del estudiante", panel, new Verify.MaxLengthVerifier(25));
        new RenderEntry("Dirección de habitación:","Ingrese la dirección del estudiante", panel, new Verify.MaxLengthVerifier(100));
        new RenderEntry("E-mail:","Ingrese el e-mail del estudiante", panel, new Verify.EmailVerifier());
        new RenderEntry("Número de celular:","Ingrese el número de celular del estudiante", panel, new Verify.TelefonoVerifier());
        new RenderGender(panel);
        new RenderBloodType(panel);

        new RenderSeparator("Notas Adicionales:", panel, "/resources/separatorbg.png");
        new RenderTextArea("Enfermedades:", panel, new Verify.MaxLengthAreaVerifier(500));
        new RenderTextArea("Alergias:", panel, new Verify.MaxLengthAreaVerifier(500));
        new RenderTextArea("Otras Notas:", panel, new Verify.MaxLengthAreaVerifier(500));

        // Padre
        new RenderSeparator("Datos del padre: ", panel, "/resources/separatorbg.png");

        new RenderID("Cédula:", "Ingrese la cédula del padre", panel, new Verify.CedulaVerifier());
        new RenderEntry("Nombres:","Ingrese los nombres del padre", panel, new Verify.MaxLengthVerifier(25));
        new RenderEntry("Apellidos:","Ingrese los apellidos del padre", panel, new Verify.MaxLengthVerifier(25));
        new RenderEntry("Número de celular:","Ingrese el número de celular del padre", panel, new Verify.TelefonoVerifier());

        // Madre
        new RenderSeparator("Datos de la madre:", panel, "/resources/separatorbg.png");

        new RenderID("Cédula:", "Ingrese la cédula de la madre", panel, new Verify.CedulaVerifier());
        new RenderEntry("Nombres:","Ingrese los nombres de la madre", panel, new Verify.MaxLengthVerifier(25));
        new RenderEntry("Apellidos:","Ingrese los apellidos de la madre", panel, new Verify.MaxLengthVerifier(25));
        new RenderEntry("Número de celular:","Ingrese el número de celular de la madre", panel, new Verify.TelefonoVerifier());

        // footer
        new RenderSeparator("", panel, "/resources/footer.png");

        // add a scrollpanel
        JScrollPane scrollPane = new JScrollPane(panel); //Crear un ScrollPanel
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); //Establecer la barra de desplazamiento vertical
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); //Establecer la barra de desplazamiento horizontal
        this.getContentPane().add(scrollPane); //Agregar el ScrollPanel al content panel   
    }

    private void renderHeader(FondoPanel MainPanel) {
        FondoPanel HeaderPanel = new FondoPanel("/resources/header.png"); // We create a Panel for the first row
        HeaderPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30)); 
        HeaderPanel.setBackground(Colors.headerbg);
        // JLabel label = new JLabel("FORMULARIO DE DATOS PERSONALES");
        // label.setFont(new Font("Verdana", Font.BOLD, 20));
        // label.setBounds(0, 0, 640, 50);
        // label.setForeground(Color.white);
        // label.setBackground(Colors.headerbg);
        // label.setOpaque(true);
        //HeaderPanel.add(label);
        MainPanel.setBackground(Colors.transBlue);
       
        MainPanel.add(HeaderPanel);
    }

}
