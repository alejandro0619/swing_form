package proyecto;


import java.awt.Graphics;

import java.awt.Image;


import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class FondoPanel extends JPanel {
    private Image imagen;
    private String src;

    public FondoPanel(String src) {
        this.src = src;
    }
    @Override
    public void paint(Graphics g) {
        imagen = new ImageIcon(getClass().getResource(src)).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
        
    }
}