package proyecto.Renderers;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FlowLayout;
import proyecto.Colores;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;

public class RenderGender {

    public RenderGender(JPanel MainPanel){
        JPanel RowPanel = new JPanel(); // We create a Panel for the first row
        RowPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10)); // Set it to FlowLayout so it can be aligned horizontally
        RowPanel.setBackground(Colores.almond);
    
        //We create the component label
        JLabel CompLabel = new JLabel("Sexo:");
        CompLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
        CompLabel.setBackground(Colores.almond);
        CompLabel.setOpaque(true);
        CompLabel.setHorizontalAlignment(JLabel.RIGHT);
        CompLabel.setPreferredSize(new Dimension(260,30));
        
    
        JRadioButton masculino=new JRadioButton("Masculino");
        masculino.setBackground(Colores.almond);
        masculino.setPreferredSize(new Dimension(125,30));
            
        JRadioButton femenino=new JRadioButton("Femenino"); 
        femenino.setBackground(Colores.almond);
        femenino.setPreferredSize(new Dimension(120,30));   
        ButtonGroup bg=new ButtonGroup();    
        
        bg.add(masculino);
        bg.add(femenino);    
     
        // Add the components to the panel
        RowPanel.add(CompLabel);
        RowPanel.add(masculino);
        RowPanel.add(femenino);
   
        // Render it to the main frame (panel being rendered)
        MainPanel.add(RowPanel);
    }
         
}
