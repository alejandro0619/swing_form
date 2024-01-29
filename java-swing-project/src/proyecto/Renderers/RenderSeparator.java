package proyecto.Renderers;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import proyecto.Colors;

public class RenderSeparator {
        public RenderSeparator(String LabelText, JPanel MainPanel){

        JPanel RowPanel = new JPanel(); // We create a Panel for the first row
        RowPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10)); // Set it to FlowLayout so it can be aligned horizontally
        RowPanel.setBackground(Colors.almond);
    
        //We create the component label
        JLabel CompLabel = new JLabel(LabelText);
        CompLabel.setFont(new Font("Verdana", Font.ITALIC, 22));
        CompLabel.setBackground(Colors.almond);
        CompLabel.setOpaque(true);
        CompLabel.setHorizontalAlignment(JLabel.RIGHT);
        CompLabel.setPreferredSize(new Dimension(300,30));
        RowPanel.add(CompLabel);
        MainPanel.add(RowPanel);
}
}