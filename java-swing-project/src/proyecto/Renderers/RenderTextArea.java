package proyecto.Renderers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FlowLayout;
import proyecto.Colors;


import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.InputVerifier;
import javax.swing.JLabel;

public class RenderTextArea {
 

    public RenderTextArea(String LabelText, JPanel MainPanel, InputVerifier inputVerifier){
        JPanel RowPanel = new JPanel(); // We create a Panel for the first row
        RowPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10)); // Set it to FlowLayout so it can be aligned horizontally
        RowPanel.setBackground(Colors.bg);
    
        //We create the component label
        JLabel CompLabel = new JLabel(LabelText);
        CompLabel.setFont(new Font("Verdana", Font.BOLD, 20));
        CompLabel.setBackground(Colors.bg);
        CompLabel.setOpaque(true);
        CompLabel.setForeground(Color.white);
        CompLabel.setHorizontalAlignment(JLabel.CENTER);
        CompLabel.setPreferredSize(new Dimension(260,30));
    
         // We create the component text 
         JTextArea compField = new JTextArea(3, 20);
        //  compField.setPreferredSize(new Dimension(250, 950));
         JScrollPane areaScrollPane = new JScrollPane(compField);
         compField.setLineWrap(true);
         compField.setWrapStyleWord(true);
         areaScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
         areaScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
         areaScrollPane.setPreferredSize(new Dimension(250, 90)); // Adjust the size here
         compField.setFont(new Font("Helvetica", Font.PLAIN, 20));
         compField.setInputVerifier(inputVerifier);
         compField.setBackground(Colors.formbg);
         // Add the components to the panel
         RowPanel.add(CompLabel);
         RowPanel.add(areaScrollPane); // Add the JScrollPane instead of the JTextArea directly
     
         // Render it to the main frame (panel being rendered)
         MainPanel.add(RowPanel);
    }    
}
