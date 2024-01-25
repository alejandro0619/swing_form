package proyecto;
import java.awt.*;
import java.net.URL;
import javax.swing.*;


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
        new RenderForm("Código", panel);
        new RenderForm("Cédula", panel);
        new RenderForm("Nombres y Apellidos", panel);
        new RenderForm("Fecha de nacimiento", panel);
        new RenderForm("Lugar de nacimiento", panel);
        new RenderForm("Dirección de habitación", panel);
        new RenderForm("E-mail", panel);
        new RenderForm("Número de celular", panel);

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
        label.setForeground(Color.white);
        label.setBackground(Colores.turquoise);
        label.setOpaque(true);
        HeaderPanel.add(label);
        MainPanel.add(HeaderPanel);
    }
}
