package proyecto.Renderers;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import proyecto.Colors;
import proyecto.ShowHint;
import javax.swing.JPanel;
import javax.swing.InputVerifier;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class RenderID {

    public RenderID(String LabelText, String EntryText, JPanel MainPanel, InputVerifier inputVerifier){
        JPanel RowPanel = new JPanel(); // We create a Panel for the first row
        RowPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10)); // Set it to FlowLayout so it can be aligned horizontally
        RowPanel.setBackground(Colors.bg);
    
        //We create the component label
        JLabel CompLabel = new JLabel(LabelText);
        CompLabel.setFont(new Font("Helvetica", Font.BOLD, 20));
        CompLabel.setBackground(Colors.bg);
        CompLabel.setOpaque(true);
        CompLabel.setHorizontalAlignment(JLabel.RIGHT);
        CompLabel.setPreferredSize(new Dimension(260,30));
        CompLabel.setForeground(Color.white);
        CompLabel.setHorizontalAlignment(JLabel.CENTER);
        //We create the component text 
        JTextField CompField = new JTextField();
        ShowHint.setHint(EntryText,CompField);
        CompField.setPreferredSize(new Dimension(210, 30));
        CompField.setFont(new Font("Verdana", Font.BOLD, 20));
        CompField.setInputVerifier(inputVerifier);
        CompLabel.setForeground(Color.white);
        CompLabel.setHorizontalAlignment(JLabel.CENTER);
        CompField.setBackground(Colors.formbg);
        String tiposCedula[] = {"V","E"};
        JComboBox tipoCedula = new JComboBox(tiposCedula);
        tipoCedula.setPreferredSize(new Dimension(35,30));

    
        // Add the components to the panel
  
        RowPanel.add(CompLabel);
        RowPanel.add(tipoCedula);
        RowPanel.add(CompField);
    
        // Render it to the main frame (panel being rendered)
        MainPanel.add(RowPanel);
    }
        
}
