package proyecto;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class RenderForm {

    public RenderForm(String LabelText, JPanel MainPanel){
        JPanel RowPanel = new JPanel(); // We create a Panel for the first row
        RowPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10)); // Set it to FlowLayout so it can be aligned horizontally
        RowPanel.setBackground(Colores.almond);
    
        JLabel CompLabel = new JLabel(LabelText);
        CompLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
        CompLabel.setBackground(Colores.almond);
        CompLabel.setOpaque(true);
        CompLabel.setHorizontalAlignment(JLabel.CENTER);
    
        // Calculate the width of the widest label
        JLabel widestLabel = new JLabel("Dirección de habitación");
        widestLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
        int widestLabelWidth = widestLabel.getPreferredSize().width;
    
        // Set the preferred size for the label
        CompLabel.setPreferredSize(new Dimension(widestLabelWidth, 30));
    
        JTextField CompField = new JTextField();
        ShowHint.setHint("Ingrese su " + LabelText, CompField);
        CompField.setPreferredSize(new Dimension(250, 30));
        CompField.setFont(new Font("Verdana", Font.PLAIN, 20));
    
        // Add the components to the panel
        RowPanel.add(CompLabel);
        RowPanel.add(CompField);
    
        // Render it to the main frame (panel being rendered)
        MainPanel.add(RowPanel);
    }
        
}
