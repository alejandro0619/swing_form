package proyecto.Renderers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import proyecto.Colors;
import proyecto.FondoPanel;

public class RenderSeparator {
        public RenderSeparator(String LabelText, JPanel MainPanel, String src){

        FondoPanel RowPanel = new FondoPanel(src); // We create a Panel for the first row
        RowPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // Set it to FlowLayout so it can be aligned horizontally
        RowPanel.setBackground(Colors.bg);

        //We create the component label
        JLabel CompLabel = new JLabel(LabelText);
        CompLabel.setFont(new Font("Helvetica", Font.ITALIC, 22));
        CompLabel.setBackground(Colors.bg);
        CompLabel.setOpaque(true);
        CompLabel.setForeground(Color.white);
        CompLabel.setHorizontalAlignment(JLabel.CENTER);
        CompLabel.setPreferredSize(new Dimension(270,30));
        RowPanel.add(CompLabel);
        MainPanel.add(RowPanel);
}
}